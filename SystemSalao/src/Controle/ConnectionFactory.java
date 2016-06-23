package Controle;

import Modelo.Cliente;
import Modelo.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Esta classe estabelece a conexao com o banco de dados e retorna o objeto conexao.
 * @author Negrão
 */
public class ConnectionFactory {

    public static Connection createConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado!" + e);
        }
        String url = "jdbc:mysql://127.0.0.1:3306/salaozao";
        String user = "root";
        String password = "";
        
        Connection conexao;
        conexao = DriverManager.getConnection(url, user, password);
        return conexao;
    }
}
