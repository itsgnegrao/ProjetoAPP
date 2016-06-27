/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControleAlterInsert;
import Controle.ControleCadastroCli;
import Modelo.Cliente;
import Modelo.Login;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FrameCadCli extends javax.swing.JInternalFrame {

    private Cliente cliente;
    private Login cliente_login;
    private int objetoBuscado = 0;

    public FrameCadCli() {
        initComponents();
        Xclose.setVisible(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        txtCel1 = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCpf4 = new javax.swing.JTextField();
        txtEstado = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        Xclose = new javax.swing.JButton();
        txtDia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCel2 = new javax.swing.JTextField();
        txtCpf1 = new javax.swing.JTextField();
        txtCpf2 = new javax.swing.JTextField();
        txtCpf3 = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 51), 5, true));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Salvar");
        jButton4.setPreferredSize(new java.awt.Dimension(175, 40));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtCel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCel1.setEnabled(false);
        txtCel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCel1FocusGained(evt);
            }
        });
        txtCel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCel1MouseClicked(evt);
            }
        });
        txtCel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCel1KeyPressed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText(".");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText(".");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("-");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("/");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("/");

        txtCpf4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpf4.setEnabled(false);
        txtCpf4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpf4KeyPressed(evt);
            }
        });

        txtEstado.setText("Busque para editar.");

        txtMes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMes.setEnabled(false);
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMesKeyPressed(evt);
            }
        });

        Xclose.setForeground(new java.awt.Color(255, 0, 51));
        Xclose.setText("X");
        Xclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XcloseActionPerformed(evt);
            }
        });

        txtDia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDia.setEnabled(false);
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiaKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Nome");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("CPF");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Celular");

        txtAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAno.setEnabled(false);
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });
        txtAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAnoKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Usuário");

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUser.setEnabled(false);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Senha");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CADASTRO/BUSCA DE CLIENTE");

        txtCel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCel2.setEnabled(false);
        txtCel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCel2ActionPerformed(evt);
            }
        });

        txtCpf1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpf1.setEnabled(false);
        txtCpf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpf1ActionPerformed(evt);
            }
        });
        txtCpf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpf1KeyPressed(evt);
            }
        });

        txtCpf2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpf2.setEnabled(false);
        txtCpf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpf2ActionPerformed(evt);
            }
        });
        txtCpf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpf2KeyPressed(evt);
            }
        });

        txtCpf3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCpf3.setEnabled(false);
        txtCpf3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpf3KeyPressed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Data Nasc");

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSenha.setEnabled(false);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.setPreferredSize(new java.awt.Dimension(175, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Novo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtEstado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel2))
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Xclose)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtDia)
                                                    .addComponent(txtCel1)
                                                    .addComponent(txtCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtCel2)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtAno))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtCpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtCpf3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtCpf4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                                                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))))))))
                        .addGap(22, 22, 22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(txtEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Xclose)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int retorno = -1;
        int soma = 0;
        if (objetoBuscado == 1 && verificaEdicao()) {
            retorno = JOptionPane.showConfirmDialog(null, "Deseja Editar o Cliente já cadastrado?");
            if (retorno == 0) {
                try {
                    String stringCli = "Update salaozao.cliente SET";
                    if (!cliente.getNome_cli().equals(txtNome.getText())) {
                        stringCli += " nome_cli = '" + txtNome.getText() + "'";
                        soma++;
                    }
                    String celular = txtCel1.getText() + txtCel2.getText();
                    if (!cliente.getCelular().equals(celular)) {
                        if (soma >= 1) {
                            stringCli += ",";
                        }
                        soma++;
                        stringCli += " celular = '" + celular + "'";
                    }
                    String cpf = txtCpf1.getText() + txtCpf2.getText() + txtCpf3.getText() + txtCpf4.getText();
                    if (!cliente.getCpf_cli().equals(cpf)) {
                        if (soma >= 1) {
                            stringCli += ",";
                        }
                        soma++;
                        stringCli += " cpf_cli = '" + cpf + "'";
                    }
                    String data_nasc = txtAno.getText() + "-" + txtMes.getText() + "-" + txtDia.getText();
                    if (!cliente.getData_nasc_cli().toString().equals(data_nasc)) {
                        if (soma >= 1) {
                            stringCli += ",";
                        }
                        soma++;
                        stringCli += " data_nasc_cli = '" + data_nasc + "'";
                    }
                    stringCli += " WHERE id_cli = " + cliente.getId_cli();

                    soma = 0;
                    String stringLogin = "Update salaozao.login SET";
                    if (!cliente_login.getUser().equals(txtUser.getText())) {
                        soma = 1;
                        stringLogin += " user = '" + txtUser.getText() + "'";
                    }
                    if (!cliente_login.getSenha().equals(txtSenha.getText())) {
                        if (soma == 1) {
                            stringLogin += ", ";
                        }
                        stringLogin += " senha = '" + txtSenha.getText() + "'";
                    }
                    stringLogin += " WHERE id_login = " + cliente.getLogin_id();

                    System.out.println(stringLogin);
                    ControleAlterInsert alter;
                    System.out.println(stringCli);
                    if (!stringCli.equals("Update salaozao.cliente SET WHERE id_cli = " + cliente.getId_cli())) {
                        alter = new ControleAlterInsert(stringCli);
                    }
                    if (!stringLogin.equals("Update salaozao.login SET WHERE id_login = " + cliente.getLogin_id())) {
                        alter = new ControleAlterInsert(stringLogin);
                    }
                    JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!");
                    dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(FrameCadCli.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (retorno == 1) {
                limpaRegistros();
                objetoBuscado = 0;
                Xclose.setVisible(false);
                jButton1.setVisible(true);

            }
        } else if (objetoBuscado == 1) {
            JOptionPane.showMessageDialog(null, "Usuario não Editado!");
        } else {
            try {
                String nome = txtNome.getText();
                String cpf = txtCpf1.getText() + txtCpf2.getText() + txtCpf3.getText() + txtCpf4.getText();
                String celular = txtCel1.getText() + txtCel2.getText();
                String data_nasc = txtAno.getText() + "-" + txtMes.getText() + "-" + txtDia.getText();
                String user = txtUser.getText();
                String senha = txtSenha.getText();

                System.out.println(nome + " " + cpf + " " + celular + " " + data_nasc + " " + user + " " + senha);

                ControleCadastroCli novo_cli = new ControleCadastroCli(nome, data_nasc, cpf, celular, user, senha);
                JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(FrameCadCli.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtCel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCel1FocusGained
        txtCel1.setText("");
    }//GEN-LAST:event_txtCel1FocusGained

    private void txtCel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCel1MouseClicked
        txtCel1.setText("");
    }//GEN-LAST:event_txtCel1MouseClicked

    private void txtCel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCel1KeyPressed
        if (txtCel1.getText().length() == 1) {
            txtCel2.grabFocus();
        }
    }//GEN-LAST:event_txtCel1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtBuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o Campo ID!");
        }
        txtAno.enable(true);
        txtBuscar.enable(true);
        txtCel1.enable(true);
        txtCel2.enable(true);
        txtCpf1.enable(true);
        txtCpf2.enable(true);
        txtCpf3.enable(true);
        txtCpf4.enable(true);
        txtDia.enable(true);
        txtEstado.enable(true);
        txtMes.enable(true);
        txtNome.enable(true);
        txtSenha.enable(true);
        txtUser.enable(true);
        ControleCadastroCli cliente_busca = new ControleCadastroCli(Integer.valueOf(txtBuscar.getText()));
        cliente = cliente_busca.getCliente();
        if (cliente != null) {
            cliente_login = cliente_busca.getCliente_login();
            txtNome.setText(cliente.getNome_cli());

            String cpf_cli = cliente.getCpf_cli();
            txtCpf1.setText(cpf_cli.substring(0, 3));
            txtCpf2.setText(cpf_cli.substring(3, 6));
            txtCpf3.setText(cpf_cli.substring(6, 9));
            txtCpf4.setText(cpf_cli.substring(9, 11));

            String celular = cliente.getCelular();
            txtCel1.setText(celular.substring(0, 2));
            txtCel2.setText(celular.substring(2));

            Date data = cliente.getData_nasc_cli();
            txtAno.setText(data.toString().substring(0, 4));
            txtMes.setText(data.toString().substring(5, 7));
            txtDia.setText(data.toString().substring(8, 10));

            String user = cliente_login.getUser();
            String senha = cliente_login.getSenha();
            txtUser.setText(user);
            txtSenha.setText(senha);
            //System.out.println(user + " " + senha);
        }
        jButton1.setVisible(false);
        objetoBuscado = 1;
        txtEstado.setText("Clique no X para excluir busca e cadastrar novo");
        Xclose.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCpf4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpf4KeyPressed
        if (txtCpf4.getText().length() == 1) {
            txtCel1.grabFocus();
        }
    }//GEN-LAST:event_txtCpf4KeyPressed

    private void txtMesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesKeyPressed
        if (txtMes.getText().length() == 1) {
            txtAno.grabFocus();
        }
    }//GEN-LAST:event_txtMesKeyPressed

    private void XcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XcloseActionPerformed
        cliente = null;
        limpaRegistros();
        objetoBuscado = 0;
        Xclose.setVisible(false);
        txtEstado.setText("Busque para editar.");
        jButton1.setVisible(true);
    }//GEN-LAST:event_XcloseActionPerformed

    private void txtDiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaKeyPressed
        if (txtDia.getText().length() == 1) {
            txtMes.grabFocus();
        }
    }//GEN-LAST:event_txtDiaKeyPressed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void txtAnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoKeyPressed
        if (txtAno.getText().length() == 3) {
            txtUser.grabFocus();
        }
    }//GEN-LAST:event_txtAnoKeyPressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtCel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCel2ActionPerformed

    private void txtCpf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpf1ActionPerformed

    private void txtCpf1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpf1KeyPressed
        if (txtCpf1.getText().length() == 2) {
            txtCpf2.grabFocus();
        }
    }//GEN-LAST:event_txtCpf1KeyPressed

    private void txtCpf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpf2ActionPerformed

    private void txtCpf2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpf2KeyPressed
        if (txtCpf2.getText().length() == 2) {
            txtCpf3.grabFocus();
        }
    }//GEN-LAST:event_txtCpf2KeyPressed

    private void txtCpf3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpf3KeyPressed
        if (txtCpf3.getText().length() == 2) {
            txtCpf4.grabFocus();
        }
    }//GEN-LAST:event_txtCpf3KeyPressed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE && txtBuscar.getText().length() == 1) {
            Xclose.doClick();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
        txtAno.setText("");
        txtBuscar.setText("");
        txtCel1.setText("");
        txtCel2.setText("");
        txtCpf1.setText("");
        txtCpf2.setText("");
        txtCpf3.setText("");
        txtCpf4.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtUser.setText("");
        txtSenha.setText("");
        txtBuscar.enable(false);
        txtAno.enable(true);
        txtCel1.enable(true);
        txtCel2.enable(true);
        txtCpf1.enable(true);
        txtCpf2.enable(true);
        txtCpf3.enable(true);
        txtCpf4.enable(true);
        txtDia.enable(true);
        txtEstado.enable(true);
        txtMes.enable(true);
        txtNome.enable(true);
        txtSenha.enable(true);
        txtUser.enable(true);
        txtNome.grabFocus();

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Xclose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCel1;
    private javax.swing.JTextField txtCel2;
    private javax.swing.JTextField txtCpf1;
    private javax.swing.JTextField txtCpf2;
    private javax.swing.JTextField txtCpf3;
    private javax.swing.JTextField txtCpf4;
    private javax.swing.JTextField txtDia;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private boolean verificaEdicao() {
        int soma = 0;

        if (!cliente.getNome_cli().equals(txtNome.getText())) {
            soma++;
        }
        String celular = txtCel1.getText() + txtCel2.getText();
        if (!cliente.getCelular().equals(celular)) {
            soma++;
        }
        String cpf = txtCpf1.getText() + txtCpf2.getText() + txtCpf3.getText() + txtCpf4.getText();
        if (!cliente.getCpf_cli().equals(cpf)) {
            soma++;
        }
        String data_nasc = txtAno.getText() + "-" + txtMes.getText() + "-" + txtDia.getText();
        if (!cliente.getData_nasc_cli().toString().equals(data_nasc)) {
            soma++;
        }
        if (!cliente_login.getUser().equals(txtUser.getText())) {
            soma++;
        }
        if (!cliente_login.getSenha().equals(txtSenha.getText())) {
            soma++;
        }

        if (soma > 0) {
            return true;
        } else {
            return false;
        }
    }

    private void limpaRegistros() {
        txtNome.setText("");
        txtAno.setText("");
        txtBuscar.setText("");
        txtCel1.setText("");
        txtCel2.setText("");
        txtCpf1.setText("");
        txtCpf2.setText("");
        txtCpf3.setText("");
        txtCpf4.setText("");
        txtDia.setText("");
        txtMes.setText("");
        txtUser.setText("");
        txtSenha.setText("");
        txtAno.enable(false);
        txtBuscar.enable(true);
        txtCel1.enable(false);
        txtCel2.enable(false);
        txtCpf1.enable(false);
        txtCpf2.enable(false);
        txtCpf3.enable(false);
        txtCpf4.enable(false);
        txtDia.enable(false);
        txtEstado.enable(false);
        txtMes.enable(false);
        txtNome.enable(false);
        txtSenha.enable(false);
        txtUser.enable(false);
    }
}
