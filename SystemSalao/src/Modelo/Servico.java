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
public class Servico {
    int id_serv;
    String descricao;
    float valor;

    public Servico(String string) throws SQLException {
        Connection conexao = ConnectionFactory.createConnection();
        PreparedStatement ps;
        ps = conexao.prepareStatement(string);
        ps.execute();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            this.id_serv = rs.getInt("id_serv");
            this.descricao = rs.getString("descricao");
            this.valor = rs.getFloat("valor");
        }
        conexao.close();
    }
}
