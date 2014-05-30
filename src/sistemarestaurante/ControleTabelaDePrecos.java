/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usu�rio
 */
public class ControleTabelaDePrecos {

    private SGBD sgbd;
    private MenuTabelaDePrecos menuTabelaDePrecos;
    
    public ControleTabelaDePrecos(MenuTabelaDePrecos menuTabelaDePrecos)
    {
        sgbd = SGBD.getInstancia();
        this.menuTabelaDePrecos = menuTabelaDePrecos;
        //mostraPrecosNaTela();
    }
    
    public void armazenaPrecos()
    {
        int cont = 0;
            for(int i = 0; i< menuTabelaDePrecos.getTabelaPrecos().getRowCount(); i++)
            {
                System.out.println(menuTabelaDePrecos.getTabelaPrecos().getValueAt(i, 1).toString());
                if (menuTabelaDePrecos.getTabelaPrecos().getValueAt(i, 1).toString().equals("")){
                    JOptionPane.showMessageDialog(null, "Erro! Voc� n�o digitou os pre�os em todas as linhas da tabela!",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
                        break;
                }
                else
                {
                    cont++;
                }
            }
            if (cont == menuTabelaDePrecos.getTabelaPrecos().getRowCount())
            {
                ArrayList<Double> precos = new ArrayList<Double>();
                for(int i = 0; i< menuTabelaDePrecos.getTabelaPrecos().getRowCount(); i++)
                {
                    precos.add(i, Double.parseDouble(menuTabelaDePrecos.getTabelaPrecos().getValueAt(i, 1).toString()));
                }

                TabelaDePrecos tabela = new TabelaDePrecos(precos);
                sgbd.armazenaPrecos(tabela);
                    JOptionPane.showMessageDialog(null, "Tabela de Pre�os atualizada com Sucesso!", 
        "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    
    public void mostraPrecosNaTela()
    {
        ArrayList<TabelaDePrecos> array = sgbd.buscaPrecos(new TabelaDePrecos(null));
        for (TabelaDePrecos t: array)
        {
            for (int i=0; i< t.getPrecos().size(); i++)
            {
                menuTabelaDePrecos.getTabelaPrecos().setValueAt(t.getPrecoProduto(i), i, 1);
            }
        }
    }


    public TabelaDePrecos getTabelaDePrecos()
    {
        ArrayList<TabelaDePrecos> array = sgbd.buscaPrecos(new TabelaDePrecos(null));
        TabelaDePrecos tabela;
        tabela = array.get(0);
        return tabela;
    }

}
