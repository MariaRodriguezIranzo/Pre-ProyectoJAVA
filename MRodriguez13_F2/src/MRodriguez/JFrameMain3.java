package MRodriguez;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import java.io.IOException;

public class JFrameMain3 extends javax.swing.JFrame {

    public JFrameMain3() {
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

        this.setLocationRelativeTo(this);

        jPanel1.setBackground(new Color(190, 140, 217));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldHaircutKid = new javax.swing.JTextField();
        jTextFieldWashKid = new javax.swing.JTextField();
        jTextFieldHairStyleKid = new javax.swing.JTextField();
        jTextFieldDyeKid = new javax.swing.JTextField();
        jTextFieldWashWomen = new javax.swing.JTextField();
        jTextFieldhaircutWomen = new javax.swing.JTextField();
        jTextFieldHairStyleWomen = new javax.swing.JTextField();
        jTextFieldDyeWomen = new javax.swing.JTextField();
        jTextFieldPermWoman = new javax.swing.JTextField();
        jTextFieldWashMen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldHaircutMan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldHairStyleMan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDyeMan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPermMan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButtonSetPriceMan = new javax.swing.JButton();
        jButtonSetPriceKids = new javax.swing.JButton();
        jButtonSetPriceWomen = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jTextFieldIdKid1 = new javax.swing.JTextField();
        jTextFieldIdWomen1 = new javax.swing.JTextField();
        jTextFieldIdMen1 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        jPanel1.add(jTextFieldHaircutKid);
        jTextFieldHaircutKid.setBounds(150, 150, 64, 30);
        jPanel1.add(jTextFieldWashKid);
        jTextFieldWashKid.setBounds(150, 110, 64, 30);
        jPanel1.add(jTextFieldHairStyleKid);
        jTextFieldHairStyleKid.setBounds(150, 190, 64, 30);
        jPanel1.add(jTextFieldDyeKid);
        jTextFieldDyeKid.setBounds(150, 230, 64, 30);
        jPanel1.add(jTextFieldWashWomen);
        jTextFieldWashWomen.setBounds(310, 110, 64, 30);
        jPanel1.add(jTextFieldhaircutWomen);
        jTextFieldhaircutWomen.setBounds(310, 150, 64, 30);
        jPanel1.add(jTextFieldHairStyleWomen);
        jTextFieldHairStyleWomen.setBounds(310, 190, 64, 30);
        jPanel1.add(jTextFieldDyeWomen);
        jTextFieldDyeWomen.setBounds(310, 230, 64, 30);
        jPanel1.add(jTextFieldPermWoman);
        jTextFieldPermWoman.setBounds(310, 270, 64, 30);
        jPanel1.add(jTextFieldWashMen);
        jTextFieldWashMen.setBounds(480, 110, 64, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Services");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 40, 70, 20);
        jPanel1.add(jTextFieldHaircutMan);
        jTextFieldHaircutMan.setBounds(480, 150, 64, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Wash");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 110, 100, 25);
        jPanel1.add(jTextFieldHairStyleMan);
        jTextFieldHairStyleMan.setBounds(480, 190, 64, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Haircut");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 150, 90, 25);
        jPanel1.add(jTextFieldDyeMan);
        jTextFieldDyeMan.setBounds(480, 230, 64, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Dye");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 230, 90, 25);
        jPanel1.add(jTextFieldPermMan);
        jTextFieldPermMan.setBounds(480, 270, 64, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Perm");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 270, 100, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Kids");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 40, 100, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Hairstyle");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 190, 90, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Man");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(480, 40, 130, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Women");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 40, 130, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KIDS", "MEN", "WOMEN", " " }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(20, 330, 72, 30);

        jButtonSetPriceMan.setText("Delete price");
        jButtonSetPriceMan.setActionCommand("Set price ");
        jButtonSetPriceMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetPriceManActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSetPriceMan);
        jButtonSetPriceMan.setBounds(450, 330, 120, 31);

        jButtonSetPriceKids.setText("Set price ");
        jButtonSetPriceKids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetPriceActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSetPriceKids);
        jButtonSetPriceKids.setBounds(120, 330, 120, 31);

        jButtonSetPriceWomen.setText("Update price ");
        jButtonSetPriceWomen.setActionCommand("Set price ");
        jButtonSetPriceWomen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetPriceWomenActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSetPriceWomen);
        jButtonSetPriceWomen.setBounds(280, 330, 120, 31);

        jLabelID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(204, 204, 204));
        jLabelID.setText("ID");
        jPanel1.add(jLabelID);
        jLabelID.setBounds(30, 70, 100, 30);
        jPanel1.add(jTextFieldIdKid1);
        jTextFieldIdKid1.setBounds(150, 70, 64, 30);
        jPanel1.add(jTextFieldIdWomen1);
        jTextFieldIdWomen1.setBounds(310, 70, 64, 30);
        jPanel1.add(jTextFieldIdMen1);
        jTextFieldIdMen1.setBounds(480, 70, 64, 30);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/atras.png"))); // NOI18N
        jButton9.setText("BACK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(600, 160, 170, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 830, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSetPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetPriceActionPerformed
        int id=0,Wash = 0, haircut = 0, hairstyle = 0, dye = 0, perm = 0;
        if (jComboBox1.getSelectedIndex() == 0) {
            id= Integer.parseInt(jTextFieldIdKid1.getText());
            Wash = Integer.parseInt(jTextFieldWashKid.getText());
            haircut = Integer.parseInt(jTextFieldHaircutKid.getText());
            hairstyle = Integer.parseInt(jTextFieldHairStyleKid.getText());
            dye = Integer.parseInt(jTextFieldDyeKid.getText());
            perm = 0;
            try {
                String Control = "Create3";
                ClassConnection.functionCRUD2(Control, id,Wash, haircut, hairstyle, dye, perm);
            } catch (IOException ex) {

            }
        }

        if (jComboBox1.getSelectedIndex() == 1) {
            id= Integer.parseInt(jTextFieldIdMen1.getText());
            Wash = Integer.parseInt(jTextFieldWashMen.getText());
            haircut = Integer.parseInt(jTextFieldHaircutMan.getText());
            hairstyle = Integer.parseInt(jTextFieldHairStyleMan.getText());
            dye = Integer.parseInt(jTextFieldDyeMan.getText());
            perm = Integer.parseInt(jTextFieldPermMan.getText());
            try {
                String Control = "Create4";
                ClassConnection.functionCRUD2(Control,id,Wash, haircut, hairstyle, dye, perm);
            } catch (IOException ex) {

            }
        }

        if (jComboBox1.getSelectedIndex() == 2) {
            id= Integer.parseInt(jTextFieldIdWomen1.getText());
            Wash = Integer.parseInt(jTextFieldWashWomen.getText());
            haircut = Integer.parseInt(jTextFieldhaircutWomen.getText());
            hairstyle = Integer.parseInt(jTextFieldHairStyleWomen.getText());
            dye = Integer.parseInt(jTextFieldDyeWomen.getText());
            perm = Integer.parseInt(jTextFieldPermWoman.getText());

            try {
                String Control = "Create5";
                ClassConnection.functionCRUD2(Control,id,Wash, haircut, hairstyle, dye, perm);
            } catch (IOException ex) {

            }
        }

    }//GEN-LAST:event_jButtonSetPriceActionPerformed

