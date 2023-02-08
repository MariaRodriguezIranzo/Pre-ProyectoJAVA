/*
Fase 2 : 07/11/2022
1-Jframe dar de alta un@ peluquer@, modificar, Borrar
2-JFrame poner precios servicios
3- Abouty mas
*/

package MRodriguez;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class JFrameMain extends javax.swing.JFrame {

    String ok = "";
  
    public JFrameMain() {
        initComponents();
        initConfig();
    }

    private void initConfig() {
       DataClass.JF1 =this;
          Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //Factor de forma
        int FF = 80;
        int screenHeigth = (int) screenSize.getHeight();
        int screenWidth = (int) screenSize.getWidth();

        this.setSize(screenWidth * FF / 100, screenHeigth * FF / 100);
        this.setLocationRelativeTo(getComponentAt(screenWidth * FF / 100, screenHeigth * FF / 100));

        //Ponemos el panel centrado en el medio de la ventana
        int panelX = (getWidth() - jPanelMain.getWidth() - getInsets().left - getInsets().right) / 2;
        int panelY = ((getHeight() - jPanelMain.getHeight() - getInsets().top - getInsets().bottom) / 2);

        jPanelMain.setLocation(panelX, panelY);
        getContentPane().setBackground(new Color(133, 47, 178));

//        getContentPane().setBackground(new Color(190, 140, 217));
        this.setLocationRelativeTo(this);

        jPanelMain.setBackground(new Color(190, 140, 217));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUser = new javax.swing.JTextField();
        jButtonLogin1 = new javax.swing.JButton();
        jTextFieldPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanelMain.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Password:");
        jPanelMain.add(jLabel1);
        jLabel1.setBounds(80, 330, 90, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("User: ");
        jPanelMain.add(jLabel2);
        jLabel2.setBounds(90, 270, 60, 20);

        jTextFieldUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanelMain.add(jTextFieldUser);
        jTextFieldUser.setBounds(180, 260, 320, 40);

        jButtonLogin1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/iniciar-sesion.png"))); // NOI18N
        jButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin1ActionPerformed(evt);
            }
        });
        jPanelMain.add(jButtonLogin1);
        jButtonLogin1.setBounds(70, 400, 160, 60);
        jPanelMain.add(jTextFieldPassword);
        jTextFieldPassword.setBounds(180, 320, 320, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanelMain.add(jLabel4);
        jLabel4.setBounds(160, 20, 250, 220);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MRodriguez/Resources/exit.png"))); // NOI18N
        jButton1.setText("EXIT           ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelMain.add(jButton1);
        jButton1.setBounds(340, 400, 160, 60);

        getContentPane().add(jPanelMain);
        jPanelMain.setBounds(30, 20, 570, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin1ActionPerformed
        String Usuario, Password, Control;
        Control = "Login";
        Usuario= jTextFieldUser.getText();
        Password = jTextFieldPassword.getText();
        try { 
            functionCRUDLOGIN(Control,Password,Usuario);
            
            if(ok.equals("11")){
                  DataClass.gotoAnotherJFrame(this,DataClass.JF4);
            }
            else if(ok.equals("51")){ 
                JOptionPane.showMessageDialog(null, "Try Again", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLogin1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
       System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }
    
    private String functionCRUDLOGIN(String Control, String password, String user) throws MalformedURLException, IOException  {
        String phpFileName = "controllerDB.php";
        String path = "http://localhost/M13/P1/";
        
        String query = "";
        query += "?Control=" + Control;
        query += "&D01=" + user;
        query += "&D02=" + password;


        String urlLink = path + phpFileName + query;
        URL url = new URL(urlLink);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line = in.readLine()) != null) {
            sb.append(line);
            System.out.println(line);
            ok = line;
        }
        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPasswordField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldUser;
    // End of variables declaration//GEN-END:variables
}
