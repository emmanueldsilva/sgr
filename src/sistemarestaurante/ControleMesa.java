/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

/**
 *
 * @author Usu�rio
 */
import java.awt.Color;
//import java.awt.Frame;
//import java.awt.Point;
import java.util.ArrayList;
import javax.swing.*;
//import javax.swing.border.BevelBorder;

public class ControleMesa {
    JPanel mesaPanel;
    JLabel numeroMesaLabel;
    private int x;
    private int y;
    private int width;
    private int height;
    private int status;
    //private int status;
    
    
    public ControleMesa(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;  //salva a posi��o inicial das mesas.
        this.width = width;
        this.height = height;
        //this.status = -1; //determina o status da mesa como livre.

        mesaPanel = new JPanel();  //Instancia o Painel
        
        mesaPanel.setBounds(x, y, width, height);  //Define o tamanho do Painel.
        
        mesaPanel.setBackground(Color.GREEN);  //Define a cor do Painel.
        
        numeroMesaLabel = new JLabel("" + 0);
        numeroMesaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        //javax.swing.GroupLayout mesaLayout = new javax.swing.GroupLayout(mesa);  //Define o Layout do Painel
        
        /*mesa.setLayout(mesaLayout);
        mesaLayout.setHorizontalGroup(
            mesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
            .addComponent(numeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, Short.MAX_VALUE)
        );
        mesaLayout.setVerticalGroup(
            mesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
            .addComponent(numeroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 14, Short.MAX_VALUE)
        );*/
        
        javax.swing.GroupLayout mesaLayout = new javax.swing.GroupLayout(mesaPanel);
        mesaPanel.setLayout(mesaLayout);
        mesaLayout.setHorizontalGroup(
            mesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numeroMesaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, Short.MAX_VALUE)
                .addContainerGap())
        );
        mesaLayout.setVerticalGroup(
            mesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mesaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numeroMesaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        mesaPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null)); // Define a borda do painel.
        
        mesaPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() { //adiciona um elemento Listener para receber eventos.
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mesaMouseDragged(evt);
            }
        });
        
        /*mesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesaMouseClicked(evt);
            }
        });*/
    }
    
    
    /**
     * M�todo respons�vel por retornar o Painel mesa.
     * @return mesa.
     */
    public JPanel getPainel()
    {
        return mesaPanel;
    }
    
    
    /**
     * M�todo respons�vel por clicar e arrastar o painel na interface.
     * @param Mouse event.
     */
    private void mesaMouseDragged(java.awt.event.MouseEvent evt)
    {
        int xSel = mesaPanel.getLocation().x;
        int ySel = mesaPanel.getLocation().y;
        mesaPanel.setLocation((evt.getX()  + xSel )- (mesaPanel.getWidth() / 2),(evt.getY() + ySel) - (mesaPanel.getHeight() / 2));
        mesaPanel.repaint();
        if (evt.getX() == mesaPanel.getX())
        {
            xSel = 49;
         }
        else
        {
        xSel = evt.getX();
        }
        ySel = evt.getY();
     }
    
    
    /**
     * M�todo respons�vel por clicar no painel na interface.
     * @param Mouse event.
     */
    /*private void mesaMouseClicked(java.awt.event.MouseEvent evt)
    {
        MenuMesaLivre livre = new MenuMesaLivre();
        //livre.setLocation(getPainel().getX(), getPainel().getY());
        livre.setLocation(new Point(getPainel().getX(), getPainel().getY()));
        System.out.println("X: " + getPainel().getX() + ",Y: " + getPainel().getY());
        livre.setVisible(true);
        //livre.
    }*/


    /**
     * M�todo respons�vel por definir o n�mero da mesa.
     * @param num
     */
    public void setNumMesa(int num)
    {
        numeroMesaLabel.setText("" + num);
    }


    /**
     * M�todo para retornar a mesa � sua posi��o inicial.
     */
    public void posicaoInicial()
    {
        getPainel().setLocation(this.x, this.y);
    }


    /**
     * M�todo para tornar a mesa vis�vel.
     * @param valor
     */
    public void setVisible(boolean valor)
    {
        mesaPanel.setVisible(valor);
    }

    
    /**
     * M�todo respons�vel por retornar o status da mesa.
     * @return status
     */
    public int getStatus() {
        return status;
    }

    
    /**
     * M�todo respons�vel por alterar o status da mesa.
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }
    
    /**
     * M�todo respons�vel por retornar no n�mero do controle da mesa.
     * @return numeroControle;
     */
    public int getNumControle()
    {
        return Integer.parseInt(numeroMesaLabel.getText());
    }
    
    
    /**
     * M�todo respons�vel por retornar o valor da altura do painel.
     * @return height
     */
    public int getAltura()
    {
        return height;
    }
    
    
    /**
     * M�todo respons�vel por retornar o valor da largura do painel.
     * @return width
     */
    public int getLargura()
    {
        return width;
    }

    /**
     * M�todo respons�vel por retornar o valor de X.
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * M�todo respon�vel por retornar o valor de Y.
     * @return y
     */
    public int getY() {
        return y;
    }

}
