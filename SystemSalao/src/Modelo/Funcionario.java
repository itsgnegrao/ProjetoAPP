package Modelo;

import Controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Negrão
 */
public class Funcionario {

    int id_func;
    int idade_func;
    String nome_func;
    String cpf_func;
    String pis_func;
    float salario_func;
    int cargo_id;
    int login_id;

    public Funcionario(String string) throws SQLException {
        Connection conexao = ConnectionFactory.createConnection();
        PreparedStatement ps;
        ps = conexao.prepareStatement(string);
        ps.execute();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            this.id_func = rs.getInt("id_func");
            this.idade_func = rs.getInt("idade_func");
            this.nome_func = rs.getString("nome_func");
            this.cpf_func = rs.getString("cpf_func");
            this.pis_func = rs.getString("pis_func");
            this.salario_func = rs.getFloat("salario_func");
            this.cargo_id = rs.getInt("cargo_id");
            this.login_id = rs.getInt("login_id");
        }
        conexao.close();
    }
}
