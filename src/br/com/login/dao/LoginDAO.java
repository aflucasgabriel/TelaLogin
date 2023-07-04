
package br.com.login.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    
    public void cadastrarUsuario(String nome, String usuario, String senha)throws SQLException{
        Connection conexao = new conexao().getConnection();
        String sql = "INSERT INTO login(nome, usuario, senha) VALUES('"+nome+"', '"+usuario+"', '"+senha+"')";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.execute();
        conexao.close();
      
    }
    
    public void loginUsuario(String usuario, String senha) throws SQLException{
        Connection conexao = new conexao().getConnection();
        String sql = "SELECT usuario, senha FROM login WHERE usuario = '"+usuario+"'AND senha = '"+senha+"'";
        
        PreparedStatement statement = conexao.prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        conexao.close();
        
    }
    
}
