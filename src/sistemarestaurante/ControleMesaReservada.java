/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author edamiani
 */
public class ControleMesaReservada extends ControleMesa{

    private Reserva reserva;
    private Mesa mesaReservada;
    private ArrayList<Mesa> mesasVinculadas;
    private MenuMesaReservada menuReservada;

    public ControleMesaReservada(int x, int y, int width, int height, 
            int numeroControle, Reserva reserva, DefaultListModel lista, 
            ArrayList<Mesa> mesasVinculadas)
    {
        super(x, y, width, height);
        mesaPanel.setBackground(new Color(255, 255, 153));
        numeroMesaLabel.setText("" + numeroControle);
        
        mesasVinculadas = new ArrayList<Mesa>();
        mesaReservada = new Mesa(numeroControle);
        mesasVinculadas.add(mesaReservada);
        
        mesaReservada = new Mesa(numeroControle);
        //reserva.addMesa(mesaReservada);
        this.menuReservada = MenuMesaReservada.getInstancia(numeroControle, this);
        
        mesaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaMouseClicked(evt);
            }
        });
    }
    
        /**
     * Método responsável por clicar no painel na interface.
     * @param Mouse event.
     */
    private void mesaMouseClicked(java.awt.event.MouseEvent evt)
    {
        //livre.setLocation(getPainel().getX(), getPainel().getY());
        menuReservada.setLocation(new Point(getPainel().getX(), getPainel().getY()));
        System.out.println("X: " + getPainel().getX() + ",Y: " + getPainel().getY());

        menuReservada.setNumMesaTextField(getNumControle() + "");
        //System.out.println("horario oc: " + ocupacao.getHorarioOcupacao());
        //menuOcupada.setHorarioOcupacaoTextField(ocupacao.getHorarioOcupacao());
        menuReservada.setVisible(true);
        //livre.
    }

}
