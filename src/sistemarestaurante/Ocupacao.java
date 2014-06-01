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
    private Conta conta;
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


    /**
     * Método responsável por retornar o Horário de Ocupação da Mesa.
     * @return horarioOcupacao
     **/
    public String getHorarioOcupacao() {
        /*if (horarioOcupacao == null)
        {
            date = new Date();
            sdf = new SimpleDateFormat("hh:mm");
            horarioOcupacao = sdf.format(date);
        }*/
        return this.horarioOcupacao;
    }


    /**
     * Método responsável por modificar o Horário de Ocupação da Mesa.
     * @param horarioOcupacao
     */
    public void setHorarioOcupacao(String horarioOcupacao) {
        this.horarioOcupacao = horarioOcupacao;
    }


    /**
     * Método responsável por retornar o Horário de Saída da Mesa.
     * @return horarioSaida
     */
    public String getHorarioSaida() {
        return horarioSaida;
    }


    /**
     * Método responsável por modificar o Horário de Saída da Mesa.
     * @param horarioSaida
     */
    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    
    /**
     * Método responsável por retornar o Número de Ocupantes da Mesa.
     * @return numeroOcupantes
     */
    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    
    /**
     * Método responsável por modificar o Número de Ocupantes da Mesa.
     * @param numeroOcupantes
     */
    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }


    /**
     * Método responsável por adicionar uma mesa a ocupacao.
     * @param novamesa
     */
    public void addMesa(Mesa novamesa)
    {
        this.mesas.add(novamesa);
    }


    /**
     * Método responsável por retornar o conjunto de mesas da ocupação.
     * @return mesas
     */
    public ArrayList<Mesa> getMesas()
    {
        return mesas;
    }
}
