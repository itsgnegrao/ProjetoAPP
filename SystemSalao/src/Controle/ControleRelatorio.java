/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Cliente;
import Modelo.Funcionario;
import Modelo.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bertuzzo
 */
public class ControleRelatorio {
    ArrayList<Cliente> cliList = new ArrayList<>();
    Cliente cli1;
    ArrayList<Funcionario> funcList = new ArrayList<>();
    Funcionario func1;
    ArrayList<Servico> servList = new ArrayList<>();
    Servico serv1;
    
    public ArrayList<Servico> getControleServ() {
        try {
            String select = "Select * from Servico;";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                serv1 = new Servico(rs.getInt("id_serv"), rs.getString("descricao"), rs.getFloat("valor"));
                servList.add(serv1);
            }
            conexao.close();
            return servList;
        } catch (SQLException ex) {
            Logger.getLogger(ControleServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<Cliente> getControleCli() {
        try {
            String select = "Select * from Cliente;";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cli1 = new Cliente(rs.getInt("id_cli"), rs.getString("nome_cli"), rs.getDate("data_nasc_cli"), rs.getString("cpf_cli"), rs.getInt("login_id"), rs.getString("celular"));
                cliList.add(cli1);
            }
            conexao.close();
            return cliList;
        } catch (SQLException ex) {
            Logger.getLogger(ControleServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<Funcionario> getControleFunc() {
        try {
            String select = "Select * from Funcionario;";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                func1 = new Funcionario(rs.getInt("id_func"), rs.getInt("idade_func"), rs.getString("nome_func") , rs.getString("cpf_func"), rs.getString("pis_func"), rs.getInt("cargo_id"), rs.getInt("login_id"), rs.getString("nasc"));
                funcList.add(func1);
            }
            conexao.close();
            return funcList;
        } catch (SQLException ex) {
            Logger.getLogger(ControleServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}

