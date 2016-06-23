/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControleServico {

    int id_serv;
    Servico servico;
    ArrayList<Servico> servList = new ArrayList<>();

    public ControleServico() {
        try {
            String select = "Select * from Servico;";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Servico servico = new Servico(rs.getInt("id_serv"), rs.getString("descricao"), rs.getFloat("valor"));
                servList.add(servico);
            }
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ControleServico(String string) {
        try {
            String str[] = string.split(" - ");
            String select = "Select * from Servico  natural join Servico_Atendimento  where id_atend = " + str[0] + ";";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Servico servico = new Servico(rs.getInt("id_serv"), rs.getString("descricao"), rs.getFloat("valor"));
                servList.add(servico);
            }
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleServico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Servico> getServList() {
        return servList;
    }

    public ControleServico(String descricao, String valor) throws SQLException {
        try {
            String string = "Select id_serv from Servico";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id_serv = rs.getInt("id_serv");
            }
            conexao.close();

            id_serv += 1;

            String string1 = "Insert INTO Servico VALUES(" + id_serv + ",'" + descricao + "'," + valor + ");";
            System.out.println(string1);
            Connection conexao1 = ConnectionFactory.createConnection();
            PreparedStatement ps1;
            ps1 = conexao1.prepareStatement(string1);
            ps1.execute();
            conexao1.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCadastroFunc.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("DEU NAO MLEKOTE");
        }

    }

    public ControleServico(int id_serv) throws SQLException {
        try {
            String string = "Select * from Servico where id_serv=" + id_serv + ";";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                servico = new Servico(rs.getInt("id_serv"), rs.getString("descricao"), rs.getFloat("valor"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleCadastroFunc.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("DEU NAO MLEKOTE");
        }
    }

    public Servico getServico() {
        return servico;
    }
}
