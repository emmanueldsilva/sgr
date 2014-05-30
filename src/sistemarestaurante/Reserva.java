/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.util.ArrayList;

/**
 *
 * @author edamiani
 */
public class Reserva {

    private Cliente cliente;
    private ArrayList<Mesa> mesasVinculadas;

    //dados da Reserva.
    private int numeroPessoasReserva;
    private String tipoReserva;
    private String dataReserva;
    private String horarioReserva;
    private String informacoesAdicionaisReserva;


   public Reserva(int numeroPessoasR, String tipoR, String dataR,
           String horarioR, String informacoesR, Cliente cliente)
   {
        this.cliente = cliente;
        this.numeroPessoasReserva = numeroPessoasR;
        this.tipoReserva = tipoR;
        this.dataReserva = dataR;
        this.horarioReserva = horarioR;
        this.informacoesAdicionaisReserva = informacoesR;
        
        mesasVinculadas = new ArrayList<Mesa>();
   }


    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getHorarioReserva() {
        return horarioReserva;
    }

    public void setHorarioReserva(String horarioReserva) {
        this.horarioReserva = horarioReserva;
    }

    public String getInformacoesAdicionaisReserva() {
        return informacoesAdicionaisReserva;
    }

    public void setInformacoesAdicionaisReserva(String informacoesAdicionaisReserva) {
        this.informacoesAdicionaisReserva = informacoesAdicionaisReserva;
    }

    public int getNumeroPessoasReserva() {
        return numeroPessoasReserva;
    }

    public void setNumeroPessoasReserva(int numeroPessoasReserva) {
        this.numeroPessoasReserva = numeroPessoasReserva;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addMesa(Mesa mesa)
    {
        mesasVinculadas.add(mesa);
    }
    
    public void removeMesa(Mesa mesa)
    {
        mesasVinculadas.remove(mesa);
    }
}