    private void jButtonSetPriceWomenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetPriceWomenActionPerformed
           int id=0,Wash = 0, haircut = 0, hairstyle = 0, dye = 0, perm = 0;
        if (jComboBox1.getSelectedIndex() == 0) {
            id= Integer.parseInt(jTextFieldIdKid1.getText());
            Wash = Integer.parseInt(jTextFieldWashKid.getText());
            haircut = Integer.parseInt(jTextFieldHaircutKid.getText());
            hairstyle = Integer.parseInt(jTextFieldHairStyleKid.getText());
            dye = Integer.parseInt(jTextFieldDyeKid.getText());
            perm = 0;
            try {
                String Control = "Update3";
                ClassConnection.functionCRUD2(Control, id,Wash, haircut, hairstyle, dye, perm);
            } catch (IOException ex) {

            }
        }

        if (jComboBox1.getSelectedIndex() == 1) {
            id= Integer.parseInt(jTextFieldIdMen1.getText());
            Wash = Integer.parseInt(jTextFieldWashMen.getText());
            haircut = Integer.parseInt(jTextFieldHaircutMan.getText());
            hairstyle = Integer.parseInt(jTextFieldHairStyleMan.getText());
            dye = Integer.parseInt(jTextFieldDyeMan.getText());
            perm = Integer.parseInt(jTextFieldPermMan.getText());
            try {
                String Control = "Update4";
                ClassConnection.functionCRUD2(Control,id,Wash, haircut, hairstyle, dye, perm);
            } catch (IOException ex) {

            }
        }

