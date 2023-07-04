
package br.com.login.controller;

import br.com.login.dao.LoginDAO;
import br.com.login.dao.conexao;
import br.com.login.view.CadastroView;
import br.com.login.view.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

public class LoginController {
    
    public void cadastroUsuario(CadastroView view) throws SQLException{
        Connection conexao = new conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getjTextFieldNome().getText(), view.getjTextFieldUsuario().getText(), view.getjPasswordFieldSenha().getText());
        
    
    }
    
     public void loginUsuario(LoginView view) throws SQLException{
        Connection conexao = new conexao().getConnection();
        LoginDAO login = new LoginDAO();
        login.loginUsuario(view.getjTextFieldUsuario().getText(), view.getjPasswordFieldSenha().getText());
        
    
    }
    
    
    
    
    
}
