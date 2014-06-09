package sistemarestaurante;

import java.util.ArrayList;
import java.util.Vector;
import static sistemarestaurante.Produto.parseProduto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author filaboia
 */
public class ControleProduto {
    
    private final SGBD sgbd;
    
    public ControleProduto() {
        sgbd = SGBD.getInstancia();
    }
    
    public void armazenaProduto(Vector<Object> produtoVector) {
        sgbd.armazenaProduto(parseProduto(produtoVector));
    }
    
    public Vector<Object> buscaProduto(Vector<Object> produtoVector) {
        ArrayList<Produto> produtos = sgbd.buscaProdutos(parseProduto(produtoVector));
        
        if (produtos.size() == 1) {
           return produtos.get(0).toVector();
        } else if (produtos.isEmpty()) {
            throw new RuntimeException("Produto não encontrado.");
        } else {
            throw new RuntimeException("Base inconsistente, avise o Batman por favor.");
        }
    }
    
    public Vector<Vector<Object>> buscaTodosProdutos() {
        final Vector<Vector<Object>> produtosVector = new Vector<Vector<Object>>();
        
        for (Produto produto : sgbd.buscaProdutosComercializados()) {
            produtosVector.add(produto.toVector());
        }
        
        return produtosVector;
    }
    
    public void removeProduto(Vector<Object> produtoVector) {
        sgbd.descomercializaProduto(parseProduto(produtoVector));
    }

}
