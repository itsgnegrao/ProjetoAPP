/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.Atendimento;
import Modelo.Cliente;
import Controle.ControleAtendimento;
import Controle.ControleCadastroCli;
import Controle.ControleServico;
import Modelo.Servico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class FrameAtendimento extends javax.swing.JFrame {

    public FrameAtendimento() {
        initComponents();
        ControleCadastroCli conCli;
        Cliente cliente;
        ControleAtendimento ConAtend = new ControleAtendimento(2016, 6, 30);
        ArrayList<Atendimento> atendList = ConAtend.getAtendList();
        DefaultListModel model = new DefaultListModel();
        String id;
        for (int i = 0; i < atendList.size(); i++) {
            conCli = new ControleCadastroCli(atendList.get(i).getId_cli());
            cliente = conCli.getCliente();
            id = Integer.toString(atendList.get(i).getId_atend());
            model.addElement(id + "-"+cliente.getId_cli()+"-" + cliente.getNome_cli());
        }
        Lista_Atendimento.setModel(model);
                
        ControleServico conServ = new ControleServico();
        Servico servico;
        ArrayList<Servico> servList = conServ.getServList();
        DefaultListModel model2 = new DefaultListModel();
        for (int i = 0; i < servList.size(); i++) {
            model2.addElement(servList.get(i).getId_serv()+" - " + servList.get(i).getDescricao()+" - " + servList.get(i).getValor());
        }
        Lista_Servicos.setModel(model2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdCli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdFunc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ValorTotal = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtDataDia = new javax.swing.JTextField();
        txtDataMes = new javax.swing.JTextField();
        txtDataAno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista_Atendimento = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblValorTotal1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Recebido = new javax.swing.JTextField();
        lblValorTotal2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ValorTotal1 = new javax.swing.JLabel();
        Troco = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista_Servicos = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("CONTROLE ATENDIMENTO");

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        jLabel3.setText("ID Cliente");

        txtIdCli.setEditable(false);
        txtIdCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdCliMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setText("ID Funcionário");

        jLabel5.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        jLabel5.setText("Data");

        jLabel6.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        jLabel6.setText("Horário");

        txtIdFunc.setFont(new java.awt.Font("Droid Sans Fallback", 1, 18)); // NOI18N
        txtIdFunc.setForeground(new java.awt.Color(247, 89, 83));
        txtIdFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdFuncMouseClicked(evt);
            }
        });
        txtIdFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFuncActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("/");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("/");

        txtMin.setEditable(false);
        txtMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMinMouseClicked(evt);
            }
        });
        txtMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText(":");

        txtHora.setEditable(false);
        txtHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHoraMouseClicked(evt);
            }
        });

        jLabel9.setText("Selecione os serviços prestados:");

        jLabel10.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel10.setText("TOTAL:");

        ValorTotal.setBackground(new java.awt.Color(92, 97, 108));
        ValorTotal.setFont(new java.awt.Font("Droid Sans Fallback", 1, 18)); // NOI18N
        ValorTotal.setForeground(new java.awt.Color(228, 48, 46));
        ValorTotal.setText("00.00");

        btnSalvar.setText("Finalizar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtDataDia.setEditable(false);
        txtDataDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDataDiaMouseClicked(evt);
            }
        });

        txtDataMes.setEditable(false);
        txtDataMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDataMesMouseClicked(evt);
            }
        });

        txtDataAno.setEditable(false);
        txtDataAno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDataAnoMouseClicked(evt);
            }
        });

        Lista_Atendimento.setBackground(new java.awt.Color(197, 193, 193));
        Lista_Atendimento.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(Lista_Atendimento);

        jLabel11.setBackground(new java.awt.Color(92, 97, 108));
        jLabel11.setText("Atendimento -  Id Cliente - Nome Cliente");

        jButton1.setText("Finalizar Pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel12.setText("TROCO:");

        lblValorTotal1.setFont(new java.awt.Font("Droid Sans Fallback", 1, 18)); // NOI18N
        lblValorTotal1.setForeground(new java.awt.Color(78, 55, 246));
        lblValorTotal1.setText("R$");

        jLabel14.setBackground(new java.awt.Color(92, 97, 108));
        jLabel14.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        jLabel14.setText("RECEBIDO");
        jLabel14.setVerifyInputWhenFocusTarget(false);
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Recebido.setBackground(new java.awt.Color(240, 240, 240));
        Recebido.setFont(new java.awt.Font("Droid Sans Fallback", 1, 18)); // NOI18N

        lblValorTotal2.setBackground(new java.awt.Color(92, 97, 108));
        lblValorTotal2.setFont(new java.awt.Font("Droid Sans Fallback", 1, 18)); // NOI18N
        lblValorTotal2.setText("R$");

        jLabel2.setText("*campo necessário");

        ValorTotal1.setBackground(new java.awt.Color(92, 97, 108));
        ValorTotal1.setFont(new java.awt.Font("Droid Sans Fallback", 1, 18)); // NOI18N
        ValorTotal1.setForeground(new java.awt.Color(228, 48, 46));
        ValorTotal1.setText("R$");

        Troco.setFont(new java.awt.Font("Droid Sans Fallback", 1, 18)); // NOI18N
        Troco.setForeground(new java.awt.Color(78, 55, 246));
        Troco.setText("00.00");

        jButton3.setText("Gerar Troco");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Lista_Servicos.setBackground(new java.awt.Color(197, 193, 193));
        jScrollPane2.setViewportView(Lista_Servicos);

        jLabel15.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        jLabel15.setText("Segure Ctrl para selecionar varios.");

        jButton2.setText("Gerar Total");
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDataDia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(7, 7, 7)
                                        .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataMes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataAno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton3)
                                            .addComponent(jButton2)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblValorTotal2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Recebido, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ValorTotal1)
                                    .addComponent(lblValorTotal1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Troco)
                                    .addComponent(ValorTotal)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtIdFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtIdCli, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(txtDataDia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataMes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataAno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ValorTotal1)
                                .addComponent(ValorTotal))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Troco)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblValorTotal1)
                                    .addComponent(jLabel12))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Recebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorTotal2))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdCliMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCliMouseClicked

    private void txtIdFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdFuncMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFuncMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIdFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFuncActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ControleServico conServ;
        Servico servico;
        conServ = new ControleServico(Lista_Atendimento.getSelectedValue());
        ArrayList<Servico> servList = conServ.getServList();

        int index[] = new int[servList.size()];
        for (int i = 0; i < servList.size(); i++) {
            servico = servList.get(i);
            index[i] = servico.getId_serv();
        }
        Lista_Servicos.setSelectedIndices(index);
        
        String str[] = Lista_Atendimento.getSelectedValue().split("-");
        ControleAtendimento conAtend = new ControleAtendimento(Integer.parseInt(str[0]));
        Atendimento atendimento = conAtend.getAtendimento();
        txtIdCli.setText(String.valueOf(atendimento.getId_cli()));
        String data[] = atendimento.getData().toString().split("-");
        txtDataAno.setText(data[0]);
        txtDataMes.setText(data[1]);
        txtDataDia.setText(data[2]);
        String hora[] = atendimento.getHorario().toString().split(":");
        txtHora.setText(hora[0]);
        txtMin.setText(hora[1]);
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDataDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDataDiaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataDiaMouseClicked

    private void txtDataMesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDataMesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataMesMouseClicked

    private void txtDataAnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDataAnoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataAnoMouseClicked

    private void txtMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinActionPerformed

    private void txtMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinMouseClicked

    private void txtHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        float total = Float.valueOf(ValorTotal.getText());
        float recebido = Float.valueOf(Recebido.getText());
        float troco = recebido - total;
        Troco.setText(String.valueOf(troco));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        List<String> servicos = Lista_Servicos.getSelectedValuesList();
        String tok[];
        float soma = 0.0f;
        for (int i = 0; i < servicos.size(); i++) {
            tok = servicos.get(i).split(" - ");
            soma+=Float.valueOf(tok[2]);
        }
        ValorTotal.setText(String.valueOf(soma));
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAtendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista_Atendimento;
    private javax.swing.JList<String> Lista_Servicos;
    private javax.swing.JTextField Recebido;
    private javax.swing.JLabel Troco;
    private javax.swing.JLabel ValorTotal;
    private javax.swing.JLabel ValorTotal1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblValorTotal1;
    private javax.swing.JLabel lblValorTotal2;
    private javax.swing.JTextField txtDataAno;
    private javax.swing.JTextField txtDataDia;
    private javax.swing.JTextField txtDataMes;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdCli;
    private javax.swing.JTextField txtIdFunc;
    private javax.swing.JTextField txtMin;
    // End of variables declaration//GEN-END:variables
}
