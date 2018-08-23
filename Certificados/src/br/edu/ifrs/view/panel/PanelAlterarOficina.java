/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.view.panel;


/**
 *
 * @author Daniel M. Kuhn
 */
public class PanelAlterarOficina extends javax.swing.JPanel {

    
    /**
     * Creates new form AlterarPessoa
     */
    public PanelAlterarOficina() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnAlert = new javax.swing.JPanel();
        lbAlert = new javax.swing.JLabel();
        lbIconAlert = new javax.swing.JLabel();
        etLocal = new br.com.cyber.componente.KTextField();
        btCancelar = new br.com.cyber.componente.KButton();
        jLabel5 = new javax.swing.JLabel();
        etID = new br.com.cyber.componente.KTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        etDataFim = new br.com.cyber.componente.KTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        etDataInicio = new br.com.cyber.componente.KTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        etDescricao = new br.com.cyber.componente.KTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        etProgramacao = new br.com.cyber.componente.KTextArea();
        etCargaHoraria = new br.com.cyber.componente.KTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        etTextoAssinatura1 = new br.com.cyber.componente.KTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        etTextoAssinatura2 = new br.com.cyber.componente.KTextArea();
        btAlterar1 = new br.com.cyber.componente.KButton();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setText("Alterar Oficina");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 40, 380, 48);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setText("Descrição");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 320, 140, 30);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setText("Data de Início");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(450, 140, 210, 30);

        lbAlert.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        lbAlert.setForeground(new java.awt.Color(254, 91, 91));
        lbAlert.setText("Null");

        javax.swing.GroupLayout pnAlertLayout = new javax.swing.GroupLayout(pnAlert);
        pnAlert.setLayout(pnAlertLayout);
        pnAlertLayout.setHorizontalGroup(
            pnAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIconAlert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        pnAlertLayout.setVerticalGroup(
            pnAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlertLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIconAlert)
                .addGap(52, 52, 52))
            .addGroup(pnAlertLayout.createSequentialGroup()
                .addComponent(lbAlert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        jPanel1.add(pnAlert);
        pnAlert.setBounds(160, 610, 340, 40);

        etLocal.setBackground(new java.awt.Color(255, 153, 153));
        etLocal.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etLocal.setK_back_error(new java.awt.Color(255, 153, 153));
        etLocal.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        etLocal.setK_obrigatory(true);
        jPanel1.add(etLocal);
        etLocal.setBounds(130, 260, 700, 35);

        btCancelar.setBackground(new java.awt.Color(38, 193, 93));
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btCancelar);
        btCancelar.setBounds(700, 610, 130, 42);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel5.setText("Local");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 270, 80, 30);

        etID.setBackground(new java.awt.Color(204, 204, 204));
        etID.setEnabled(false);
        etID.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etID.setK_back_error(new java.awt.Color(204, 204, 204));
        etID.setK_bord_error(new java.awt.Color(204, 204, 204));
        etID.setK_obrigatory(true);
        jPanel1.add(etID);
        etID.setBounds(230, 150, 70, 30);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setText("Programação");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(490, 320, 160, 30);

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel6.setText("Mensagem de Assinatura 1");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 470, 340, 30);

        etDataFim.setBackground(new java.awt.Color(255, 153, 153));
        etDataFim.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etDataFim.setK_back_error(new java.awt.Color(255, 153, 153));
        etDataFim.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        etDataFim.setK_obrigatory(true);
        jPanel1.add(etDataFim);
        etDataFim.setBounds(660, 190, 170, 35);

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel7.setText("ID");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(180, 150, 30, 30);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel8.setText("Mensagem de Assinatura 2");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(490, 470, 360, 30);

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel9.setText("Data Final");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(510, 190, 150, 30);

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel10.setText("Carga Horária");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 190, 190, 30);

        etDataInicio.setBackground(new java.awt.Color(255, 153, 153));
        etDataInicio.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etDataInicio.setK_back_error(new java.awt.Color(255, 153, 153));
        etDataInicio.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        etDataInicio.setK_obrigatory(true);
        etDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etDataInicioActionPerformed(evt);
            }
        });
        jPanel1.add(etDataInicio);
        etDataInicio.setBounds(660, 140, 170, 35);

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));

        etDescricao.setBackground(new java.awt.Color(255, 153, 153));
        etDescricao.setColumns(20);
        etDescricao.setRows(5);
        etDescricao.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(etDescricao);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 360, 340, 90);

        etProgramacao.setBackground(new java.awt.Color(255, 153, 153));
        etProgramacao.setColumns(20);
        etProgramacao.setRows(5);
        etProgramacao.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane2.setViewportView(etProgramacao);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(490, 360, 340, 90);

        etCargaHoraria.setBackground(new java.awt.Color(255, 153, 153));
        etCargaHoraria.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etCargaHoraria.setK_back_error(new java.awt.Color(255, 153, 153));
        etCargaHoraria.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        etCargaHoraria.setK_obrigatory(true);
        jPanel1.add(etCargaHoraria);
        etCargaHoraria.setBounds(230, 190, 70, 30);

        etTextoAssinatura1.setEditable(false);
        etTextoAssinatura1.setBackground(new java.awt.Color(255, 153, 153));
        etTextoAssinatura1.setColumns(20);
        etTextoAssinatura1.setRows(5);
        etTextoAssinatura1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(etTextoAssinatura1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(30, 510, 340, 90);

        etTextoAssinatura2.setBackground(new java.awt.Color(255, 153, 153));
        etTextoAssinatura2.setColumns(20);
        etTextoAssinatura2.setRows(5);
        etTextoAssinatura2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane4.setViewportView(etTextoAssinatura2);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(490, 510, 340, 90);

        btAlterar1.setBackground(new java.awt.Color(38, 193, 93));
        btAlterar1.setForeground(new java.awt.Color(255, 255, 255));
        btAlterar1.setText("Alterar");
        btAlterar1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btAlterar1);
        btAlterar1.setBounds(30, 610, 103, 42);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrs/imagens/listasRedimensionado.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 860, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarActionPerformed

    private void etDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etDataInicioActionPerformed

    private void btAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlterar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static br.com.cyber.componente.KButton btAlterar1;
    public static br.com.cyber.componente.KButton btCancelar;
    public static br.com.cyber.componente.KTextField etCargaHoraria;
    public static br.com.cyber.componente.KTextField etDataFim;
    public static br.com.cyber.componente.KTextField etDataInicio;
    public static br.com.cyber.componente.KTextArea etDescricao;
    public static br.com.cyber.componente.KTextField etID;
    public static br.com.cyber.componente.KTextField etLocal;
    public static br.com.cyber.componente.KTextArea etProgramacao;
    public static br.com.cyber.componente.KTextArea etTextoAssinatura1;
    public static br.com.cyber.componente.KTextArea etTextoAssinatura2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JLabel lbAlert;
    public static javax.swing.JLabel lbIconAlert;
    public static javax.swing.JPanel pnAlert;
    // End of variables declaration//GEN-END:variables
}
