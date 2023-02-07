/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MRodriguez;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class JFrameMainMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMainMenu
     */
    public JFrameMainMenu() {
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
        jLabelSystemMenu = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabelSystemMenu.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelSystemMenu.setForeground(new java.awt.Color(204, 204, 204));
        jLabelSystemMenu.setText("System Menu");
        jPanel1.add(jLabelSystemMenu);
        jLabelSystemMenu.setBounds(190, 30, 300, 80);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/exit.png"))); // NOI18N
        jButton1.setText("EXIT           ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 440, 600, 90);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/agregar-usuario.png"))); // NOI18N
        jButton2.setText("Users    ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(40, 140, 600, 90);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/productos.png"))); // NOI18N
        jButton3.setText("Products");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(40, 240, 600, 90);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/AboutMe.png"))); // NOI18N
        jButton4.setText("About Me");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(40, 340, 600, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 30, 690, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DataClass.gotoAnotherJFrame(this,DataClass.JF1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       DataClass.gotoAnotherJFrame(this,DataClass.JF5);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DataClass.gotoAnotherJFrame(this,DataClass.JF2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DataClass.gotoAnotherJFrame(this,DataClass.JF3);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabelSystemMenu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
