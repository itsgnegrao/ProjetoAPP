/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    Login login;

    public Login getLogin() {
        return login;
    }

    public int getEstado() {
        return estado;
    }

    public ControleLogin(String user, String senha) {
        try {
            String string = "Select * from Login where user='" + user + "' AND senha='" + senha + "';";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                login = new Login(rs.getInt("id_login"), rs.getString("user"), rs.getString("senha"));
            }
            conexao.close();
            if (login == null) {
                JOptionPane.showMessageDialog(null, "Usuario Não Cadastrado!");
                this.estado = 0;
            }
            if (login.getUser().equals(user) && login.getSenha().equals(senha)) {
                this.estado = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControleLogin.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("DEU NAO MLEKOTE");
        }
    }

}
