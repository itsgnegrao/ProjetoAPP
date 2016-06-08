/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Cliente;
import Modelo.Login;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class ControleCadastroCli {

    int id_cli_con;
    int login_id;
    Cliente cliente;
    Login cliente_login;

    public Cliente getCliente() {
        return cliente;
    }

    public Login getCliente_login() {
        return cliente_login;
    }

    public ControleCadastroCli(int id_cli) {
        try {
            String string = "Select * from Cliente where id_cli=" + id_cli + ";";
            String string1 = "Select * from Login l, Cliente_Login cl where l.id_login = cl.id_login AND cl.id_cli =" + id_cli + ";";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cliente = new Cliente(rs.getInt("id_cli"), rs.getString("nome_cli"), rs.getDate("data_nasc_cli"), rs.getString("cpf_cli"), rs.getInt("login_id"), rs.getString("celular"));
            }
            
            if (cliente == null) {
                JOptionPane.showMessageDialog(null, "Cliente Não Cadastrado!");
            }
            
            ps = conexao.prepareStatement(string1);
            ps.execute();
            rs = ps.executeQuery();
            while (rs.next()) {
                cliente_login = new Login(id_cli, rs.getString("user"), rs.getString("senha"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControleCadastroCli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ControleCadastroCli(String nome_cli, String data_nasc_cli, String cpf_cli, String celular, String user, String senha) throws SQLException {
        try {
            //busca novo_id cli
            String string = "Select id_cli,login_id from Cliente";

            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                id_cli_con = rs.getInt("id_cli");
                login_id = rs.getInt("login_id");
            }

            id_cli_con += 2;
            login_id += 2;

            String string1 = "Insert INTO cliente VALUES(" + id_cli_con + ",'" + nome_cli + "','" + data_nasc_cli + "','" + cpf_cli + "'," + login_id + ",'" + celular + "');";
            String string2 = "Insert INTO login VALUES(" + login_id + ",'" + user + "','" + senha + "');";
            String string3 = "Insert INTO cliente_login VALUES(" + id_cli_con + "," + login_id + ");";

            ps = conexao.prepareStatement(string1);
            ps.execute();

            ps = conexao.prepareStatement(string2);
            ps.execute();

            ps = conexao.prepareStatement(string3);
            ps.execute();

            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCadastroCli.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("DEU NAO MLEKOTE");
        }
    }
}
