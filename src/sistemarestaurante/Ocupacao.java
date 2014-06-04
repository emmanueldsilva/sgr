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
 * @author vneumann
 */
public class Ocupacao {
    
    private int numeroOcupantes;
    private Date date;
    private SimpleDateFormat sdf;
    private String horarioOcupacao;
    private String horarioSaida;
    private Venda conta;
    private ArrayList<Mesa> mesas;

    public Ocupacao(ArrayList<Mesa> mesas)
    {
        
        this.mesas = mesas;
        date = new Date();
        sdf = new SimpleDateFormat("hh:mm:ss");
        horarioOcupacao = sdf.format(date);
        
        //System.out.println(horarioOcupacao);
                //date.getTime();
        //horarioOcupacao = calendario.g
    }

    public String getHorarioOcupacao() {
        /*if (horarioOcupacao == null)
        {
            date = new Date();
            sdf = new SimpleDateFormat("hh:mm");
            horarioOcupacao = sdf.format(date);
        }*/
        return this.horarioOcupacao;
    }

    public void setHorarioOcupacao(String horarioOcupacao) {
        this.horarioOcupacao = horarioOcupacao;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }

    public void addMesa(Mesa novamesa)
    {
        this.mesas.add(novamesa);
    }

    public ArrayList<Mesa> getMesas()
    {
        return mesas;
    }
}
