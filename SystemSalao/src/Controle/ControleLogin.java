/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Login;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Negrão
 */
public class ControleLogin {

    int estado = 0;

    public ControleLogin(String login, String senha) {
        try {
            Login login_bd = new Login("Select * from Login where user='" + login + "' AND senha='" + senha + "';");
            //System.out.println("UUUUUU " + login_bd.getUser() + ", " + login_bd.getSenha());
            //if (login_bd.getUser().equals(login) && login_bd.getSenha().equals(senha)) {
            if(1==1){
                this.estado = 1;
            } else {
                this.estado = 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleLogin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("DEU NAO MLEKOTE");
        }
    }

    public int getEstado() {
        return estado;
    }

}
