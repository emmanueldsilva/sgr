/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author edamiani
 */
public class VendaAvulsa {

    private ArrayList<String> listaProdutos;
    private double valorTotal;
    private String horarioVenda;
    private String dataVenda;


    public VendaAvulsa(ArrayList<String> listaProdutos, double valorTotal, String horarioVenda,
            String dataVenda)
    {
        this.listaProdutos = listaProdutos;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
        this.horarioVenda = horarioVenda;


    }

    public ArrayList<String> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<String> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHorarioVenda() {
        return horarioVenda;
    }

    public void setHorarioVenda(String horarioVenda) {
        this.horarioVenda = horarioVenda;
    }



    

}
