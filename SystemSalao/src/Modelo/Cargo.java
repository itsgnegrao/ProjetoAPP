/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Leonardo
 */
public class Cargo {
    int id_cargo;
    String descricao;

    public Cargo(String string) throws SQLException {
        Connection conexao = ConnectionFactory.createConnection();
        PreparedStatement ps;
        ps = conexao.prepareStatement(string);
        ps.execute();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            this.id_cargo = rs.getInt("id_cargo");
            this.descricao = rs.getString("descricao");
        }
        conexao.close();
    }
    
}
