package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
        String url = "jdbc:mysql://localhost:3306/salaozao";
        String user = "root";
        String password = "";
        Connection conexao;
        conexao = DriverManager.getConnection(url, user, password);
        return conexao;
    }
}
