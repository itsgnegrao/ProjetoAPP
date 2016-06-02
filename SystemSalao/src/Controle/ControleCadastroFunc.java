/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo
 */
public class ControleCadastroFunc {
    int id_func;
    int idade_func;
    String nome_func;
    String cpf_func;
    String pis_func;
    float salario_func;
    int cargo_id;
    int login_id;
    public ControleCadastroFunc(String id_func, String idade_func, String nome_func, String cpf_func, String pis_func, String salario_func, String cargo_id, String login_id) throws SQLException {
        try{
            String string = "Insert INTO Cliente VALUES(" + id_func + "," + idade_func + ",'" + nome_func + "','" + cpf_func + "','" + pis_func + "'," + salario_func + "," + cargo_id + "," + login_id + ");";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            conexao.close();
        } catch(SQLException ex) {
            Logger.getLogger(ControleCadastroFunc.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("DEU NAO MLEKOTE");
        }
    }
}
