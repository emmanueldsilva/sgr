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
public class Venda {

    private ArrayList<Produto> produtosConsumidos;
    private String horarioOcupacao;
    private String horarioSaida;
    private String data;
    private int numOcupantes;
    private Date date;
    private SimpleDateFormat sdf;

    public Venda(String horarioOcupacao,
            String horarioSaida, String data, int numOcupantes)
    {
        this.data = data;
        this.horarioOcupacao = horarioOcupacao;
        this.horarioSaida = horarioSaida;
        this.date = new Date();
        this.sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.data = sdf.format(date);
    }

    public ArrayList<Produto> getProdutosConsumidos() {
        return produtosConsumidos;
    }

    public void setProdutosConsumidos(ArrayList<Produto> produtosConsumidos) {
        this.produtosConsumidos = produtosConsumidos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorarioOcupacao() {
        return horarioOcupacao;
    }

    public void setHorario(String horario) {
        this.horarioOcupacao = horario;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public int getNumOcupantes() {
        return numOcupantes;
    }

    public void setNumOcupantes(int numOcupantes) {
        this.numOcupantes = numOcupantes;
    }



}