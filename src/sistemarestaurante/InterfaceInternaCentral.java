/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import javax.swing.DefaultListModel;
/**
 *
 * @author edamiani
 */
public class InterfaceInternaCentral {

        private FrameCentral frameCentral;
        private static InterfaceInternaCentral inter = null;
        public ControleMesa controle;

        private InterfaceInternaCentral()
        {
           frameCentral = FrameCentral.getInstancia();
        }

        public static InterfaceInternaCentral getInstancia()
        {
            /*if (frameCentral == null)
                frameCentral = new FrameCentral();
            return frameCentral;*/
            if (inter == null)
                inter = new InterfaceInternaCentral();
            return inter;
        }

        public void livreParaOcupada(ControleMesa controle)
        {
            frameCentral.setOcupada(controle);
        }

        public void livreParaReservada(ControleMesa controle)
        {
            frameCentral.setReservada(controle);
        }
        
        public void ocupadaParaLivre(ControleMesa controle)
        {
            frameCentral.setLivre(controle);
        }

        public void vincularMesasOcupadas(Ocupacao ocupacao, DefaultListModel lista)
        {
            frameCentral.vincularMesasOcupadas(ocupacao, lista);
            System.out.println("oi");
        }
}
