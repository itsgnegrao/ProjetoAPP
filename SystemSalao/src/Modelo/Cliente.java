/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Leonardo
 */
public class Cliente {

    int id_cli;
    String nome_cli;
    Date data_nasc_cli;
    String cpf_cli;
    int login_id;
    String celular;

    public int getId_cli() {
        return id_cli;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public Date getData_nasc_cli() {
        return data_nasc_cli;
    }

    public String getCpf_cli() {
        return cpf_cli;
    }

    public int getLogin_id() {
        return login_id;
    }

    public String getCelular() {
        return celular;
    }
   
    public Cliente(int id_cli, String nome_cli, Date data_nasc_cli, String cpf_cli, int login_id, String celular) {
        this.id_cli = id_cli;
        this.nome_cli = nome_cli;
        this.data_nasc_cli = data_nasc_cli;
        this.cpf_cli = cpf_cli;
        this.login_id = login_id;
        this.celular = celular;
    }
    
}
