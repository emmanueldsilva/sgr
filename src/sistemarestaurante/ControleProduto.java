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
    
    public void armazenaProduto(Vector<String> produtoVector) {
        SGBD.getInstancia().armazenaProduto(parseProduto(produtoVector));
    }
    
    public Vector<String> buscaProduto(Vector<String> produtoVector) {
        ArrayList<Produto> produtos = SGBD.getInstancia().buscaProdutos(parseProduto(produtoVector));
        
        if (produtos.size() == 1) {
           return produtos.get(0).toVector();
           
        } else if (produtos.isEmpty()) {
            throw new RuntimeException("Produto não encontrado.");
        } else {
            throw new RuntimeException("Base inconsistente, avise o Batman por favor.");
        }
    }
    
    public Vector<Vector<String>> buscaTodosProdutos() {
        final Vector<Vector<String>> produtosVector = new Vector<Vector<String>>();
        
        for (Produto produto : SGBD.getInstancia().buscaProdutosComercializados()) {
            produtosVector.add(produto.toVector());
        }
        
        return produtosVector;
    }
    
    public void editaProduto(Vector<String> produtoVectorOld, Vector<String> produtoVector) {
        removeProduto(produtoVectorOld);
        armazenaProduto(produtoVector);
    }
    
    public void removeProduto(Vector<String> produtoVector) {
        SGBD.getInstancia().descomercializaProduto(parseProduto(produtoVector));
    }

}
