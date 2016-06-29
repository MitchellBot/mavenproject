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

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yaakov
 */
class RMQProducer implements IRMQProducer{
    
    public RMQProducer()
    {

    }
    
    //TODO: figure out why this is asking to override the interface method
    @SuppressWarnings("override") 
        public void sendMessage(String message, String queue)
    {
        try
        {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel c = connection.createChannel();
        c.queueDeclare(queue, false, false, false, null);
        c.basicPublish("", queue,null,message.getBytes());
        }
        catch (java.io.IOException ex)
        {
            Logger.getLogger(SandboxUserInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TimeoutException ex) {
            Logger.getLogger(RMQProducer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
