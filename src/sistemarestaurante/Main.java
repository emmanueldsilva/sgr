/*
 * Main.java
 *
 * Created on 5 de Setembro de 2008, 08:28
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.util.Arrays;
import sun.reflect.ReflectionFactory;

/**
 *
 * @author edamiani
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            /*FrameCentral frameCentral = new FrameCentral();
            frameCentral.setVisible(true);
            frameCentral.instanciaMesas();*/
            
            Login login = new Login();
            login.setVisible(true);
                
//                FrameCentral programa;
//                programa = FrameCentral.getInstancia();
//                programa.setVisible(true);
//                programa.instanciaMesas();
            }
        });
    }
    
}
