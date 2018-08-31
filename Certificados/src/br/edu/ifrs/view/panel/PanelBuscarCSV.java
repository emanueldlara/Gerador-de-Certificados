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
public class PanelBuscarCSV extends javax.swing.JPanel {

    /**
     * Creates new form adicionar
     */
    public PanelBuscarCSV() {
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
        txtLocal = new javax.swing.JLabel();
        pnAlert = new javax.swing.JPanel();
        lbAlert = new javax.swing.JLabel();
        lbIconAlert = new javax.swing.JLabel();
        btCancelar = new br.com.cyber.componente.KButton();
        btBuscar = new br.com.cyber.componente.KButton();
        etBusca = new br.com.cyber.componente.KTextField();
        btAdicionar = new br.com.cyber.componente.KButton();
        Fundo = new br.com.cyber.componente.KLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        txtTitulo.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Buscar CSV");
        jPanel1.add(txtTitulo);
        txtTitulo.setBounds(0, 20, 600, 48);

        txtLocal.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        txtLocal.setText("Local");
        jPanel1.add(txtLocal);
        txtLocal.setBounds(70, 100, 80, 30);

        pnAlert.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N

        lbAlert.setFont(new java.awt.Font("Monospaced", 2, 18)); // NOI18N
        lbAlert.setForeground(new java.awt.Color(254, 91, 91));
        lbAlert.setText("Null");

        javax.swing.GroupLayout pnAlertLayout = new javax.swing.GroupLayout(pnAlert);
        pnAlert.setLayout(pnAlertLayout);
        pnAlertLayout.setHorizontalGroup(
            pnAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAlertLayout.createSequentialGroup()
                .addGroup(pnAlertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAlertLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(lbIconAlert))
                    .addGroup(pnAlertLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbAlert, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        pnAlert.setBounds(70, 180, 250, 50);

        btCancelar.setBackground(new java.awt.Color(38, 193, 93));
        btCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btCancelar.setText("Cancelar");
        btCancelar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(btCancelar);
        btCancelar.setBounds(430, 220, 120, 34);

        btBuscar.setBackground(new java.awt.Color(125, 190, 189));
        btBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrs/imagens/magnifier.png"))); // NOI18N
        btBuscar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscar);
        btBuscar.setBounds(500, 140, 50, 34);

        etBusca.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etBusca.setK_back_error(new java.awt.Color(255, 153, 153));
        etBusca.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        etBusca.setK_bord_error(new java.awt.Color(255, 102, 102));
        etBusca.setK_bord_focus_gained(new java.awt.Color(38, 193, 93));
        etBusca.setK_obrigatory(true);
        jPanel1.add(etBusca);
        etBusca.setBounds(70, 140, 430, 35);

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
        btAdicionar.setBounds(430, 180, 120, 34);

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

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.cyber.componente.KLabel Fundo;
    public static br.com.cyber.componente.KButton btAdicionar;
    public static br.com.cyber.componente.KButton btBuscar;
    public static br.com.cyber.componente.KButton btCancelar;
    public static br.com.cyber.componente.KTextField etBusca;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbAlert;
    public static javax.swing.JLabel lbIconAlert;
    public static javax.swing.JPanel pnAlert;
    private javax.swing.JLabel txtLocal;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
