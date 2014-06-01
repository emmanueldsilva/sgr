/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class ControleFuncionarios {

    private MenuCadastroFuncionario menuFuncionario;
    private SGBD sgbd;
    private DefaultListModel listaFuncionarios;
    private Funcionario funcionario;
    
    public ControleFuncionarios(MenuCadastroFuncionario menuFuncionario)
    {
        this.menuFuncionario = menuFuncionario;
        sgbd = SGBD.getInstancia();
        listaFuncionariosNaTela();
    }

    public void validaDadosFuncionario()
    {
        if (menuFuncionario.getNome().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou o Nome do funcionário!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuFuncionario.getEndereco().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou o Endereço do funcionário!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuFuncionario.getRg().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou o RG do funcionário!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuFuncionario.getCpf().equals("   .   .   -  "))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou o CPF do funcionário!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuFuncionario.getEstadoCivil().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não selecionou o Estado Civil do funcionário!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);            
        }
        else if (menuFuncionario.getTelefone().equals("(  )    -    "))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou o Telefone do funcionário!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);            
        }
        else if (menuFuncionario.getCargo().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não selecionou o Cargo do funcionário",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuFuncionario.getSalario().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Você não digitou o Salário do funcionário",
                    "Erro!", JOptionPane.ERROR_MESSAGE);            
        }
        else
        {
            funcionario = new Funcionario(menuFuncionario.getNome(), 
                    menuFuncionario.getEndereco(), 
                    menuFuncionario.getRg(),
                    menuFuncionario.getCpf(), 
                    menuFuncionario.getEstadoCivil(), 
                    menuFuncionario.getTelefone(), 
                    menuFuncionario.getCargo(), 
                    menuFuncionario.getSalario());
            
            sgbd.armazenaFuncionario(funcionario);
            JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!",
                    "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            listaFuncionariosNaTela();
            limpaCamposFuncionario();
        }
    }
    
    
    public void listaFuncionariosNaTela()
    {
        listaFuncionarios = new DefaultListModel();
        for (Funcionario fun: sgbd.buscaFuncionarios(new Funcionario(null, null,
                null, null, null, null, null, null)))
        {
            listaFuncionarios.addElement(fun.getNome() + "    " + fun.getTelefone() +
                    "    " + fun.getCargo() + "    " + "Salário:" + "    " +
                    fun.getSalario());
        }
        menuFuncionario.setListaFuncionariosCadastrados(listaFuncionarios);
    }

    public void removeFuncionario(String funcionarioString)
    {
        String[] vetor = funcionarioString.split("    ");
        String nomeF = vetor[0];
        String telefoneF = vetor[1];
        String cargoF = vetor[2];
        String salarioF = vetor[4];
        sgbd.removeFuncionario(new Funcionario(nomeF, nomeF, null, null, null,
                telefoneF, cargoF, salarioF));
        
        listaFuncionariosNaTela();
        JOptionPane.showMessageDialog(null, "Funcionário Removido com Sucesso.",
                "Confirmado!", JOptionPane.INFORMATION_MESSAGE);
    }


    public void limpaCamposFuncionario()
    {
        menuFuncionario.setNome("");
        menuFuncionario.setEndereco("");
        menuFuncionario.setRg("");
        menuFuncionario.setCpf("");
        menuFuncionario.setEstadoCivil("");
        menuFuncionario.setTelefone("");
        menuFuncionario.setCargo("");
        menuFuncionario.setSalario("");
    }
    
    public void buscaCamposFuncionario(String funcionarioString)
    {
        String[] vetor = funcionarioString.split("    ");
        String nomeF = vetor[0];
        System.out.println(nomeF);
        String telefoneF = vetor[1];
        System.out.println(telefoneF);
        String cargoF = vetor[2];
        System.out.println(cargoF);
        String salarioF = vetor[4];
        System.out.println(salarioF);
        for (Funcionario fun: sgbd.buscaFuncionarios(new Funcionario(nomeF, null,
                null, null, null, telefoneF, cargoF, salarioF)))
        {
            menuFuncionario.setNome(fun.getNome());
            menuFuncionario.setEndereco(fun.getEndereco());
            menuFuncionario.setRg(fun.getRg());
            menuFuncionario.setCpf(fun.getCpf());
            menuFuncionario.setEstadoCivil(fun.getEstadoCivil());
            menuFuncionario.setTelefone(fun.getTelefone());
            menuFuncionario.setCargo(fun.getCargo());
            menuFuncionario.setSalario(fun.getSalario());
        }
    }
    
    public void atualizaFuncionario(Funcionario atualizaFuncionario, String funString)
    {
        String[] vetor = funString.split("    ");
        sgbd.atualizaFuncionario(atualizaFuncionario, vetor);

        listaFuncionariosNaTela();
        limpaCamposFuncionario();
    }
}