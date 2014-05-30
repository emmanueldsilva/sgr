/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.util.ArrayList;

/**
 *
 * @author Usu�rio
 */
public class ContextoReserva {

    private Reserva reserva;
    private ArrayList<Mesa> mesasVinculadas;
    public ContextoReserva(Reserva reserva, ArrayList<Mesa> mesasVinculadas)
    {
        this.reserva = reserva;
        this.mesasVinculadas = mesasVinculadas;
    }
    
    public Reserva getReserva()
    {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public ArrayList<Mesa> getMesasVinculadas() {
        return mesasVinculadas;
    }

    public void setMesasVinculadas(ArrayList<Mesa> mesasVinculadas) {
        this.mesasVinculadas = mesasVinculadas;
    }
    
    
}
