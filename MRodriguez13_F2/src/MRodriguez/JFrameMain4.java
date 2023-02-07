/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MRodriguez;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class JFrameMain4 extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMain4
     */
    public JFrameMain4() {
        initComponents();
        initConfig();
    }

    private void initConfig() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //Factor de forma
        int FF = 80;
        int screenHeigth = (int) screenSize.getHeight();
        int screenWidth = (int) screenSize.getWidth();

        this.setSize(screenWidth * FF / 100, screenHeigth * FF / 100);
        this.setLocationRelativeTo(getComponentAt(screenWidth * FF / 100, screenHeigth * FF / 100));

        //Ponemos el panel centrado en el medio de la ventana
        int panelX = (getWidth() - jPanel1.getWidth() - getInsets().left - getInsets().right) / 2;
        int panelY = ((getHeight() - jPanel1.getHeight() - getInsets().top - getInsets().bottom) / 2);

        jPanel1.setLocation(panelX, panelY);
        getContentPane().setBackground(new Color(133, 47, 178));

//        getContentPane().setBackground(new Color(190, 140, 217));
        this.setLocationRelativeTo(this);

        jPanel1.setBackground(new Color(190, 140, 217));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("MARIA RODRIGUEZ IRANZO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 40, 455, 48);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/atras.png"))); // NOI18N
        jButton9.setText("BACK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(680, 230, 170, 70);

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/atras.png"))); // NOI18N
        jButton10.setText("BACK");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(200, 460, 170, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/Sin título.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 90, 290, 370);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 20, 600, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        DataClass.gotoAnotherJFrame(this,DataClass.JF4);
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMain4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
