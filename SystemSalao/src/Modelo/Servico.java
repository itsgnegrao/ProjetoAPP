    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controle.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Leonardo
 */
public class Servico {
    int id_serv;
    String descricao;
    float valor;

    public Servico(int id_serv, String descricao, float valor) {
        this.id_serv = id_serv;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId_serv() {
        return id_serv;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

}
