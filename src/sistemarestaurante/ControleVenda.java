/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;
import static sistemarestaurante.Venda.extractVenda;
import static sistemarestaurante.Venda.parseVector;

/**
 *
 * @author filaboia
 */
public class ControleVenda {
    
    private final SGBD sgbd;
    
    public ControleVenda() {
        sgbd = SGBD.getInstancia();
    }
    
    public Double calculcarValorTotal(Vector<Vector> produtosVendaVector) {
        Double valorTotal = 0D;
        for (Vector produtoVendaVector : produtosVendaVector) {
            final Integer quantidade = produtoVendaVector.get(3) != null ? (Integer) produtoVendaVector.get(3) : 0;
            valorTotal += ((Double) produtoVendaVector.get(2)) * (quantidade);
        }
        return valorTotal;
    }

    public void salvarVenda(Ocupacao ocupacao) {
        sgbd.armazenaVenda(extractVenda(ocupacao));
    }

    Vector<Vector<Object>> buscaTodasVendas() {
        final Vector<Vector<Object>> vendasVector = new Vector<Vector<Object>>();
        
        for (Venda venda : sgbd.buscaVendas()) {
            vendasVector.add(venda.toVector());
        }
        
        return vendasVector;
    }

    Vector<Vector<Object>> buscaProdutosVenda(Vector<Object> vendaVector) throws ParseException {
        final ArrayList<Venda> vendas = sgbd.buscaVendas(parseVector(vendaVector));
        
        if (vendas.size() == 1) {
            return vendas.get(0).toProdutosVendaVector();
        } else if (vendas.isEmpty()) {
            throw new RuntimeException("Venda não encontrada.");
        } else {
            throw new RuntimeException("Base inconsistente, avise o Batman por favor.");
        }
    }

}
