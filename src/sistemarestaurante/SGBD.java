/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;



/**
 *
 * @author edamiani
 */
public class SGBD {
    private static ObjectContainer bd_clientes = null;
    private static ObjectContainer bd_produtos = null;
    private static ObjectContainer bd_usuarios = null;
    private static ObjectContainer bd_reservas = null;
    private static ObjectContainer bd_funcionarios = null;
    private static ObjectContainer bd_vendasavulsas = null;
    private static ObjectContainer bd_tabela_precos = null;
    private static ObjectContainer bd_contas = null;
    private static SGBD banco;

    private SGBD()
    {
        bd_clientes = Db4o.openFile("BaseDeDados_Clientes");
        bd_produtos = Db4o.openFile("BaseDeDados_Produtos");
        bd_usuarios = Db4o.openFile("BaseDeDados_Usuarios");
        bd_reservas = Db4o.openFile("BaseDeDados_Reservas");
        bd_funcionarios = Db4o.openFile("BaseDeDados_Funcionarios");
        bd_vendasavulsas = Db4o.openFile("BaseDeDados_VendasAvulsas");
        bd_tabela_precos = Db4o.openFile("BaseDeDados_TabelaDePrecos");
        bd_contas = Db4o.openFile("BaseDeDados_Contas");
    }

    public static SGBD getInstancia()
    {
        if (banco == null)
            banco = new SGBD();
        return banco;
    }

    public void armazenaCliente(Cliente cliente)
    {
        try
        {
            bd_clientes.store(cliente);
            bd_clientes.commit();
        }
        catch (Exception e)
        {
            new Exception("erro ao armazenar cliente no banco de dados");
        }
    }
    
    public void armazenaProduto(Produto produto) {
        if (buscaProdutos(produto).isEmpty()) {
            bd_produtos.store(produto);
            bd_produtos.commit();
        }
    }
    
    public void armazenaUsuario(Usuario usuario) {
        if (buscaUsuarios(usuario).isEmpty()) {
            bd_usuarios.store(usuario);
            bd_usuarios.commit();
        } 
    }
    
    public void armazenaReserva(Reserva reserva)
    {
        try
        {
            bd_reservas.store(reserva);
            bd_reservas.commit();
        }
        catch (Exception e)
        {
            new Exception("erro ao armazenar reserva no banco de dados");
        }
    }

    public void armazenaFuncionario(Funcionario funcionario)
    {
        try
        {
            bd_funcionarios.store(funcionario);
            bd_funcionarios.commit();
        }
        catch (Exception e)
        {
            new Exception("erro ao armazenar funcionario no banco de dados");
        }
    }
    
    public void armazenaVendaAvulsa(VendaAvulsa venda)
    {
        try
        {
            bd_vendasavulsas.store(venda);
            bd_vendasavulsas.commit();
        }
        catch (Exception e)
        {
            new Exception("erro ao armazenar venda avulsa no banco de dados");
        }
    }
    
    public void armazenaPrecos(TabelaDePrecos tabela)
    {
        try
        {
            ArrayList<TabelaDePrecos> array = buscaPrecos(tabela);
            if (array.size() == 0)
            {
                bd_tabela_precos.store(tabela);
                bd_tabela_precos.commit();
            }
            else
            {
                for (TabelaDePrecos t: array)
                {
                    for (int i=0; i< t.getPrecos().size(); i++)
                    {
                        t.setPrecoProduto(i, tabela.getPrecoProduto(i));
                    }
                    bd_tabela_precos.store(t);
                    bd_tabela_precos.commit();
                }
            }
        }
        catch (Exception e)
        {
            new Exception("erro ao armazenar venda avulsa no banco de dados");
        }
    }
    
    public void armazenaConta(Venda conta)
    {
        try
        {
            bd_contas.store(conta);
            bd_contas.commit();
        }
        catch (Exception e)
        {
            new Exception("erro ao armazenar conta no banco de dados");
        }
    }
    
    public ArrayList<Cliente> buscaClientes(Cliente cli)
    {
        Cliente clienteProt = cli;
        try
        {
            ArrayList<Cliente> array = new ArrayList<Cliente>();
            ObjectSet<Cliente> lista = bd_clientes.queryByExample(clienteProt);
            for(Cliente c: lista)
                array.add(c);
            return array;
        }
        catch (Exception e)
        {
            new Exception("erro ao fazer a consulta no banco de dados");
            return null;
        }
    }
    
    public ArrayList<Produto> buscaProdutos(Produto produto) {
        return new ArrayList(bd_produtos.queryByExample(produto));
    }
    
