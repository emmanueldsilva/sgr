/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

import java.util.ArrayList;

/**
 *
 * @author filaboia
 */
public class ControleUsuario {

    public Usuario buscaUsuario(String login, String senha) {
       final Usuario usuario = new Usuario.UsuarioBuilder()
                .setLogin(login)
                .setSenha(senha)
                .build();
        
        ArrayList<Usuario> usuarios = SGBD.getInstancia().buscaUsuarios(usuario);
        
        if (usuarios.size() == 1) {
            return usuarios.get(0);
        } else if (usuarios.isEmpty()) {
            throw new RuntimeException("Usuário não encontrado.");
        } else {
            throw new RuntimeException("Base inconsistente, avise o Batman por favor.");
        }
    }
    
}
