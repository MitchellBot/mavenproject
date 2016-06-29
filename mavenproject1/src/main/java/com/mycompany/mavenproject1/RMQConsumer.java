/*
 * Copyright (C) 2016 Yaakov.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package com.mycompany.mavenproject1;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yaakov
 */
class RMQConsumer implements IRMQConsumer {

    public RMQConsumer() {
    }

    private String message = "";
    private Connection connection;
    private Channel channel;

    /**
     * Returns the message at the top of a given queue without acknowledging it
     *
     * @return
     */
    @SuppressWarnings({"override", "null"})
    public String getMessage(String queue) {

        message = "";
        
        createChannel(queue);
        Consumer consumer = null;

        if (channel.isOpen()) {
            consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                        throws IOException {

                    message = new String(body, "UTF-8");
                }
            };
        } else {
            Logger.getLogger(RMQConsumer.class.getName()).log(Level.SEVERE, "channel.isopen was false!");
        }
        while (message.equals("")) {
            try {
                channel.basicConsume(queue, false, consumer);
            } catch (IOException ex) {
                Logger.getLogger(RMQConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        destroyChannel();
        return message;
    }

    private void createChannel(String queue) {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            connection = factory.newConnection();
            channel = connection.createChannel();
            channel.queueDeclare(queue, false, false, false, null);
        } catch (IOException ex) {
            Logger.getLogger(RMQConsumer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TimeoutException ex) {
            Logger.getLogger(RMQConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void destroyChannel() {
        try {
            channel.close();
            connection.close();
        } catch (IOException ex) {
            Logger.getLogger(RMQConsumer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TimeoutException ex) {
            Logger.getLogger(RMQConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns and acknowledges the message at the top of a given queue
     *
     * @return
     */
    @SuppressWarnings("override")
    public String ackMessage(String queue) {

        //make sure message var is empty
        message = "";
        
        createChannel(queue);
        try {
            channel.basicQos(1);
        } catch (IOException ex) {
            Logger.getLogger(RMQConsumer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        final Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body)
                    throws IOException {
                {
                    message = new String(body, "UTF-8");
                    
                    channel.basicAck(envelope.getDeliveryTag(), false);
                }
            }
        };

        
            try {
                channel.basicConsume(queue, false, consumer);
            } catch (IOException ex) {
                Logger.getLogger(RMQConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        while (message.equals("")) {
        
        }
        destroyChannel();
        return message;
    }

}
