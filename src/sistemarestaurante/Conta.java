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
public class Conta {

    private ArrayList<String> produtosConsumidos;
    private String horarioOcupacao;
    private String horarioSaida;
    private String data;
    private int numOcupantes;
    private Date date;
    private SimpleDateFormat sdf;

    public Conta(String horarioOcupacao,
            String horarioSaida, String data, int numOcupantes)
    {
        this.produtosConsumidos = new ArrayList<String>();
        this.data = data;
        this.horarioOcupacao = horarioOcupacao;
        this.horarioSaida = horarioSaida;
        this.date = new Date();
        this.sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.data = sdf.format(date);
        this.produtosConsumidos.add("Data:"+ "    " + this.data + "    " + "Hor�rio Ocupa��o:"
                + "    " + this.horarioOcupacao + "    " + "Hor�rio Fechamento:" + "    "
                + this.horarioSaida + "    " + "N� Pessoas:" + "    " + this.numOcupantes);
    }

    public ArrayList<String> getProdutosConsumidos() {
        return produtosConsumidos;
    }

    public void setProdutosConsumidos(ArrayList<String> produtosConsumidos) {
        this.produtosConsumidos = produtosConsumidos;
    }

    @Override
    public String toString()
    {
        String tudo = null;
        for (String s: produtosConsumidos)
        {
            tudo += (s + "\n");
        }
        return tudo;
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

    public void addString(String novoString)
    {
        produtosConsumidos.add(novoString);
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
