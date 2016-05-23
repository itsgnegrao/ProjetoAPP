/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JPanel;

/**
 *
 * @author leonardo corrá, giovani bertuzzo, gabriel negrão
 */
public class FramePrincipal extends javax.swing.JFrame {
    
        JPanel panelCadCli = new PanelCadCli();
        JPanel panelCadFunc = new PanelCadFunc();
        JPanel panelAgenda = new PanelAgenda();
        JPanel panelAgendaDois = new PanelAgendaDois();
        JPanel panelCaixa = new PanelCaixa();
        Container c=getContentPane();
    /**
     * Creates new form NovoJFrame
     */
    public FramePrincipal() {
        initComponents();
        //this.jPanel2.setVisible(true);
        //c.repaint();
        //c.removeAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelPrinc = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(java.awt.Color.white);

        jButton2.setText("cc");
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton1.setText("cf");
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton4.setText("ag");
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton3.setText("cx");
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPrinc.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jPanelPrincLayout = new javax.swing.GroupLayout(jPanelPrinc);
        jPanelPrinc.setLayout(jPanelPrincLayout);
        jPanelPrincLayout.setHorizontalGroup(
            jPanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        jPanelPrincLayout.setVerticalGroup(
            jPanelPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");

        jMenuItem2.setText("Cliente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Funcionário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Agenda");

        jMenuItem4.setText("Consultar Agenda");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Caixa");

        jMenuItem7.setText("Consultar Caixa");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        c.removeAll();
        c.repaint();
        panelCadFunc.setBounds(5,5,500,500);
        //panelCadFunc.setBackground(Color.BLUE);
        // obter dimensões do pai  
        int larguraPai   = FramePrincipal.this.getWidth();  
        int alturaPai    = FramePrincipal.this.getHeight();  
        // obter dimensões do filho  
        int larguraFilho = panelCadFunc.getWidth();  
        int alturaFilho  = panelCadFunc.getWidth();  
        // calcular novas coordenadas do filho  
        int novoX        = (larguraPai - larguraFilho) / 2;  
        int novoY        = (alturaPai - alturaFilho) / 2;  
        // centralizar filho  
        panelCadFunc.setLocation(novoX, novoY);
        panelCadFunc.setVisible(true);
        c.add(panelCadFunc);       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        c.removeAll();
        //jPanelPrinc.add(panelCadCli);
        panelAgendaDois.setBounds(5,290,330,235);
        //panelCadCli.setLocation(0, 0);
        panelCadCli.setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        c.removeAll();
        c.repaint();
        panelAgenda.setBounds(5,5,600,600);
        //panelAgenda.setBackground(Color.GREEN);
        // obter dimensões do pai  
        int larguraPai   = FramePrincipal.this.getWidth();  
        int alturaPai    = FramePrincipal.this.getHeight();  
        // obter dimensões do filho  
        int larguraFilho = panelAgenda.getWidth();  
        int alturaFilho  = panelAgenda.getWidth();  
        // calcular novas coordenadas do filho  
        int novoX        = (larguraPai - larguraFilho) / 2;  
        int novoY        = (alturaPai - alturaFilho) / 2;  
        // centralizar filho  
        panelAgenda.setLocation(novoX, novoY);
        panelAgenda.setVisible(true);        
        
        //        
        panelAgenda.add(panelAgendaDois);
        panelAgendaDois.setLocation(novoX, novoY);
        panelAgendaDois.setVisible(true);
        panelAgendaDois.setBounds(5,290,330,235);
        c.add(panelAgenda);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        c.removeAll();
        c.repaint();
        panelCaixa.setBounds(5,5,500,500);
        // obter dimensões do pai  
        int larguraPai   = FramePrincipal.this.getWidth();  
        int alturaPai    = FramePrincipal.this.getHeight();  
        // obter dimensões do filho  
        int larguraFilho = panelCaixa.getWidth();  
        int alturaFilho  = panelCaixa.getWidth();  
        // calcular novas coordenadas do filho  
        int novoX        = (larguraPai - larguraFilho) / 2;  
        int novoY        = (alturaPai - alturaFilho) / 2;  
        // centralizar filho  
        panelCaixa.setLocation(novoX, novoY);
        panelCaixa.setBackground(Color.WHITE);
        panelCaixa.setVisible(true);
        c.add(panelCaixa);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelPrinc;
    // End of variables declaration//GEN-END:variables
}