    public ArrayList<Produto> buscaProdutosComercializados() {
        final Produto produtoComercializado = new Produto.ProdutoBuilder()
                .setComercializado(TRUE)
                .build();
        
        return new ArrayList(bd_produtos.queryByExample(produtoComercializado));
    }
    
    public ArrayList<Usuario> buscaUsuarios(Usuario usuario) {
        return new ArrayList(bd_usuarios.queryByExample(usuario));
    }

    public ArrayList<Reserva> buscaReserva(Reserva reserva)
    {
        try 
        {
            ArrayList<Reserva> array = new ArrayList<Reserva>();
            ObjectSet<Reserva> lista = bd_reservas.queryByExample(reserva);
            for (Reserva r: lista)
            {
                array.add(r);
                //System.out.println("numero res: " + array.size());
            }
            return array;
        }
        catch (Exception e)
        {
            new Exception("erro ao fazer a consulta no banco de dados");
            return null;
        }
    }
    
    public ArrayList<Reserva> buscaTodasReservas()
    {
        try 
        {
            ArrayList<Reserva> array = new ArrayList<Reserva>();
            ObjectSet<Reserva> lista = bd_reservas.queryByExample(Reserva.class);
            for (Reserva r: lista)
            {
                array.add(r);
                //System.out.println("numero res: " + array.size());
            }
            return array;
        }
        catch (Exception e)
        {
            new Exception("erro ao fazer a consulta no banco de dados");
            return null;
        }
    }
    
    
    public ArrayList<Funcionario> buscaFuncionarios(Funcionario funcionario)
    {
        try
        {
            ArrayList<Funcionario> array = new ArrayList<Funcionario>();
            ObjectSet<Funcionario> lista = bd_funcionarios.queryByExample(funcionario);
            for (Funcionario f: lista)
            {
                array.add(f);
            }
            return array;
        }
        catch (Exception e)
        {
            new Exception("erro ao fazer a consulta no banco de dados");
            return null;
        }
    }
    
    public ArrayList<VendaAvulsa> buscaVendaAvulsa(VendaAvulsa venda)
    {
        try
        {
            ArrayList<VendaAvulsa> array = new ArrayList<VendaAvulsa>();
            ObjectSet<VendaAvulsa> lista = bd_vendasavulsas.queryByExample(venda);
            for (VendaAvulsa v: lista)
            {
                array.add(v);
            }
            return array;
        }
        catch (Exception e)
        {
            new Exception("erro ao fazer a consulta no banco de dados");
            return null;
        }
    }
    
    public ArrayList<VendaAvulsa> buscaTodasVendas()
    {
        try
        {
            ArrayList<VendaAvulsa> array = new ArrayList<VendaAvulsa>();
            ObjectSet<VendaAvulsa> lista = bd_vendasavulsas.queryByExample(VendaAvulsa.class);
            for (VendaAvulsa v: lista)
            {
                array.add(v);
            }
            return array;
        }
        catch (Exception e)
        {
            new Exception("erro ao fazer a consulta no banco de dados");
            return null;
        }
    }
    
    public ArrayList<TabelaDePrecos> buscaPrecos(TabelaDePrecos tabela)
    {
        try
            {
                ArrayList<TabelaDePrecos> array = new ArrayList<TabelaDePrecos>();
                ObjectSet<TabelaDePrecos> lista = bd_tabela_precos.queryByExample(tabela);
                for (TabelaDePrecos t: lista)
                {
                    array.add(t);
                }
                return array;
            }
            catch (Exception e)
            {
                new Exception("erro ao fazer a consulta no banco de dados");
                return null;
            }
    }
    
    public ArrayList<Venda> buscaContas(Venda conta)
    {
        System.out.println(conta.getData() + " " + conta.getHorarioOcupacao());
        try
        {
            ArrayList<Venda> array = new ArrayList<Venda>();
            ObjectSet<Venda> lista = bd_contas.queryByExample(conta);
            for (Venda c: lista)
            {
                array.add(c);
            }
            return array;
        }
        catch (Exception e)
        {
            new Exception("erro ao fazer a consulta no banco de dados");
            return null;
        }
    }
    
    public ArrayList<Venda> buscaTodasContas()
    {
        try
        {
            ArrayList<Venda> array = new ArrayList<Venda>();
            ObjectSet<Venda> lista = bd_contas.queryByExample(Venda.class);
            for (Venda c: lista)
            {
                System.out.println(c.getData() + "    " + c.getHorarioOcupacao());
                array.add(c);
            }
            return array;
        }
        catch (Exception e)
        {
            new Exception("erro ao fazer a consulta no banco de dados");
            return null;
        }
    }

