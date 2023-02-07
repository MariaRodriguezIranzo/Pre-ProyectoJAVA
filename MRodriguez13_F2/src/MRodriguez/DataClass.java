/*
Espacio de datos comunes
 */
package MRodriguez;

import javax.swing.JFrame;


public class DataClass {

    public static JFrame JF1= new JFrameMain();
    public static JFrame JF2 = new JFrameMain2();
    public static JFrame JF3 = new JFrameMain3();
    public static JFrame JF5 = new JFrameMain4();
    public static JFrame JF4 = new JFrameMainMenu();
   

    public static void gotoAnotherJFrame(JFrame jfO, JFrame jfD) {
        jfD.setVisible(true);
        jfO.setVisible(false);
    }

    static void gotoNotherJframe(JFrameMain aThis, JFrame JF3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
