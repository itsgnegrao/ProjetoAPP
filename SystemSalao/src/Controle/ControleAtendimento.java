/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Atendimento;
import Modelo.Cargo;
import Modelo.Servico;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author negrao
 */
public class ControleAtendimento {

    ArrayList<Atendimento> atendList = new ArrayList<>();
    Atendimento atendimento;

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public ArrayList<Atendimento> getAtendList() {
        return atendList;
    }

    public ControleAtendimento() {
        try {
            String string = "Select * from Atendimento;";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                atendimento = new Atendimento(rs.getInt("id_atend"), rs.getInt("id_func"), rs.getInt("id_cli"), rs.getDate("data"), rs.getTime("horario"));
            }
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ControleAtendimento(int Ano, int Mes, int Dia) {
        try {
            String string = "Select * from Atendimento where data = '" + Ano + "-" + Mes + "-" + Dia + "' AND id_func IS NULL;";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                atendimento = new Atendimento(rs.getInt("id_atend"), rs.getInt("id_func"), rs.getInt("id_cli"), rs.getDate("data"), rs.getTime("horario"));
                atendList.add(atendimento);
            }
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ControleAtendimento(int id_atend) {
        try {
            String string = "Select * from Atendimento where id_atend = " + id_atend + ";";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                atendimento = new Atendimento(rs.getInt("id_atend"), rs.getInt("id_func"), rs.getInt("id_cli"), rs.getDate("data"), rs.getTime("horario"));
            }
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
