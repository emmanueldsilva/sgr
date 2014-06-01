/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.util.ArrayList;

/**
 *
 * @author Usuário
 */
public class TabelaDePrecos {

    private ArrayList<Double> precos;
    
    public TabelaDePrecos(ArrayList<Double> precos)
    {
        this.precos = precos;
        //precos = new ArrayList<Double>();
    }
    
    public void setPrecoProduto(int index, double novoValor)
    {
        precos.set(index, novoValor);
    }
    
    public double getPrecoProduto(int index)
    {
        return precos.get(index);
    }
    
    public ArrayList<Double> getPrecos()
    {
        return precos;
    }
}
