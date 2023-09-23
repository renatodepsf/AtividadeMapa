package br.edu.unicesumar.core.dao;

import br.edu.unicesumar.core.dao.conexao.ConexaoJDBC;
import br.edu.unicesumar.core.entity.Usuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    public void cadastrarUsuario(Usuario usuario) {
        try {
            String query = "insert into usuario (nome, login, senha, email) values (?, ?, ?, ?)";
            PreparedStatement statement = ConexaoJDBC.getConexao().prepareStatement(query);
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
}
