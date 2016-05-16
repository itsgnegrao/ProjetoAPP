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
    int salario_func;
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
            this.cpf_func = cpf_func;
            this.pis_func = pis_func;
            this.salario_func = salario_func;
            this.cargo_id = cargo_id;
            this.login_id = login_id;
        }
    }
}
