/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author edamiani
 */
public class ControleVendas {

    private SGBD sgbd;
    private MenuConta menuConta;
    private MenuConsultaConta menuConsultaConta;
    private ControleTabelaDePrecos controleTabelaDePrecos;
    private Venda conta;
    private TabelaDePrecos tabela;

    public ControleVendas(MenuConta menuConta)
    {
        this.sgbd = SGBD.getInstancia();
        this.menuConta = menuConta;
        this.controleTabelaDePrecos = new ControleTabelaDePrecos(null);
        this.tabela = controleTabelaDePrecos.getTabelaDePrecos();
    }
    
    public ControleVendas(MenuConsultaConta menuConsultaConta)
    {
        this.sgbd = SGBD.getInstancia();
        this.menuConsultaConta = menuConsultaConta;
    }

    public void buscaCamposProduto(String produtoString)
    {
        String[] vetor = produtoString.split("    ");
        String nome = vetor[0];
        String qtde = vetor[2];
        String preco = vetor[4];

        menuConta.setNomeProduto(nome);
        menuConta.setQuantidade(Integer.parseInt(qtde));
        menuConta.setPreco(Double.parseDouble(preco));
    }

    public void limpaCamposProduto()
    {
        menuConta.setNomeProduto("");
        menuConta.setPreco(0);
        menuConta.setQuantidade(0);
    }

    public void calculaValor(ArrayList<String> listaProdutos)
    {
        double valorTotal = 0;
        for (int i=0; i< menuConta.getTable().getRowCount(); i++)
        {
            if (menuConta.getTable().getValueAt(i, 1).toString().equals(""))
            {
                valorTotal += (0*tabela.getPrecoProduto(i));
            }
            else
            valorTotal += (Integer.parseInt(menuConta.getTable().getValueAt(i, 1).toString())*tabela.getPrecoProduto(i));
        }

        for (String s: listaProdutos)
        {
            String[] vetor = s.split("    ");
            String valor = vetor[4];
            String qtde = vetor[2];

            valorTotal += (Double.parseDouble(valor)*Integer.parseInt(qtde));
        }
        menuConta.setValorTotal(valorTotal);
    }

    public void armazenarConta(ArrayList<String> listaProdutos)
    {
        if (menuConta.getValorTotal() == 0)
        {
            JOptionPane.showMessageDialog(null, "Erro! Nenhum produto consumido foi selecionado nessa conta!",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            conta = new Venda(menuConta.getOcupacao().getHorarioOcupacao(),
                    menuConta.getOcupacao().getHorarioSaida(), null,
                    menuConta.getOcupacao().getNumeroOcupantes());
        }
        sgbd.armazenaConta(conta);
    }

    public void consultaTodasContas()
    {
        String contaString = null;
        ArrayList<Venda> array = sgbd.buscaTodasContas();
        DefaultListModel listaContas = new DefaultListModel();
        for (Venda c: array)
        {
            contaString = ("Data:" + "    " + c.getData() + "    " + "Horário Ocupação:" +
                    "    " + c.getHorarioOcupacao() + "    " + "Horário de Saída:" + "    " 
                    + c.getHorarioSaida() + "    "
                    + "Nº de Pessoas:" + "    " + c.getNumOcupantes());
            listaContas.addElement(contaString);
        }
        menuConsultaConta.setContasCadastradasList(listaContas);
    }

    public void buscaProdutosConta(String contaString)
    {
        String[] vetor = contaString.split("    ");
        String data = vetor[1];
        System.out.println(data);
        String horario = vetor[3];
        System.out.println(horario);
        ArrayList<Venda> array = sgbd.buscaContas(new Venda(horario, null, data, 0));
        //ArrayList<Conta> array = sgbd.buscaContas(new Conta(null, null, null, 0));
        System.out.println(array.size());
        for (Venda c: array)
        {
            //System.out.println("entrou aki");
            menuConsultaConta.getProdutosDaContaTextArea().setText(c.toString());
        }

    }
    
    public void removeConta(String contaString)
    {
        
        String[] vetor = contaString.split("    ");
        String data = vetor[1];
        String horario = vetor[3];
        sgbd.removeConta(new Venda(horario, null, data, 0));
        JOptionPane.showMessageDialog(null, "Registro de Conta removido com sucesso!", 
        "Confirmado", JOptionPane.INFORMATION_MESSAGE);
    }
}
