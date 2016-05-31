/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo
 */
public class ControleCadastroCli {
    
    public ControleCadastroCli(String id_cli, String nome_cli, String data_nasc_cli, String cpf_cli, String login_id, String celular) throws SQLException {
        try{
            String string = "Insert INTO Cliente VALUES(" + id_cli + ",'" + nome_cli + "'," + data_nasc_cli + ",'" + cpf_cli + "'," + login_id + ",'" + celular + "');";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            conexao.close();
        } catch(SQLException ex) {
            Logger.getLogger(ControleCadastroCli.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("DEU NAO MLEKOTE");
        }
    }
}
