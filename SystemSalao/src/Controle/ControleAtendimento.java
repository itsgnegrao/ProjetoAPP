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

    public ArrayList<Atendimento> getAtendList() {
        return atendList;
    }

    public ControleAtendimento(int Ano, int Mes, int Dia) {
        try {
            String string = "Select * from Atendimento where data = '" +Ano+"-"+Mes+"-"+Dia+"';";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Atendimento atendimento = new Atendimento(rs.getInt("id_atend"), rs.getInt("id_func"), rs.getInt("id_cli"), rs.getDate("data"), rs.getTime("horario"));
                atendList.add(atendimento);
            }                
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
