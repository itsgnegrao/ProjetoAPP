/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Visao.FrameLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author a1602020
 */
public class SystemSalao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String string = "show tables;"; //apenas para teste.
        Connection conexao = ConnectionFactory.createConnection();
        PreparedStatement ps;
        ps = conexao.prepareStatement(string);
        ps.execute();
        System.out.println(" SE CHEGOU AQUI DEU CERTO! SEM ERRO NA CONEXÃO COM O MYSQL");
        FrameLogin fl1 = new FrameLogin();
        fl1.setVisible(true);
    }
    
}