        if (jComboBox1.getSelectedIndex() == 2) {
            id= Integer.parseInt(jTextFieldIdWomen1.getText());
            Wash = Integer.parseInt(jTextFieldWashWomen.getText());
            haircut = Integer.parseInt(jTextFieldhaircutWomen.getText());
            hairstyle = Integer.parseInt(jTextFieldHairStyleWomen.getText());
            dye = Integer.parseInt(jTextFieldDyeWomen.getText());
            perm = Integer.parseInt(jTextFieldPermWoman.getText());

            try {
                String Control = "Update5";
                ClassConnection.functionCRUD2(Control,id,Wash, haircut, hairstyle, dye, perm);
            } catch (IOException ex) {

            }
        }
    }//GEN-LAST:event_jButtonSetPriceWomenActionPerformed

    private void jButtonSetPriceManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetPriceManActionPerformed
                  int id=0,Wash = 0, haircut = 0, hairstyle = 0, dye = 0, perm = 0;
        if (jComboBox1.getSelectedIndex() == 0) {
            id= Integer.parseInt(jTextFieldIdKid1.getText());
            Wash = Integer.parseInt(jTextFieldWashKid.getText());
            haircut = Integer.parseInt(jTextFieldHaircutKid.getText());
            hairstyle = Integer.parseInt(jTextFieldHairStyleKid.getText());
            dye = Integer.parseInt(jTextFieldDyeKid.getText());
            perm = 0;
            try {
                String Control = "Delete3";
                ClassConnection.functionCRUD2(Control, id,Wash, haircut, hairstyle, dye, perm);
            } catch (IOException ex) {

            }
        }

        if (jComboBox1.getSelectedIndex() == 1) {
            id= Integer.parseInt(jTextFieldIdMen1.getText());
            Wash = Integer.parseInt(jTextFieldWashMen.getText());
            haircut = Integer.parseInt(jTextFieldHaircutMan.getText());
            hairstyle = Integer.parseInt(jTextFieldHairStyleMan.getText());
            dye = Integer.parseInt(jTextFieldDyeMan.getText());
            perm = Integer.parseInt(jTextFieldPermMan.getText());
            try {
                String Control = "Delete4";
                ClassConnection.functionCRUD2(Control,id,Wash, haircut, hairstyle, dye, perm);
            } catch (IOException ex) {

            }
        }

        if (jComboBox1.getSelectedIndex() == 2) {
            id= Integer.parseInt(jTextFieldIdWomen1.getText());
            Wash = Integer.parseInt(jTextFieldWashWomen.getText());
            haircut = Integer.parseInt(jTextFieldhaircutWomen.getText());
            hairstyle = Integer.parseInt(jTextFieldHairStyleWomen.getText());
            dye = Integer.parseInt(jTextFieldDyeWomen.getText());
            perm = Integer.parseInt(jTextFieldPermWoman.getText());

            try {
                String Control = "Delete5";
                ClassConnection.functionCRUD2(Control,id,Wash, haircut, hairstyle, dye, perm);
            } catch (IOException ex) {

            }
        }
    }//GEN-LAST:event_jButtonSetPriceManActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DataClass.gotoAnotherJFrame(this,DataClass.JF4);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMain3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonSetPriceKids;
    private javax.swing.JButton jButtonSetPriceMan;
    private javax.swing.JButton jButtonSetPriceWomen;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldDyeKid;
    private javax.swing.JTextField jTextFieldDyeMan;
    private javax.swing.JTextField jTextFieldDyeWomen;
    private javax.swing.JTextField jTextFieldHairStyleKid;
    private javax.swing.JTextField jTextFieldHairStyleMan;
    private javax.swing.JTextField jTextFieldHairStyleWomen;
    private javax.swing.JTextField jTextFieldHaircutKid;
    private javax.swing.JTextField jTextFieldHaircutMan;
    private javax.swing.JTextField jTextFieldIdKid1;
    private javax.swing.JTextField jTextFieldIdMen1;
    private javax.swing.JTextField jTextFieldIdWomen1;
    private javax.swing.JTextField jTextFieldPermMan;
    private javax.swing.JTextField jTextFieldPermWoman;
    private javax.swing.JTextField jTextFieldWashKid;
    private javax.swing.JTextField jTextFieldWashMen;
    private javax.swing.JTextField jTextFieldWashWomen;
    private javax.swing.JTextField jTextFieldhaircutWomen;
    // End of variables declaration//GEN-END:variables
}
