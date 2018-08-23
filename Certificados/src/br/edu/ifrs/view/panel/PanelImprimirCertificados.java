/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.view.panel;

import br.edu.ifrs.persistence.Conexao;
import java.sql.Connection;

/**
 *
 * @author Daniel M. Kuhn
 */
public class PanelImprimirCertificados extends javax.swing.JPanel {

    /**
     * Creates new form adicionar
     */
    public PanelImprimirCertificados() {
        initComponents();

        pnAlert.setVisible(false); // inicialmente o panel de alerta fica escondido

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        pnAlert = new javax.swing.JPanel();
        lbAlert = new javax.swing.JLabel();
        lbIconAlert = new javax.swing.JLabel();
        btExcluir = new br.com.cyber.componente.KButton();
        btAdicionar1 = new br.com.cyber.componente.KButton();
        kComboBox2 = new br.com.cyber.componente.KComboBox();
        Fundo = new br.com.cyber.componente.KLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        Titulo.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Escolher Evento");
        jPanel1.add(Titulo);
        Titulo.setBounds(0, 20, 600, 48);

        pnAlert.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        lbAlert.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        lbAlert.setForeground(new java.awt.Color(254, 91, 91));
        lbAlert.setText("Null");

        javax.swing.GroupLayout pnAlertLayout = new javax.swing.GroupLayout(pnAlert);
        pnAlert.setLayout(pnAlertLayout);
        pnAlertLayout.setHorizontalGroup(
            pnAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlertLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(lbIconAlert)
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(pnAlertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnAlertLayout.setVerticalGroup(
            pnAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlertLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIconAlert)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlertLayout.createSequentialGroup()
                .addComponent(lbAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(pnAlert);
        pnAlert.setBounds(90, 150, 440, 40);

        btExcluir.setBackground(new java.awt.Color(38, 193, 93));
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("Cancelar");
        btExcluir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(btExcluir);
        btExcluir.setBounds(320, 210, 120, 34);

        btAdicionar1.setBackground(new java.awt.Color(38, 193, 93));
        btAdicionar1.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionar1.setText("Confirmar");
        btAdicionar1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btAdicionar1);
        btAdicionar1.setBounds(140, 210, 120, 34);

        kComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", " " }));
        jPanel1.add(kComboBox2);
        kComboBox2.setBounds(70, 100, 480, 40);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrs/imagens/addpessoa.jpg"))); // NOI18N
        jPanel1.add(Fundo);
        Fundo.setBounds(-7, -4, 610, 280);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionar1ActionPerformed
      // Connection conn = Conexao.getConnection();
        
      //  String src = "C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Gerador-de-Certificados\\src\\br\\edu\\ifrs\\util";
        
      //  JasperPrint jaspertPrint = null;
        
        //try {
            
          //  jaspertPrint = JasperFillManager.fillReport(src, null, conn);
            
        //} catch (JRException ex) {
          //  System.out.println("Error: "+ex);
        //}
        
       // JasperViewer view = new JasperViewer(jaspertPrint,false);
        
       // view.setVisible(true);
    }//GEN-LAST:event_btAdicionar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.cyber.componente.KLabel Fundo;
    private javax.swing.JLabel Titulo;
    public static br.com.cyber.componente.KButton btAdicionar1;
    public static br.com.cyber.componente.KButton btExcluir;
    private javax.swing.JPanel jPanel1;
    private br.com.cyber.componente.KComboBox kComboBox2;
    public static javax.swing.JLabel lbAlert;
    public static javax.swing.JLabel lbIconAlert;
    public static javax.swing.JPanel pnAlert;
    // End of variables declaration//GEN-END:variables
}