    public void removeCliente(Cliente cli)
    {
        try
        {
            ArrayList<Cliente> array = buscaClientes(cli);
            for (Cliente c: array)
            {
                bd_clientes.delete(c);
                bd_clientes.commit();
            }
        }
        catch (Exception e)
        {
            new Exception("erro ao remover um cadastro de cliente no banco de dados");
        }
    }
    
    public void removeReserva(Reserva res)
    {
        try
        {
            ArrayList<Reserva> array = buscaReserva(res);
            for (Reserva r: array)
            {
                bd_reservas.delete(r);
                bd_reservas.commit();
            }
        }
        catch (Exception e)
        {
            new Exception("erro ao remover um cadastro de cliente no banco de dados");
        }
    }
    
    public void removeFuncionario(Funcionario fun)
    {
        try
        {
            ArrayList<Funcionario> array = buscaFuncionarios(fun);
            for (Funcionario f: array)
            {
                bd_funcionarios.delete(f);
                bd_funcionarios.commit();
            }
        }
        catch (Exception e)
        {
            new Exception("erro ao remover um cadastro de funcionário no banco de dados");
        }
    }
    
    public void removeVenda(VendaAvulsa venda)
    {
        try
        {
            ArrayList<VendaAvulsa> array = buscaVendaAvulsa(venda);
            for (VendaAvulsa v: array)
            {
                bd_vendasavulsas.delete(v);
                bd_vendasavulsas.commit();
            }
        }
        catch (Exception e)
        {
            new Exception("erro ao remover um cadastro de funcionário no banco de dados");
        }
    }

    public void removeConta(Venda conta)
    {
        try
        {
            ArrayList<Venda> array = buscaContas(conta);
            for (Venda c: array)
            {
                bd_contas.delete(c);
                bd_contas.commit();
            }
        }
        catch (Exception e)
        {
            new Exception("erro ao remover um cadastro de funcionário no banco de dados");
        }
    }
    
    public void atualizaCliente(Cliente cli, String[] vetor)
    {
        try 
        {
            ArrayList<Cliente> array = buscaClientes(new Cliente
                    (vetor[0], null, null, null, vetor[1], null));
            for (Cliente c: array)
            {
                c.setNome(cli.getNome());
                c.setEndereco(cli.getEndereco());
                c.setCidade(cli.getCidade());
                c.setUf(cli.getUf());
                c.setTelefone(cli.getTelefone());
                c.setEmail(cli.getEmail());

                bd_clientes.store(c);
                bd_clientes.commit();
            }

        }
        catch (Exception e)
        {
            new Exception("erro ao atualizar um cadastro de cliente no banco de dados");
        }    
    }
    
    public void descomercializaProduto(Produto produto) {
        for (Produto produtoBase : buscaProdutos(produto)) {
            produtoBase.setComercializado(FALSE);
            bd_produtos.store(produtoBase);
            bd_produtos.commit();
        }
    }
    
    public void atualizaReserva(Reserva res, String[] vetor)
    {
        try
        {
            ArrayList<Reserva> array = buscaReserva(new Reserva(Integer.parseInt(vetor[6]),
                    vetor[0],vetor[3], vetor[4], null, new Cliente(vetor[1], null, null,
                    null, vetor[2], null)));
            for (Reserva r: array)
            {
                r.setNumeroPessoasReserva(res.getNumeroPessoasReserva());
                r.setTipoReserva(res.getTipoReserva());
                r.setDataReserva(res.getDataReserva());
                r.setHorarioReserva(res.getHorarioReserva());
                r.setInformacoesAdicionaisReserva(res.getInformacoesAdicionaisReserva());
                r.setCliente(res.getCliente());

                bd_reservas.store(r);
                bd_reservas.commit();
            }
        }
        catch (Exception e)
        {
            new Exception("erro ao atualizar um cadastro de reserva no banco de dados");
        }   
    }
    
    public void atualizaFuncionario(Funcionario fun, String[] vetor)
    {
        try
        {
            ArrayList<Funcionario> array = buscaFuncionarios(new Funcionario(vetor[0],
                    null, null, null, null, vetor[1], vetor[2], vetor[4]));
            for (Funcionario f: array)
            {
                f.setNome(fun.getNome());
                f.setEndereco(fun.getEndereco());
                f.setRg(fun.getRg());
                f.setCpf(fun.getCpf());
                f.setEstadoCivil(fun.getEstadoCivil());
                f.setTelefone(fun.getTelefone());
                f.setCargo(fun.getCargo());
                f.setSalario(fun.getSalario());

                bd_funcionarios.store(f);
                bd_funcionarios.commit();
            }
        }
        catch (Exception e)
        {
            new Exception("erro ao atualizar um cadastro de funcionário no banco de dados");
        }   
    }

}
