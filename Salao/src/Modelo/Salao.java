package Modelo;

import Controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Negrão
 */
public class Salao {
    
    public static void main(String[] args) throws SQLException {
        String string = "show tables;"; //apenas para teste.
        Connection conexao = ConnectionFactory.createConnection();
        PreparedStatement ps;
        ps = conexao.prepareStatement(string);
        ps.execute();
        System.out.println(" SE CHEGOU AQUI DEU CERTO! SEM ERRO NA CONEXÃO COM O MYSQL");
    }

}
