
package br.edu.unicesumar.core.dao.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoJDBC {
    
    private static final String URL = "jdbc:mysql://localhost:3306/mapa";
    private static final String USER = "root";
    private static final String PASSWORD = "170272";
    
    public static Connection conexao;
    
    public static Connection conectar() {
        try {
            if(conexao == null) {
                conexao = DriverManager.getConnection(URL, USER, PASSWORD);
                return conexao;
            }
            return conexao;
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Erro ao conectar no banco de dados");
            return null;
        }
    }
    
    public static Connection desconectar() {
        try {
            if(conexao != null) {
                conexao.close();
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(null, "Não foi possível desconectar o banco de dados");
            return null;
        }
        return conexao;
    }
}
