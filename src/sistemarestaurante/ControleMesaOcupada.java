/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;


import java.awt.Point;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
/**
 *
 * @author edamiani
 */
public class ControleMesaOcupada extends ControleMesa{

    private MenuMesaOcupada menuOcupada;
    private Ocupacao ocupacao;
    private Mesa mesaOcupada;
    private ArrayList<Mesa> mesasVinculadas;
    
    public ControleMesaOcupada(int x, int y, int width, int height, int numeroControle, 
            Ocupacao ocupacao, DefaultListModel lista)
    {
        super(x, y, width, height);
        mesaPanel.setBackground(new java.awt.Color(255, 153, 153));
        numeroMesaLabel.setText("" + numeroControle);
        setStatus(1);

        mesasVinculadas = new ArrayList<Mesa>();
        this.mesaOcupada = new Mesa(numeroControle);
        mesasVinculadas.add(mesaOcupada);
        //this.ocupacao = new Ocupacao(mesasVinculadas);
        this.ocupacao = ocupacao;
        //this.menuOcupada = new MenuMesaOcupada(this);
        menuOcupada = MenuMesaOcupada.getInstancia(numeroControle, this, ocupacao, lista);
        


        //mesaPanel.setVisible(true);
        mesaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaMouseClicked(evt);
            }
        });
    }
    
    /**
     * M�todo respons�vel por clicar no painel na interface.
     * @param Mouse event.
     */
    private void mesaMouseClicked(java.awt.event.MouseEvent evt)
    {
        //livre.setLocation(getPainel().getX(), getPainel().getY());
        menuOcupada.setLocation(new Point(getPainel().getX(), getPainel().getY()));
        System.out.println("X: " + getPainel().getX() + ",Y: " + getPainel().getY());

        menuOcupada.setNumMesaTextField(getNumControle() + "");
        System.out.println("horario oc: " + ocupacao.getHorarioOcupacao());
        menuOcupada.setHorarioOcupacaoTextField(ocupacao.getHorarioOcupacao());
        menuOcupada.setVisible(true);
        //livre.
    }

}
