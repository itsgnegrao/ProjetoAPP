/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Cliente;
import Modelo.Funcionario;
import Modelo.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo
 */
public class ControleCadastroFunc {
    Funcionario funcionario;
    Login funcionario_login;
    
    public ControleCadastroFunc(int id_func) {
        try {
            String string = "Select * from Funcionario where id_func=" + id_func + ";";
            String string1 = "Select * from Login natural join funcionario_login";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(string);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                funcionario = new Funcionario( rs.getInt("id_func"), rs.getInt("idade_func"), rs.getString("nome_func") , rs.getString("cpf_func"), rs.getString("pis_func"), rs.getFloat("salario_func"), rs.getInt("cargo_id"), rs.getInt("login_id"));
            }

            ps = conexao.prepareStatement(string1);
            ps.execute();
            rs = ps.executeQuery();
            while (rs.next()) {
                funcionario_login = new Login(id_func, rs.getString("user"), rs.getString("senha"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControleCadastroCli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    int id_func;
    public ControleCadastroFunc(String idade_func, String nome_func, String cpf_func, String pis_func, String salario_func, String cargo_id, String login_id) throws SQLException {
        try{
            String string1 = "Select id_func from Funcionario";
            Connection conexao1 = ConnectionFactory.createConnection();
            PreparedStatement ps1;
            ps1 = conexao1.prepareStatement(string1);
            ps1.execute();
            ResultSet rs = ps1.executeQuery();
            while(rs.next()){
                id_func = rs.getInt("id_func");
            }
            conexao1.close();
            
            id_func += 2;
            
            String string = "Insert INTO Funcionario VALUES(" + id_func + "," + idade_func + ",'" + nome_func + "','" + cpf_func + "','" + pis_func + "'," + salario_func + "," + cargo_id + "," + login_id + ");";
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
