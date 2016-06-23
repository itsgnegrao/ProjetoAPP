package Modelo;

import Controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author NegrÃ£o
 */
public class Funcionario {

    int id_func;
    int idade_func;
    String nome_func;
    String cpf_func;
    String pis_func;
    int cargo_id;
    int login_id;
    Date nasc;

    public int getId_func() {
        return id_func;
    }

    public Date getNasc() {
        return nasc;
    }

    public int getIdade_func() {
        return idade_func;
    }

    public String getNome_func() {
        return nome_func;
    }

    public String getCpf_func() {
        return cpf_func;
    }

    public String getPis_func() {
        return pis_func;
    }

    public int getCargo_id() {
        return cargo_id;
    }

    public int getLogin_id() {
        return login_id;
    }

    public Funcionario(int id_func, int idade_func, String nome_func, String cpf_func, String pis_func, int cargo_id, int login_id, Date nasc) {
        this.id_func = id_func;
        this.idade_func = idade_func;
        this.nome_func = nome_func;
        this.cpf_func = cpf_func;
        this.pis_func = pis_func;
        this.cargo_id = cargo_id;
        this.login_id = login_id;
        this.nasc  = nasc;
    }
    
}
