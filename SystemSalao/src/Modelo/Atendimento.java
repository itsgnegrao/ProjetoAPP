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
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Leonardo
 */
public class Atendimento {
    int id_atend;
    int id_func;
    int id_cli;
    Date data;
    Time horario;

    public Atendimento(String string) throws SQLException {
        Connection conexao = ConnectionFactory.createConnection();
        PreparedStatement ps;
        ps = conexao.prepareStatement(string);
        ps.execute();
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            this.id_atend = rs.getInt("id_atend");
            this.id_func = rs.getInt("id_func");
            this.id_cli = rs.getInt("id_cli");
            this.data = rs.getDate("data");
            this.horario = rs.getTime("horario");
        }
        conexao.close();
    }
    
    
}
