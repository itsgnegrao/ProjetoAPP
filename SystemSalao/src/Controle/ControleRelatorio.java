/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.awt.Desktop;
import Modelo.Atendimento;
import Modelo.Cliente;
import Modelo.Funcionario;
import Modelo.Servico;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bertuzzo
 */
public class ControleRelatorio {
    ArrayList<Cliente> cliList = new ArrayList<>();
    Cliente cli1;
    ArrayList<Funcionario> funcList = new ArrayList<>();
    Funcionario func1;
    ArrayList<Servico> servList = new ArrayList<>();
    Servico serv1;
    ArrayList<Atendimento> atendList = new ArrayList<>();
    Atendimento at1;
    
    public ArrayList<Atendimento> getControleAtend(String dtIni, String dtFin, int tipoUsu, String idUsu) {
        if(tipoUsu==1){  //USUARIO CLIENTE
            try {
                String string= "select * from Atendimento where id_cli=" +idUsu+ " and data between '" + dtIni + "' and '" + dtFin + "';";
                Connection conexao = ConnectionFactory.createConnection();
                PreparedStatement ps;
                ps = conexao.prepareStatement(string);
                ps.execute();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    at1 = new Atendimento(rs.getInt("id_atend"), rs.getInt("id_func"), rs.getInt("id_cli") , rs.getDate("data"), rs.getTime("horario"));
                    atendList.add(at1);
                }
                return atendList;
            } catch (SQLException ex) {
                Logger.getLogger(ControleAtendimento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(tipoUsu==2){ //USUARIO FUNCIONARIO
            try {
                String string= "select * from Atendimento where id_func=" +idUsu+ " and data between '" + dtIni + "' and '" + dtFin + "';";
                Connection conexao = ConnectionFactory.createConnection();
                PreparedStatement ps;
                ps = conexao.prepareStatement(string);
                ps.execute();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    at1 = new Atendimento(rs.getInt("id_atend"), rs.getInt("id_func"), rs.getInt("id_cli") , rs.getDate("data"), rs.getTime("horario"));
                    atendList.add(at1);
                }
                return atendList;
            } catch (SQLException ex) {
                Logger.getLogger(ControleAtendimento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(tipoUsu==3){  //DESC DE SERVICOS
            try {
                String string= "select * from Atendimento where id_cli=" +idUsu+ " and data between '" + dtIni + "' and '" + dtFin + "';";
                Connection conexao = ConnectionFactory.createConnection();
                PreparedStatement ps;
                ps = conexao.prepareStatement(string);
                ps.execute();
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    at1 = new Atendimento(rs.getInt("id_atend"), rs.getInt("id_func"), rs.getInt("id_cli") , rs.getDate("cpf_func"), rs.getTime("horario"));
                    atendList.add(at1);
                }
                return atendList;
            } catch (SQLException ex) {
                Logger.getLogger(ControleAtendimento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            //
        }
        return null;
    }
    public ArrayList<Servico> getControleServ() {
        try {
            String select = "Select * from Servico;";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                serv1 = new Servico(rs.getInt("id_serv"), rs.getString("descricao"), rs.getFloat("valor"));
                servList.add(serv1);
            }
            conexao.close();
            return servList;
        } catch (SQLException ex) {
            Logger.getLogger(ControleServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<Cliente> getControleCli() {
        try {
            String select = "Select * from Cliente;";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cli1 = new Cliente(rs.getInt("id_cli"), rs.getString("nome_cli"), rs.getDate("data_nasc_cli"), rs.getString("cpf_cli"), rs.getInt("login_id"), rs.getString("celular"));
                cliList.add(cli1);
            }
            conexao.close();
            return cliList;
        } catch (SQLException ex) {
            Logger.getLogger(ControleServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<Funcionario> getControleFunc() {
        try {
            String select = "Select * from Funcionario;";
            Connection conexao = ConnectionFactory.createConnection();
            PreparedStatement ps;
            ps = conexao.prepareStatement(select);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                func1 = new Funcionario(rs.getInt("id_func"), rs.getInt("idade_func"), rs.getString("nome_func") , rs.getString("cpf_func"), rs.getString("pis_func"), rs.getInt("cargo_id"), rs.getInt("login_id"), rs.getDate("nasc"));
                funcList.add(func1);
            }
            conexao.close();
            return funcList;
        } catch (SQLException ex) {
            Logger.getLogger(ControleServico.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void GerarRelat(ArrayList<Atendimento> arrayAtend) throws IOException {
    Document document = new Document();
          try {             
              PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\bertuzzo\\Documents\\GitHub\\ProjetoAPP\\SystemSalao\\src\\Gera.pdf"));
              document.open();
              Font f = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD, BaseColor.LIGHT_GRAY);
              // adicionando um parágrafo no documento
              Paragraph p1 = new Paragraph("Relatório de Atendimentos", f);
              p1.setAlignment(Element.ALIGN_CENTER);
              document.add(p1);
              document.add(new Paragraph("\n"));
              
              PdfPTable table = new PdfPTable(new float[] { 0.1f, 0.1f, 0.1f, 0.2f, 0.2f  });
              Font f2 = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD, BaseColor.BLACK);              
              Paragraph p2 = new Paragraph("                                  Atendimentos", f2);
              p2.setAlignment(Element.ALIGN_CENTER);
              PdfPCell header = new PdfPCell(p2);
              header.setColspan(5);
              table.addCell(header);
              table.addCell("ID Atend");
              table.addCell("ID Cli");
              table.addCell("ID Func");
              table.addCell("Data");
              table.addCell("Hora");
              
              for(Atendimento a1: arrayAtend){
                table.addCell(""+a1.getId_atend());
                table.addCell(""+a1.getId_cli());
                table.addCell(""+a1.getId_func());
                table.addCell(""+a1.getData());
                table.addCell(""+a1.getHorario());
              }
              document.add(table);
              JOptionPane.showMessageDialog(null, "Arquivo PDF exportado com sucesso");              
            }
          catch(DocumentException de) {
              System.err.println(de.getMessage());
          }
          catch(IOException ioe) {
              System.err.println(ioe.getMessage());
          }
          document.close();    
          Desktop desktop = Desktop.getDesktop();  
          desktop.open(new File("C:\\Users\\bertuzzo\\Documents\\GitHub\\ProjetoAPP\\SystemSalao\\src\\Gera.pdf"));
    }

}

