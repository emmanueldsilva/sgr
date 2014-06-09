/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

/**
 *
 * @author filaboia
 */
public class FrameUtils {
    
    public static void centralizarInterface(javax.swing.JFrame janela) {  
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        int componentWidth = janela.getWidth();
        int componentHeight = janela.getHeight();
        janela.setBounds((screenSize.width-componentWidth)/2, (screenSize.height-componentHeight)/2, componentWidth, componentHeight);
    }
    
}
