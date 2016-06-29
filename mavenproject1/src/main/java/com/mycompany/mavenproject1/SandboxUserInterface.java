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

/**
 *
 * @author Yaakov
 */
public class SandboxUserInterface extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SandboxUserInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jSendPanel = new javax.swing.JPanel();
        jSendMessageTxtBox = new javax.swing.JTextField();
        jSendBtn = new javax.swing.JButton();
        jReceivePanel = new javax.swing.JPanel();
        jRecvMessageTxtBox = new javax.swing.JTextField();
        jAckMessageBtn = new javax.swing.JButton();
        jGetMessageBtn = new javax.swing.JButton();
        jConnectPanel = new javax.swing.JPanel();
        jQueueTxtBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sandbox");
        setType(java.awt.Window.Type.UTILITY);

        jSendPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(158, 158, 158)));

        jSendMessageTxtBox.setText("Message to Send...");
        jSendMessageTxtBox.setMinimumSize(new java.awt.Dimension(120, 28));
        jSendMessageTxtBox.setPreferredSize(new java.awt.Dimension(240, 28));
        jSendMessageTxtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSendMessageTxtBoxActionPerformed(evt);
            }
        });
        jSendPanel.add(jSendMessageTxtBox);

        jSendBtn.setText("Send");
        jSendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSendBtnActionPerformed(evt);
            }
        });
        jSendPanel.add(jSendBtn);

        jTabbedPane.addTab("Send", jSendPanel);

        jReceivePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        jAckMessageBtn.setText("Ack Message");
        jAckMessageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAckMessageBtnActionPerformed(evt);
            }
        });

        jGetMessageBtn.setText("Get Message");
        jGetMessageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGetMessageBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jReceivePanelLayout = new javax.swing.GroupLayout(jReceivePanel);
        jReceivePanel.setLayout(jReceivePanelLayout);
        jReceivePanelLayout.setHorizontalGroup(
            jReceivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jReceivePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRecvMessageTxtBox)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jReceivePanelLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addGroup(jReceivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jGetMessageBtn)
                    .addComponent(jAckMessageBtn))
                .addGap(143, 143, 143))
        );
        jReceivePanelLayout.setVerticalGroup(
            jReceivePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jReceivePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRecvMessageTxtBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jGetMessageBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jAckMessageBtn)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Receive", jReceivePanel);

        jQueueTxtBox.setText("Queue");
        jQueueTxtBox.setPreferredSize(new java.awt.Dimension(100, 28));
        jConnectPanel.add(jQueueTxtBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jConnectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jConnectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("Send");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSendBtnActionPerformed
        IRMQProducer irqp = new RMQProducer();
        irqp.sendMessage(this.jSendMessageTxtBox.getText(), this.jQueueTxtBox.getText());
    }//GEN-LAST:event_jSendBtnActionPerformed

    private void jSendMessageTxtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSendMessageTxtBoxActionPerformed
        this.jSendMessageTxtBox.setText(null);
    }//GEN-LAST:event_jSendMessageTxtBoxActionPerformed

    private void jAckMessageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAckMessageBtnActionPerformed
        IRMQConsumer irmqc = new RMQConsumer();
        String message = irmqc.ackMessage(this.jQueueTxtBox.getText());
        this.jRecvMessageTxtBox.setText(message);
    }//GEN-LAST:event_jAckMessageBtnActionPerformed

    private void jGetMessageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGetMessageBtnActionPerformed
        IRMQConsumer irmqc = new RMQConsumer();
        String message = irmqc.getMessage(this.jQueueTxtBox.getText());
        this.jRecvMessageTxtBox.setText(message);
    }//GEN-LAST:event_jGetMessageBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SandboxUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SandboxUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SandboxUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SandboxUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SandboxUserInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAckMessageBtn;
    private javax.swing.JPanel jConnectPanel;
    private javax.swing.JButton jGetMessageBtn;
    private javax.swing.JTextField jQueueTxtBox;
    private javax.swing.JPanel jReceivePanel;
    private javax.swing.JTextField jRecvMessageTxtBox;
    private javax.swing.JButton jSendBtn;
    private javax.swing.JTextField jSendMessageTxtBox;
    private javax.swing.JPanel jSendPanel;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables
}
