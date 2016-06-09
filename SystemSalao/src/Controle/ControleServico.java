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
            String str[] = string.split("-");
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

}
