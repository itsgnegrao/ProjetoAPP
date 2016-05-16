/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Leonardo
 */
public class Cliente {

    int id_cli;
    String nome_cli;
    String data_nasc_cli;
    String cpf_cli;
    int login_id;
    String celular;
    public Cliente(String string) throws SQLException {
        Connection conexao = ConnectionFactory.createConnection();
        PreparedStatement ps;
        ps = conexao.prepareStatement(string);
        ps.execute();
    }
}
