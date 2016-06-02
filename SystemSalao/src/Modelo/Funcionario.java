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
    float salario_func;
    int cargo_id;
    int login_id;

    public Funcionario(int id_func, int idade_func, String nome_func, String cpf_func, String pis_func, float salario_func, int cargo_id, int login_id) {
        this.id_func = id_func;
        this.idade_func = idade_func;
        this.nome_func = nome_func;
        this.cpf_func = cpf_func;
        this.pis_func = pis_func;
        this.salario_func = salario_func;
        this.cargo_id = cargo_id;
        this.login_id = login_id;
    }
    
}
