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
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Leonardo
 */
public class Atendimento {
    int id_atend;
    int id_func;
    int id_cli;
    Date data;
    Time horario;    

    public Atendimento(int id_atend, int id_func, int id_cli, Date data, Time horario) {
        this.id_atend = id_atend;
        this.id_func = id_func;
        this.id_cli = id_cli;
        this.data = data;
        this.horario = horario;
    }
    
}
