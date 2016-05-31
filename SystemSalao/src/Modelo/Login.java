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
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class Login {

    int id_login;
    String user;
    String senha;

    public Login(int id_login, String user, String senha) {
        this.id_login = id_login;
        this.user = user;
        this.senha = senha;
    }
    
    

    public int getId_login() {
        return id_login;
    }

    public String getUser() {
        return user;
    }

    public String getSenha() {
        return senha;
    }

}
