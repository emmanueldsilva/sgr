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
     * M�todo respons�vel por retornar o Hor�rio de Ocupa��o da Mesa.
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
     * M�todo respons�vel por modificar o Hor�rio de Ocupa��o da Mesa.
     * @param horarioOcupacao
     */
    public void setHorarioOcupacao(String horarioOcupacao) {
        this.horarioOcupacao = horarioOcupacao;
    }


    /**
     * M�todo respons�vel por retornar o Hor�rio de Sa�da da Mesa.
     * @return horarioSaida
     */
    public String getHorarioSaida() {
        return horarioSaida;
    }


    /**
     * M�todo respons�vel por modificar o Hor�rio de Sa�da da Mesa.
     * @param horarioSaida
     */
    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    
    /**
     * M�todo respons�vel por retornar o N�mero de Ocupantes da Mesa.
     * @return numeroOcupantes
     */
    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    
    /**
     * M�todo respons�vel por modificar o N�mero de Ocupantes da Mesa.
     * @param numeroOcupantes
     */
    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantes = numeroOcupantes;
    }


    /**
     * M�todo respons�vel por adicionar uma mesa a ocupacao.
     * @param novamesa
     */
    public void addMesa(Mesa novamesa)
    {
        this.mesas.add(novamesa);
    }


    /**
     * M�todo respons�vel por retornar o conjunto de mesas da ocupa��o.
     * @return mesas
     */
    public ArrayList<Mesa> getMesas()
    {
        return mesas;
    }
}
