/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usu�rio
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
            JOptionPane.showMessageDialog(null, "Erro! Voc� n�o digitou o Nome do funcion�rio!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuFuncionario.getEndereco().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Voc� n�o digitou o Endere�o do funcion�rio!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuFuncionario.getRg().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Voc� n�o digitou o RG do funcion�rio!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuFuncionario.getCpf().equals("   .   .   -  "))
        {
            JOptionPane.showMessageDialog(null, "Erro! Voc� n�o digitou o CPF do funcion�rio!", 
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuFuncionario.getEstadoCivil().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Voc� n�o selecionou o Estado Civil do funcion�rio!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);            
        }
        else if (menuFuncionario.getTelefone().equals("(  )    -    "))
        {
            JOptionPane.showMessageDialog(null, "Erro! Voc� n�o digitou o Telefone do funcion�rio!",
                    "Erro!", JOptionPane.ERROR_MESSAGE);            
        }
        else if (menuFuncionario.getCargo().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Voc� n�o selecionou o Cargo do funcion�rio",
                    "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        else if (menuFuncionario.getSalario().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Erro! Voc� n�o digitou o Sal�rio do funcion�rio",
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
            JOptionPane.showMessageDialog(null, "Funcion�rio Cadastrado com Sucesso!",
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
                    "    " + fun.getCargo() + "    " + "Sal�rio:" + "    " +
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
        JOptionPane.showMessageDialog(null, "Funcion�rio Removido com Sucesso.",
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