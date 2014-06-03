/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemarestaurante;

/**
 *
 * @author filaboia
 */
public class Usuario {
    
    private final String login;
    private final String senha;
    
    public static class UsuarioBuilder {
        
        private String login;
        private String senha;

        public UsuarioBuilder setLogin(String login) {
            this.login = login;
            return this;
        }

        public UsuarioBuilder setSenha(String senha) {
            this.senha = senha;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
        
    }
    
    private Usuario(UsuarioBuilder usuarioBuilder) {
        login = usuarioBuilder.login;
        senha = usuarioBuilder.senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
}
