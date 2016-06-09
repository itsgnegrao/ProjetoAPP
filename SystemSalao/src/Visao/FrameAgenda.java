/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControleAtendimento;
import Modelo.Atendimento;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author negrao
 */
public class FrameAgenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrameAgenda2
     */
    public FrameAgenda() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn830 = new javax.swing.JButton();
        btn800 = new javax.swing.JButton();
        btn930 = new javax.swing.JButton();
        btn900 = new javax.swing.JButton();
        btn1000 = new javax.swing.JButton();
        btn1130 = new javax.swing.JButton();
        btn1100 = new javax.swing.JButton();
        btn1030 = new javax.swing.JButton();
        btn1430 = new javax.swing.JButton();
        btn1400 = new javax.swing.JButton();
        btn1530 = new javax.swing.JButton();
        btn1500 = new javax.swing.JButton();
        btn1600 = new javax.swing.JButton();
        btn1730 = new javax.swing.JButton();
        btn1700 = new javax.swing.JButton();
        btn1630 = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        btnConsultar.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(76, 192, 77));
        jButton20.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        jButton20.setPreferredSize(new java.awt.Dimension(30, 30));

        jButton21.setBackground(new java.awt.Color(227, 12, 19));
        jButton21.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        jButton21.setPreferredSize(new java.awt.Dimension(30, 30));

        jLabel5.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        jLabel5.setText("Disponível");

        jLabel6.setFont(new java.awt.Font("Cantarell", 0, 10)); // NOI18N
        jLabel6.setText("Ocupado");

        btn830.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn830.setText("08:30");
        btn830.setPreferredSize(new java.awt.Dimension(100, 40));
        btn830.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn830ActionPerformed(evt);
            }
        });

        btn800.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn800.setText("08:00");
        btn800.setPreferredSize(new java.awt.Dimension(100, 40));
        btn800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn800ActionPerformed(evt);
            }
        });

        btn930.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn930.setText("09:30");
        btn930.setPreferredSize(new java.awt.Dimension(100, 40));
        btn930.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn930ActionPerformed(evt);
            }
        });

        btn900.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn900.setText("09:00");
        btn900.setPreferredSize(new java.awt.Dimension(100, 40));
        btn900.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn900ActionPerformed(evt);
            }
        });

        btn1000.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1000.setText("10:00");
        btn1000.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1000ActionPerformed(evt);
            }
        });

        btn1130.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1130.setText("11:30");
        btn1130.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1130ActionPerformed(evt);
            }
        });

        btn1100.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1100.setText("11:00");
        btn1100.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1100ActionPerformed(evt);
            }
        });

        btn1030.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1030.setText("10:30");
        btn1030.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1030.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1030ActionPerformed(evt);
            }
        });

        btn1430.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1430.setText("14:30");
        btn1430.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1430.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1430ActionPerformed(evt);
            }
        });

        btn1400.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1400.setText("14:00");
        btn1400.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1400ActionPerformed(evt);
            }
        });

        btn1530.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1530.setText("15:30");
        btn1530.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1530.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1530ActionPerformed(evt);
            }
        });

        btn1500.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1500.setText("15:00");
        btn1500.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1500ActionPerformed(evt);
            }
        });

        btn1600.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1600.setText("16:00");
        btn1600.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1600.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1600ActionPerformed(evt);
            }
        });

        btn1730.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1730.setText("17:30");
        btn1730.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1730.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1730ActionPerformed(evt);
            }
        });

        btn1700.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1700.setText("17:00");
        btn1700.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1700.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1700ActionPerformed(evt);
            }
        });

        btn1630.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn1630.setText("16:30");
        btn1630.setPreferredSize(new java.awt.Dimension(100, 40));
        btn1630.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1630ActionPerformed(evt);
            }
        });

        jCalendar1.setDecorationBackgroundColor(new java.awt.Color(240, 240, 240));
        jCalendar1.setDecorationBackgroundVisible(false);
        jCalendar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCalendar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendar1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("AGENDA");

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabel3.setText("SELECIONE A DATA DESEJADA E CLIQUE EM \"CONSULTAR\"");

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabel4.setText("CLIQUE SOBRE O HORARIO DESEJADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btn1030, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btn1100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btn1130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn1600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn1430, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1630, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn1500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1700, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn1530, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn1730, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btn830, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btn900, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(btn930, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(102, 102, 102))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn800, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn830, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn900, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn930, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1030, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1400, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1430, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1530, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn1600, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn1630, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn1730, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn1700, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1000ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1000ActionPerformed

    private void btn1600ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1600ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1600ActionPerformed

    private void jCalendar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendar1MouseClicked

    }//GEN-LAST:event_jCalendar1MouseClicked

    private void btn800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn800ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn800ActionPerformed

    private void btn830ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn830ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn830ActionPerformed

    private void btn900ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn900ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn900ActionPerformed

    private void btn930ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn930ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn930ActionPerformed

    private void btn1030ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1030ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1030ActionPerformed

    private void btn1100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1100ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1100ActionPerformed

    private void btn1130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1130ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1130ActionPerformed

    private void btn1400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1400ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1400ActionPerformed

    private void btn1430ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1430ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1430ActionPerformed

    private void btn1500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1500ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1500ActionPerformed

    private void btn1530ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1530ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1530ActionPerformed

    private void btn1630ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1630ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1630ActionPerformed

    private void btn1700ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1700ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1700ActionPerformed

    private void btn1730ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1730ActionPerformed
        FrameAgendaDois fa2 = new FrameAgendaDois();
        fa2.setLocationRelativeTo(null);
        fa2.setVisible(true);
    }//GEN-LAST:event_btn1730ActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ControleAtendimento ConAtend = new ControleAtendimento((jCalendar1.getDate().getYear() + 1900), jCalendar1.getDate().getMonth() + 1, jCalendar1.getDate().getDate());
        ArrayList<Atendimento> atendList = ConAtend.getAtendList();
        if (atendList.isEmpty()) {
            SetGreen(atendList);
        } else {
            SetColor(atendList);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1000;
    private javax.swing.JButton btn1030;
    private javax.swing.JButton btn1100;
    private javax.swing.JButton btn1130;
    private javax.swing.JButton btn1400;
    private javax.swing.JButton btn1430;
    private javax.swing.JButton btn1500;
    private javax.swing.JButton btn1530;
    private javax.swing.JButton btn1600;
    private javax.swing.JButton btn1630;
    private javax.swing.JButton btn1700;
    private javax.swing.JButton btn1730;
    private javax.swing.JButton btn800;
    private javax.swing.JButton btn830;
    private javax.swing.JButton btn900;
    private javax.swing.JButton btn930;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private void SetGreen(ArrayList<Atendimento> atendList) {
        btn800.setBackground(Color.green);
        btn800.setEnabled(true);
        btn830.setBackground(Color.green);
        btn830.setEnabled(true);
        btn900.setBackground(Color.green);
        btn900.setEnabled(true);
        btn930.setBackground(Color.green);
        btn930.setEnabled(true);
        btn1000.setBackground(Color.green);
        btn1000.setEnabled(true);
        btn1030.setBackground(Color.green);
        btn1030.setEnabled(true);
        btn1100.setBackground(Color.green);
        btn1100.setEnabled(true);
        btn1130.setBackground(Color.green);
        btn1130.setEnabled(true);
        btn1400.setBackground(Color.green);
        btn1400.setEnabled(true);
        btn1430.setBackground(Color.green);
        btn1430.setEnabled(true);
        btn1500.setBackground(Color.green);
        btn1500.setEnabled(true);
        btn1530.setBackground(Color.green);
        btn1530.setEnabled(true);
        btn1600.setBackground(Color.green);
        btn1600.setEnabled(true);
        btn1630.setBackground(Color.green);
        btn1630.setEnabled(true);
        btn1700.setBackground(Color.green);
        btn1700.setEnabled(true);
        btn1730.setBackground(Color.green);
        btn1730.setEnabled(true);

    }

    private void SetColor(ArrayList<Atendimento> atendList) {
        if (atendList.get(0).getHorario().getHours() == 8 && atendList.get(0).getHorario().getMinutes() == 00) {
                btn800.setEnabled(false);
                btn800.setBackground(Color.red);
            } else {
                btn800.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 8 && atendList.get(0).getHorario().getMinutes() == 30) {
                btn830.setEnabled(false);
                btn830.setBackground(Color.red);
            } else {
                btn830.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 9 && atendList.get(0).getHorario().getMinutes() == 00) {
                btn900.setEnabled(false);
                btn900.setBackground(Color.red);
            } else {
                btn900.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 9 && atendList.get(0).getHorario().getMinutes() == 30) {
                btn930.setEnabled(false);
                btn930.setBackground(Color.red);
            } else {
                btn930.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 10 && atendList.get(0).getHorario().getMinutes() == 00) {
                btn1000.setEnabled(false);
                btn1000.setBackground(Color.red);
            } else {
                btn1000.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 10 && atendList.get(0).getHorario().getMinutes() == 30) {
                btn1030.setEnabled(false);
                btn1030.setBackground(Color.red);
            } else {
                btn1030.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 11 && atendList.get(0).getHorario().getMinutes() == 00) {
                btn1100.setEnabled(false);
                btn1100.setBackground(Color.red);
            } else {
                btn1100.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 11 && atendList.get(0).getHorario().getMinutes() == 30) {
                btn1130.setEnabled(false);
                btn1130.setBackground(Color.red);
            } else {
                btn1130.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 14 && atendList.get(0).getHorario().getMinutes() == 30) {
                btn1400.setEnabled(false);
                btn1400.setBackground(Color.red);
            } else {
                btn1400.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 14 && atendList.get(0).getHorario().getMinutes() == 30) {
                btn1430.setEnabled(false);
                btn1430.setBackground(Color.red);
            } else {
                btn1430.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 15 && atendList.get(0).getHorario().getMinutes() == 30) {
                btn1500.setEnabled(false);
                btn1500.setBackground(Color.red);
            } else {
                btn1500.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 15 && atendList.get(0).getHorario().getMinutes() == 30) {
                btn1530.setEnabled(false);
                btn1530.setBackground(Color.red);
            } else {
                btn1530.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 16 && atendList.get(0).getHorario().getMinutes() == 00) {
                btn1600.setEnabled(false);
                btn1600.setBackground(Color.red);
            } else {
                btn1600.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 16 && atendList.get(0).getHorario().getMinutes() == 30) {
                btn1630.setEnabled(false);
                btn1630.setBackground(Color.red);
            } else {
                btn1630.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 17 && atendList.get(0).getHorario().getMinutes() == 00) {
                btn1700.setEnabled(false);
                btn1700.setBackground(Color.red);
            } else {
                btn1700.setBackground(Color.green);
            }
            if (atendList.get(0).getHorario().getHours() == 17 && atendList.get(0).getHorario().getMinutes() == 30) {
                btn1730.setEnabled(false);
                btn1730.setBackground(Color.red);
            } else {
                btn1730.setBackground(Color.green);
            }
    }
}
