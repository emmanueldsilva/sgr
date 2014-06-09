/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.util.Vector;
import static sistemarestaurante.Produto.parseProduto;

/**
 *
 * @author filaboia
 */
public class ProdutoVenda {

    private final Produto produto;
    private final Integer quantidade;

    public static class ProdutoVendaBuilder {
        private Produto produto;
        private Integer quantidade;

        public ProdutoVendaBuilder setProduto(Produto produto) {
            this.produto = produto;
            return this;
        }

        public ProdutoVendaBuilder setQuantidade(Integer quantidade) {
            this.quantidade = quantidade;
            return this;
        }
        
        public ProdutoVenda build() {
            return new ProdutoVenda(this);
        }
    }
    
    private ProdutoVenda(ProdutoVendaBuilder produtoVendaBuilder) {
        produto = produtoVendaBuilder.produto;
        quantidade = produtoVendaBuilder.quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    
    public static ProdutoVenda parseProdutoVendaVector(Vector produtoVendaVector) {
        return new ProdutoVendaBuilder()
                .setProduto(parseProduto(produtoVendaVector))
                .setQuantidade((Integer) produtoVendaVector.get(3))
                .build();
    }
    
    public Vector<Object> toVector() {
        final Vector<Object> produtoVendaVector = getProduto().toVector();
        produtoVendaVector.add(getQuantidade());
        return produtoVendaVector;
    }
    
}
