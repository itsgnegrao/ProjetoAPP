/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Negrão
 */
public class ControleAlterInsert {

    public ControleAlterInsert(String string) throws SQLException {
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            conexao.close();
    }
    
}
