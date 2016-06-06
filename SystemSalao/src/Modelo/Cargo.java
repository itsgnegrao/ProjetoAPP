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
public class Cargo {
    int id_cargo;
    String descricao;

    public int getId_cargo() {
        return id_cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Cargo(int id_cargo, String descricao) {
        this.id_cargo = id_cargo;
        this.descricao = descricao;
    }
    
}
