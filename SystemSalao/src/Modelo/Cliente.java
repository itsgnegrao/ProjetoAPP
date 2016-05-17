/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Leonardo
 */
public class Cliente {

    int id_cli;
    String nome_cli;
    Date data_nasc_cli;
    String cpf_cli;
    int login_id;
    String celular;
    
    public Cliente(String string) throws SQLException {
        Connection conexao = ConnectionFactory.createConnection();
        PreparedStatement ps;
        ps = conexao.prepareStatement(string);
        ps.execute();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            this.id_cli = rs.getInt("id_cli");
            this.nome_cli = rs.getString("nome_cli");
            this.data_nasc_cli = rs.getDate("data_nasc_cli");
            this.cpf_cli = rs.getString("cpf_cli");
            this.login_id = rs.getInt("login_id");
            this.celular = rs.getString("celular");
        }
    }
}