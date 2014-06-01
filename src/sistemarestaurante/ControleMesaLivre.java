/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.awt.Color;
import java.awt.Point;
//import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author edamiani
 */
public class ControleMesaLivre extends ControleMesa{

    private MenuMesaLivre menuLivre;
    private Mesa mesaLivre;
    
    public ControleMesaLivre(int x, int y, int width, int height, int numControle)
    {
        super(x, y, width, height);
        setStatus(0);

        mesaPanel.setBackground(new java.awt.Color(153, 255, 153));
        numeroMesaLabel.setText("" + numControle);
        setStatus(2);
        

        //menuLivre = MenuMesaLivre.getInstancia(Integer.parseInt(numeroMesaLabel.getText()), this);
        mesaLivre = new Mesa(Integer.parseInt(numeroMesaLabel.getText()));

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
        menuLivre = MenuMesaLivre.getInstancia(Integer.parseInt(numeroMesaLabel.getText()), this);
        //mesaLivre = new Mesa(Integer.parseInt(numeroMesaLabel.getText()));
        //livre.setLocation(getPainel().getX(), getPainel().getY());
        menuLivre.setLocation(new Point(getPainel().getX(), getPainel().getY()));
        System.out.println("X: " + getPainel().getX() + ",Y: " + getPainel().getY());
        menuLivre.setNumMesaTextField(getNumControle() + "");
        menuLivre.setVisible(true);
        //livre.
    }
}
