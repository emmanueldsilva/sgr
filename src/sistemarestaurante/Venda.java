/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;
import static sistemarestaurante.ProdutoVenda.parseProdutoVendaVector;

/**
 *
 * @author filaboia
 */
public class Venda {

    private final ArrayList<ProdutoVenda> produtosConsumidos;
    private final String horarioOcupacao;
    private final String horarioSaida;
    private final String data;
    private final Integer numOcupantes;

    public static class VendaBuilder {
        private ArrayList<ProdutoVenda> produtosConsumidos;
        private String horarioOcupacao;
        private String horarioSaida;
        private String data;
        private Integer numOcupantes;

        public VendaBuilder setProdutosConsumidos(ArrayList<ProdutoVenda> produtosConsumidos) {
            this.produtosConsumidos = produtosConsumidos;
            return this;
        }

        public VendaBuilder setHorarioOcupacao(String horarioOcupacao) {
            this.horarioOcupacao = horarioOcupacao;
            return this;
        }

        public VendaBuilder setHorarioSaida(String horarioSaida) {
            this.horarioSaida = horarioSaida;
            return this;
        }

        public VendaBuilder setData(String data) {
           this.data = data;
           return this;
        }

        public VendaBuilder setNumOcupantes(Integer numOcupantes) {
            this.numOcupantes = numOcupantes;
            return this;
        }

        public Venda build() {
            return new Venda(this);
        }
        
    }

    private Venda(VendaBuilder vendaBuilder)
    {
        this.data = vendaBuilder.data;
        this.horarioOcupacao = vendaBuilder.horarioOcupacao;
        this.horarioSaida = vendaBuilder.horarioSaida;
        this.numOcupantes = vendaBuilder.numOcupantes;
        this.produtosConsumidos = vendaBuilder.produtosConsumidos;
    }

    public ArrayList<ProdutoVenda> getProdutosConsumidos() {
        return produtosConsumidos;
    }

    public String getHorarioOcupacao() {
        return horarioOcupacao;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public String getData() {
        return data;
    }
    
    public Integer getNumOcupantes() {
        return numOcupantes;
    }
    
    public static Venda extractVenda(Ocupacao ocupacao) {
        return new VendaBuilder()
                .setData(ocupacao.getFormattedDate())
                .setHorarioOcupacao(ocupacao.getHorarioOcupacao())
                .setHorarioSaida(ocupacao.getHorarioSaida())
                .setNumOcupantes(ocupacao.getNumeroOcupantes())
                .setProdutosConsumidos(parseProdutosVendaVector(ocupacao.getProdutosVendaVector()))
                .build();
    }
    
    private static ArrayList<ProdutoVenda> parseProdutosVendaVector(Vector<Vector> produtosVendaVector) {
        final ArrayList<ProdutoVenda> produtosVenda = new ArrayList<ProdutoVenda>();
        for (Vector produtoVendaVector : produtosVendaVector) {
            final ProdutoVenda produtoVenda = parseProdutoVendaVector(produtoVendaVector);
            if (produtoVenda.getQuantidade() != null && produtoVenda.getQuantidade() != 0) {
            produtosVenda.add(produtoVenda);
            }
        }
        return produtosVenda;
    }

    Vector<Vector<Object>> toProdutosVendaVector() {
        final Vector<Vector<Object>> produtosVendaVector = new Vector<Vector<Object>>();
        for (ProdutoVenda produtoVenda : getProdutosConsumidos()) {
            produtosVendaVector.add(produtoVenda.toVector());
        }
        return produtosVendaVector;
    }

    public Vector<Object> toVector() {
        final Vector<Object> vendaVector = new Vector<Object>();
        vendaVector.add(getData());
        vendaVector.add(getHorarioOcupacao());
        vendaVector.add(getHorarioSaida());
        vendaVector.add(getNumOcupantes());
        return vendaVector;
    }
    
    static Venda parseVector(Vector<Object> vendaVector) throws ParseException {
            return new VendaBuilder()
                    .setData((String) vendaVector.get(0))
                    .setHorarioOcupacao((String) vendaVector.get(1))
                    .setHorarioSaida((String) vendaVector.get(2))
                    .setNumOcupantes((Integer) vendaVector.get(3))
                    .build();
    }

}
