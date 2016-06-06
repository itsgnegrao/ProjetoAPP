/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Cargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo
 */
public class ControleCargo {
    int id_cargo;
    String descricao;
    ArrayList<Cargo> cargoList = new ArrayList<>();

    public ArrayList<Cargo> getCargoList() {
        return cargoList;
    }
    
    public ControleCargo() {
        try {
            String string = "Select * from Cargo;";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                id_cargo = rs.getInt("id_cargo");
                descricao = rs.getString("descricao");
                Cargo cargo = new Cargo(id_cargo, descricao);
                cargoList.add(cargo);
            }
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ControleCargo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
