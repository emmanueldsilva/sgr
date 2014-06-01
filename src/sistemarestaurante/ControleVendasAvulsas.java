/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author edamiani
 */
public class ControleVendasAvulsas {
    
    private MenuVendasAvulsas menuVendas;
    private SGBD sgbd;
    private Date data;
    private SimpleDateFormat sdf;

    public ControleVendasAvulsas(MenuVendasAvulsas menuVendas)
    {
        this.menuVendas = menuVendas;
        sgbd = SGBD.getInstancia();
        listaVendasNaTela();
    }
    
    public void calculaValor(ArrayList<String> lista)
    {
        double valorTotal = 0;
        for (String s: lista)
        {
            String[] vetor = s.split("    ");
            valorTotal += Integer.parseInt(vetor[2])*Double.parseDouble(vetor[4]);
        }

        menuVendas.setValorTotal(valorTotal);

        limpaCamposVenda();
    }

    public void adicionaVenda(ArrayList<String> listaString, double valorTotal)
    {
        if (menuVendas.getListaProdutosList().getFirstVisibleIndex() == -1)
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não inseriu nenhum produto na venda!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            data = new Date();
            sdf = new SimpleDateFormat("hh:mm:ss");
            String horarioVenda = sdf.format(data);
            sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dataVenda = sdf.format(data);

            VendaAvulsa novaVenda = new VendaAvulsa(listaString, valorTotal,
                    horarioVenda, dataVenda);
            sgbd.armazenaVendaAvulsa(novaVenda);
            JOptionPane.showMessageDialog(null, "Venda avulsa foi salva com Sucesso!",
                "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            listaVendasNaTela();
            menuVendas.setListaProdutosList(new DefaultListModel());
            menuVendas.setListaProdutosArrayList(new ArrayList<String>());
            menuVendas.setListaProdutosDefault(new DefaultListModel());
            limpaCamposVenda();
        }
    }

    public void listaVendasNaTela()
    {
        DefaultListModel listaVendas = new DefaultListModel();
        //System.out.println(sgbd.buscaVendaAvulsa(new VendaAvulsa(null, 0)).size());
        for (VendaAvulsa v: sgbd.buscaTodasVendas())
        {
            
            listaVendas.addElement("Data:" + "    " + v.getDataVenda() + "    " +
                    "Horário:" + "    " + v.getHorarioVenda() + "    " + "Valor Total:" +
                    "    " + v.getValorTotal());
        }
        menuVendas.setListaVendas(listaVendas);
    }

    public void limpaCamposVenda()
    {
        menuVendas.setNomeProduto("");
        menuVendas.setPreco(0);
        menuVendas.setQuantidade(0);
        //menuVendas.setValorTotal(0);
    }

    public void buscaCamposProduto(String produtoString)
    {
        String[] vetor = produtoString.split("    ");
        String nome = vetor[0];
        String qtde = vetor[2];
        String preco = vetor[4];

        menuVendas.setNomeProduto(nome);
        menuVendas.setQuantidade(Integer.parseInt(qtde));
        menuVendas.setPreco(Double.parseDouble(preco));
    }
    
    public void buscaCamposVenda(String vendaString)
    {
        String[] vetor = vendaString.split("    ");
        String data = vetor[1];
        String horario = vetor[3];
        Double valor = Double.parseDouble(vetor[5]);

        //System.out.println(sgbd.buscaVendaAvulsa(new VendaAvulsa(null, valor, horario, data)).size());
        for (VendaAvulsa v: sgbd.buscaVendaAvulsa(new VendaAvulsa(null, valor, horario, data)))
        {
            DefaultListModel listaAux = new DefaultListModel();
            for (String s: v.getListaProdutos())
            {
                listaAux.addElement(s);
            }
            menuVendas.setValorTotal(v.getValorTotal());
            menuVendas.setListaProdutosList(listaAux);
            menuVendas.getListaProdutosList().setEnabled(false);
        }
    }
    
    public void removeVenda(String vendaString)
    {
        String[] vetor = vendaString.split("    ");
        String data = vetor[1];
        String horario = vetor[3];
        Double valor = Double.parseDouble(vetor[5]);
        sgbd.removeVenda(new VendaAvulsa(null, valor, horario, data));
        System.out.println(sgbd.buscaVendaAvulsa(new VendaAvulsa(null, valor, horario, data)).size());
        JOptionPane.showMessageDialog(null, "Venda avulsa foi removida com Sucesso!",
                "Confirmado", JOptionPane.INFORMATION_MESSAGE);
        listaVendasNaTela();

    }
}
