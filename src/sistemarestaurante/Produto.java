/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import static java.lang.Boolean.TRUE;
import static java.lang.Double.parseDouble;
import java.util.Vector;
import static sistemarestaurante.TipoProduto.parseTipoProduto;

/**
 *
 * @author filaboia
 */
public class Produto {
    
    private final String descricao;
    private final TipoProduto tipo;
    private final Double preco;
    private Boolean comercializado;
    
    public static class ProdutoBuilder {
       
        private String descricao;
        private TipoProduto tipo;
        private Double preco;
        private Boolean comercializado;

        public ProdutoBuilder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public ProdutoBuilder setTipo(TipoProduto tipo) {
            this.tipo = tipo;
            return this;
        }

        public ProdutoBuilder setPreco(Double preco) {
            this.preco = preco;
            return this;
        }

        public ProdutoBuilder setComercializado(Boolean comercializado) {
            this.comercializado = comercializado;
            return this;
        }
        
        public Produto build() {
            return new Produto(this);
        }
        
    }
    
    private Produto(ProdutoBuilder produtoBuilder) {
        descricao = produtoBuilder.descricao;
        tipo = produtoBuilder.tipo;
        preco = produtoBuilder.preco;
        comercializado = produtoBuilder.comercializado;
    }
    
    public Vector<String> toVector() {
        final Vector<String> produtoVector = new Vector<String>();
           
        produtoVector.add(getDescricao());
        produtoVector.add(getTipo().toString());
        produtoVector.add(getPreco().toString());
        
        return produtoVector;
    }
    
    public static Produto parseProduto(Vector<String> produtoVector) {
        return new ProdutoBuilder()
               .setDescricao(produtoVector.get(0))
               .setTipo(parseTipoProduto(produtoVector.get(1)))
               .setPreco(parseDouble(produtoVector.get(2)))
               .setComercializado(TRUE)
               .build();
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public Double getPreco() {
        return preco;
    }

    public Boolean isComercializado() {
        return comercializado;
    }

    public void setComercializado(Boolean comercializado) {
        this.comercializado = comercializado;
    }
    
}
