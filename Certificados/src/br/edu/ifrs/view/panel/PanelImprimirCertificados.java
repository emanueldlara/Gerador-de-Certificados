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
        txtTitulo = new javax.swing.JLabel();
        pnAlert = new javax.swing.JPanel();
        lbAlert = new javax.swing.JLabel();
        lbIconAlert = new javax.swing.JLabel();
        btCancelar = new br.com.cyber.componente.KButton();
        btConfirmar = new br.com.cyber.componente.KButton();
        EscolherEventos = new br.com.cyber.componente.KComboBox();
        Fundo = new br.com.cyber.componente.KLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        txtTitulo.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Escolher Evento");
        jPanel1.add(txtTitulo);
        txtTitulo.setBounds(0, 20, 600, 48);

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

        btCancelar.setBackground(new java.awt.Color(38, 193, 93));
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(btCancelar);
        btCancelar.setBounds(320, 210, 120, 34);

        btConfirmar.setBackground(new java.awt.Color(38, 193, 93));
        btConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btConfirmar.setText("Confirmar");
        btConfirmar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btConfirmar);
        btConfirmar.setBounds(140, 210, 120, 34);

        EscolherEventos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", " " }));
        EscolherEventos.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jPanel1.add(EscolherEventos);
        EscolherEventos.setBounds(70, 100, 480, 40);

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

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
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
    }//GEN-LAST:event_btConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.cyber.componente.KComboBox EscolherEventos;
    private br.com.cyber.componente.KLabel Fundo;
    public static br.com.cyber.componente.KButton btCancelar;
    public static br.com.cyber.componente.KButton btConfirmar;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbAlert;
    public static javax.swing.JLabel lbIconAlert;
    public static javax.swing.JPanel pnAlert;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
