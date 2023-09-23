package br.edu.unicesumar.core.dao;

import br.edu.unicesumar.core.dao.conexao.ConexaoJDBC;
import br.edu.unicesumar.core.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAOImpl implements UsuarioDAO{
    
    @Override
    public void cadastrarUsuario(Usuario usuario) {
        try {
            String query = "insert into usuario (nome, login, senha, email) values (?, ?, ?, ?)";
            PreparedStatement statement = ConexaoJDBC.conectar().prepareStatement(query);
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getLogin());
            statement.setString(3, usuario.getSenha());
            statement.setString(4, usuario.getEmail());
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Erro ao cadastrar usuário");
        }
    }

    @Override
    public void acessar(Usuario usuario) {
        try {
            ConexaoJDBC.conectar();
            Connection conexao = null;
            
            PreparedStatement preparedStatement = conexao.prepareStatement("SELECT id, nome, login, senha , email from usuario where login = ? and senha = ?");
            preparedStatement.setString(1, usuario.getLogin());
            preparedStatement.setString(1, usuario.getSenha());
            
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet != null) {
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Erro ao cadastrar usuário");
        }
    }
}
