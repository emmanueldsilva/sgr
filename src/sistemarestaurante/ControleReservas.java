/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author edamiani
 */
public class ControleReservas
{
    private MenuReservas menuReservas;
    private MenuMesaReservada menuMesaReservada;
    private Cliente cliente;
    private Reserva reserva;
    private SGBD sgbd;
    private DefaultListModel listaClientes;
    private DefaultListModel listaReservas;

    public ControleReservas(MenuReservas menuReservas)
    {
        this.menuReservas = menuReservas;
        sgbd = SGBD.getInstancia();
        listaClientesNaTela();
        listaReservasNaTela();
    }
    
    public ControleReservas(MenuMesaReservada menuMesaReservada)
    {
        this.menuMesaReservada = menuMesaReservada;
        sgbd = SGBD.getInstancia();
        listaReservasComboBox();
    }

    public void validaDadosCliente()
    {
        //System.out.println(menuReservas.getNumeroPessoasReserva() + "");
        if (menuReservas.getNomeCliente().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou o nome do cliente!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuReservas.getTelefoneCliente().equals("(  )    -    "))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou o telefone do cliente!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else{
        //else if (menuReservas.getTelefoneCliente().length())
        cliente = new Cliente(menuReservas.getNomeCliente(), 
                menuReservas.getEnderecoCliente(),
                menuReservas.getCidadeCliente(), 
                menuReservas.getUfCliente(),
                menuReservas.getTelefoneCliente(), 
                menuReservas.getEmailCliente());
        sgbd.armazenaCliente(cliente);
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso!", 
                "Confirmado", JOptionPane.INFORMATION_MESSAGE);
        limpaCamposCliente();
        }
        listaClientesNaTela();
        
    }
    
    public void validaDadosReserva()
    {
        if (menuReservas.getNomeClienteSelecionado().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não selecionou o cliente da reserva! \n" +
                    "Verifique se o campo 'Cliente Selecionado para a Reserva' está sem preenchimento.", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuReservas.getNumeroPessoasReserva() == 0)
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou número de pessoas da reserva!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuReservas.getTipoReserva().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não selecionou o tipo da reserva!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuReservas.getDataReserva().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou a data da reserva!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuReservas.getHorarioReserva().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou o horário da reserva!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            ArrayList<Cliente> array = new ArrayList<Cliente>(); 
            String nome = null;
            String telefone = null;            String clienteSelecionado = null;
            clienteSelecionado = menuReservas.getNomeClienteSelecionado();
            String[] vetor = clienteSelecionado.split("    ");
            nome = vetor[0];
            telefone = vetor[1];
            array = sgbd.buscaClientes(new Cliente(nome, null, null, null, telefone, null));
            Cliente cliAux = array.get(0);
            reserva = new Reserva(menuReservas.getNumeroPessoasReserva(), 
                    menuReservas.getTipoReserva(), 
                    menuReservas.getDataReserva(),
                    menuReservas.getHorarioReserva(),
                    menuReservas.getInformacoesReserva(),
                    cliAux);
            sgbd.armazenaReserva(reserva);
            JOptionPane.showMessageDialog(null, "Reserva Cadastrada com Sucesso!", 
                "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            listaReservasNaTela();
            limpaCamposReserva();
        }
    }
    
    
    public void listaClientesNaTela()
    {
        listaClientes = new DefaultListModel();
        for (Cliente cli: sgbd.buscaClientes(new Cliente(null, null, null, null, null, null)))
        {
            listaClientes.addElement(cli.getNome() + "    " + cli.getTelefone());
        }
        menuReservas.setListaClientesCadastrados(listaClientes);
    }
    
    
    public void listaReservasNaTela()
    {
        listaReservas = new DefaultListModel();
        for (Reserva res: sgbd.buscaReserva(new Reserva(0, null, null, null, null, null)))
        {
            /*System.out.println(res.getTipoReserva() + "    " + res.getCliente().getNome() +
                    "    " + res.getCliente().getTelefone() +
                    "    " + res.getDataReserva() + "    " + res.getHorarioReserva() + 
                    "    " + "N�mero de Pessoas:" + "    " + res.getNumeroPessoasReserva());*/
            listaReservas.addElement(res.getTipoReserva() + "    " + res.getCliente().getNome() + 
                    "    " + res.getCliente().getTelefone() +
                    "    " + res.getDataReserva() + "    " + res.getHorarioReserva() + 
                    "    " + "Número de Pessoas:" + "    " + res.getNumeroPessoasReserva());
        }
        menuReservas.setListaReservasCadastradas(listaReservas);
    }
    
    public void listaReservasComboBox()
    {
        for (Reserva r: sgbd.buscaTodasReservas())
        {
            menuMesaReservada.getNomeClienteComboBox().addItem(r.getCliente().getNome());
        }
    }


    public void limpaCamposCliente()
    {
        menuReservas.setNomeCliente("");
        menuReservas.setEnderecoCliente("");
        menuReservas.setCidadeCliente("");
        menuReservas.setUfCliente("");
        menuReservas.setTelefoneCliente(null);
        menuReservas.setEmailCliente("");
    }
    
    public void limpaCamposReserva()
    {
        limpaCamposCliente();
        menuReservas.setNumeroPessoasReserva("");
        menuReservas.setTipoReserva("");
        menuReservas.setDataReserva("");
        menuReservas.setHorarioReserva("");
        menuReservas.setInformacoesReserva("");
    }
    
    public void removeCliente(String clienteString)
    {
        String nome = null;
        String telefone = null;
        String clienteSelecionado = null;
        clienteSelecionado = clienteString;
        String[] vetor = clienteSelecionado.split("    ");
        nome = vetor[0];
        telefone = vetor[1];
        sgbd.removeCliente(new Cliente(nome, null, null, null, telefone, null));

        listaClientesNaTela();
        
        JOptionPane.showMessageDialog(null, "Cliente Removido com Sucesso.", 
                "Confirmado!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    public void removeReserva(String reservaString)
    {
        String[] vetor = reservaString.split("    ");
        String tipo = vetor[0];
        String nome = vetor[1];
        String telefone = vetor[2];
        String data = vetor[3];
        String horario = vetor[4];
        String numPessoas = vetor[6];
        sgbd.removeReserva(new Reserva(Integer.parseInt(numPessoas), tipo, data, 
                horario, null, new Cliente(nome, null, null, null, telefone, null)));
        listaReservasNaTela();
        
        JOptionPane.showMessageDialog(null, "Reserva Removida com Sucesso.", 
                "Confirmado!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void removeReserva(Reserva res)
    {
        if (sgbd.buscaReserva(res).size() != 0)
        {
            sgbd.removeReserva(res);
            listaReservasNaTela();
        
            JOptionPane.showMessageDialog(null, "Reserva(s) do Cliente selecionado removida(s) com Sucesso.",
                "Confirmado!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void buscaCamposCliente(String clienteString)
    {
        String nome = null;
        String telefone = null;
        String clienteSelecionado = null;
        clienteSelecionado = clienteString;
        String[] vetor = clienteSelecionado.split("    ");
        nome = vetor[0];
        telefone = vetor[1];
        
        for (Cliente cli: sgbd.buscaClientes(new Cliente(nome, null, null, null, telefone, null)))
        {
            menuReservas.setNomeCliente(cli.getNome());
            menuReservas.setEnderecoCliente(cli.getEndereco());
            menuReservas.setCidadeCliente(cli.getCidade());
            menuReservas.setUfCliente(cli.getUf());
            menuReservas.setTelefoneCliente(cli.getTelefone());
            menuReservas.setEmailCliente(cli.getEmail());
        }
    }
    
    public void buscaCamposReserva(String reservaString)
    {
        String[] vetor = reservaString.split("    ");
        String tipo = vetor[0];
        String nome = vetor[1];
        String telefone = vetor[2];
        String data = vetor[3];
        String horario = vetor[4];
        String numPessoas = vetor[6];
        for (Reserva res: sgbd.buscaReserva(new Reserva(Integer.parseInt(numPessoas), tipo, data, horario, null, new Cliente(nome, null, null, null, telefone, null))))
        {
            menuReservas.setNumeroPessoasReserva(res.getNumeroPessoasReserva() + "");
            menuReservas.setTipoReserva(res.getTipoReserva());
            menuReservas.setDataReserva(res.getDataReserva());
            menuReservas.setHorarioReserva(res.getHorarioReserva());
            menuReservas.setInformacoesReserva(res.getInformacoesAdicionaisReserva());
            buscaCamposCliente(nome + "    " + telefone);
        }
    }
    
    public void buscaCamposReservaMesa(String reservaString)
    {
        for (Reserva res: sgbd.buscaReserva(new Reserva(0, null, null, null,
                null, new Cliente(reservaString, null, null, null, null, null))))
        {
            System.out.println(sgbd.buscaReserva(new Reserva(0, null, null, null,
                null, new Cliente(reservaString, null, null, null, null, null))).size());
            menuMesaReservada.setNumeroPessoasTextField(res.getNumeroPessoasReserva());
            menuMesaReservada.setHorarioReservaTextField(res.getHorarioReserva());
        }
    }
    
    public void atualizaCliente(Cliente clienteAtualizar, String cliString)
    {
        String[] vetor = cliString.split("    ");
        sgbd.atualizaCliente(clienteAtualizar, vetor);

        limpaCamposCliente();
        listaClientesNaTela();
        listaReservasNaTela();
    }
    
    public void atualizaReserva(Reserva reservaAtualizar, String resString)
    {
        String[] vetor = resString.split("    ");
        sgbd.atualizaReserva(reservaAtualizar, vetor);

        limpaCamposReserva();
        limpaCamposCliente();
        listaReservasNaTela();
    }

}
