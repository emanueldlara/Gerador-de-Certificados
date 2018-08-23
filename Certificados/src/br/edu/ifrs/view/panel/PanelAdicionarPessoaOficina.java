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
public class PanelAdicionarPessoaOficina extends javax.swing.JPanel {

    /**
     * Creates new form adicionar
     */
    public PanelAdicionarPessoaOficina() {
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
        jLabel4 = new javax.swing.JLabel();
        pnAlert = new javax.swing.JPanel();
        lbAlert = new javax.swing.JLabel();
        lbIconAlert = new javax.swing.JLabel();
        btCSV = new br.com.cyber.componente.KButton();
        etLocal = new br.com.cyber.componente.KTextField();
        btCancelar = new br.com.cyber.componente.KButton();
        btAdicionar = new br.com.cyber.componente.KButton();
        etDataInicio = new br.com.cyber.componente.KTextField();
        etDataFim = new br.com.cyber.componente.KTextField();
        etCargaHoraria = new br.com.cyber.componente.KTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        etDescricao = new br.com.cyber.componente.KTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        etProgramacao = new br.com.cyber.componente.KTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        etTextoAssinatura1 = new br.com.cyber.componente.KTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        etTextoAssinatura2 = new br.com.cyber.componente.KTextArea();
        kLabel1 = new br.com.cyber.componente.KLabel();

        setPreferredSize(new java.awt.Dimension(858, 678));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setText("Adicionar Oficina");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 70, 380, 48);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setText("Data de Término");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(460, 180, 220, 33);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setText("Local");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 250, 80, 33);

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setText("Programação");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(500, 310, 160, 33);

        lbAlert.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        lbAlert.setForeground(new java.awt.Color(254, 91, 91));
        lbAlert.setText("Null");

        javax.swing.GroupLayout pnAlertLayout = new javax.swing.GroupLayout(pnAlert);
        pnAlert.setLayout(pnAlertLayout);
        pnAlertLayout.setHorizontalGroup(
            pnAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIconAlert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnAlertLayout.setVerticalGroup(
            pnAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAlertLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAlert)
                    .addComponent(lbIconAlert))
                .addContainerGap())
        );

        jPanel1.add(pnAlert);
        pnAlert.setBounds(460, 610, 250, 40);

        btCSV.setBackground(new java.awt.Color(38, 193, 93));
        btCSV.setForeground(new java.awt.Color(255, 255, 255));
        btCSV.setText("Adicionar por CSV");
        btCSV.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(btCSV);
        btCSV.setBounds(180, 610, 270, 40);

        etLocal.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etLocal.setK_back_error(new java.awt.Color(255, 153, 153));
        etLocal.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        etLocal.setK_bord_error(new java.awt.Color(255, 102, 102));
        etLocal.setK_obrigatory(true);
        jPanel1.add(etLocal);
        etLocal.setBounds(150, 250, 640, 35);

        btCancelar.setBackground(new java.awt.Color(38, 193, 93));
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(btCancelar);
        btCancelar.setBounds(720, 610, 120, 40);

        btAdicionar.setBackground(new java.awt.Color(38, 193, 93));
        btAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionar.setText("Adicionar");
        btAdicionar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(btAdicionar);
        btAdicionar.setBounds(20, 610, 140, 40);

        etDataInicio.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etDataInicio.setK_back_error(new java.awt.Color(255, 153, 153));
        etDataInicio.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        etDataInicio.setK_bord_error(new java.awt.Color(255, 102, 102));
        etDataInicio.setK_obrigatory(true);
        jPanel1.add(etDataInicio);
        etDataInicio.setBounds(680, 120, 120, 35);

        etDataFim.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etDataFim.setK_back_error(new java.awt.Color(255, 153, 153));
        etDataFim.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        etDataFim.setK_bord_error(new java.awt.Color(255, 102, 102));
        etDataFim.setK_obrigatory(true);
        jPanel1.add(etDataFim);
        etDataFim.setBounds(680, 180, 120, 35);

        etCargaHoraria.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etCargaHoraria.setK_back_error(new java.awt.Color(255, 153, 153));
        etCargaHoraria.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        etCargaHoraria.setK_bord_error(new java.awt.Color(255, 102, 102));
        etCargaHoraria.setK_obrigatory(true);
        jPanel1.add(etCargaHoraria);
        etCargaHoraria.setBounds(260, 160, 70, 35);

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel5.setText("Descrição");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 300, 130, 33);

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel6.setText("Mensagem de Assinatura 1");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 440, 380, 33);

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel7.setText("Mensagem de Assinatura 2");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(500, 453, 340, 30);

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel8.setText("Carga Horária");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 160, 190, 33);

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel9.setText("Data de Início");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(470, 120, 200, 33);

        etDescricao.setBackground(new java.awt.Color(255, 153, 153));
        etDescricao.setColumns(20);
        etDescricao.setRows(5);
        etDescricao.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(etDescricao);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 340, 310, 100);

        etProgramacao.setBackground(new java.awt.Color(255, 153, 153));
        etProgramacao.setColumns(20);
        etProgramacao.setRows(5);
        etProgramacao.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(etProgramacao);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(500, 350, 320, 90);

        etTextoAssinatura1.setBackground(new java.awt.Color(255, 153, 153));
        etTextoAssinatura1.setColumns(20);
        etTextoAssinatura1.setRows(5);
        etTextoAssinatura1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane4.setViewportView(etTextoAssinatura1);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(500, 490, 320, 90);

        etTextoAssinatura2.setBackground(new java.awt.Color(255, 153, 153));
        etTextoAssinatura2.setColumns(20);
        etTextoAssinatura2.setRows(5);
        etTextoAssinatura2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane5.setViewportView(etTextoAssinatura2);

        jPanel1.add(jScrollPane5);
        jScrollPane5.setBounds(40, 480, 310, 90);

        kLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrs/imagens/listasRedimensionado.jpg"))); // NOI18N
        jPanel1.add(kLabel1);
        kLabel1.setBounds(-4, -6, 860, 690);

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

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static br.com.cyber.componente.KButton btAdicionar;
    public static br.com.cyber.componente.KButton btCSV;
    public static br.com.cyber.componente.KButton btCancelar;
    public static br.com.cyber.componente.KTextField etCargaHoraria;
    public static br.com.cyber.componente.KTextField etDataFim;
    public static br.com.cyber.componente.KTextField etDataInicio;
    public static br.com.cyber.componente.KTextArea etDescricao;
    public static br.com.cyber.componente.KTextField etLocal;
    public static br.com.cyber.componente.KTextArea etProgramacao;
    public static br.com.cyber.componente.KTextArea etTextoAssinatura1;
    public static br.com.cyber.componente.KTextArea etTextoAssinatura2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private br.com.cyber.componente.KLabel kLabel1;
    public static javax.swing.JLabel lbAlert;
    public static javax.swing.JLabel lbIconAlert;
    public static javax.swing.JPanel pnAlert;
    // End of variables declaration//GEN-END:variables
}