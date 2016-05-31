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
    int id_login;
    String senha_bd;
    String user;

    public ControleLogin(String login, String senha) {
        try {
            String string = "Select * from Login where user='" + login + "' AND senha='" + senha + "';";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id_login = rs.getInt("id_login");
                senha_bd = rs.getString("senha");
                user = rs.getString("user");
            }
            conexao.close();
            Login login_bd = new Login(id_login, user, senha_bd);
            System.out.println("UUUUUU " + login_bd.getUser() + ", " + login_bd.getSenha());
            if (login_bd.getUser() == null) {
                JOptionPane.showMessageDialog(null, "Usuario Não Cadastrado!");
                this.estado = 0;
            }
            if (login_bd.getUser().equals(login) && login_bd.getSenha().equals(senha)) {
                this.estado = 1;
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
