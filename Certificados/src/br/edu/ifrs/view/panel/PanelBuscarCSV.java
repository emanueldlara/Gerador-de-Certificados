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
        Titulo = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        pnAlert = new javax.swing.JPanel();
        lbAlert = new javax.swing.JLabel();
        lbIconAlert = new javax.swing.JLabel();
        btExcluir = new br.com.cyber.componente.KButton();
        btAdicionar = new br.com.cyber.componente.KButton();
        etNome = new br.com.cyber.componente.KTextField();
        btAdicionar1 = new br.com.cyber.componente.KButton();
        Fundo = new br.com.cyber.componente.KLabel();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        Titulo.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Buscar CSV");
        jPanel1.add(Titulo);
        Titulo.setBounds(0, 20, 600, 48);

        Nome.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        Nome.setText("Local");
        jPanel1.add(Nome);
        Nome.setBounds(70, 100, 80, 30);

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

        btExcluir.setBackground(new java.awt.Color(38, 193, 93));
        btExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir.setText("Cancelar");
        btExcluir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(btExcluir);
        btExcluir.setBounds(430, 220, 120, 34);

        btAdicionar.setBackground(new java.awt.Color(125, 190, 189));
        btAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifrs/imagens/magnifier.png"))); // NOI18N
        btAdicionar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        jPanel1.add(btAdicionar);
        btAdicionar.setBounds(500, 140, 50, 34);

        etNome.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        etNome.setK_back_error(new java.awt.Color(255, 153, 153));
        etNome.setK_back_focus_gained(new java.awt.Color(255, 255, 255));
        etNome.setK_bord_error(new java.awt.Color(255, 102, 102));
        etNome.setK_bord_focus_gained(new java.awt.Color(38, 193, 93));
        etNome.setK_obrigatory(true);
        jPanel1.add(etNome);
        etNome.setBounds(70, 140, 430, 35);

        btAdicionar1.setBackground(new java.awt.Color(38, 193, 93));
        btAdicionar1.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionar1.setText("Adicionar");
        btAdicionar1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btAdicionar1);
        btAdicionar1.setBounds(430, 180, 120, 34);

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

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAdicionar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.cyber.componente.KLabel Fundo;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Titulo;
    public static br.com.cyber.componente.KButton btAdicionar;
    public static br.com.cyber.componente.KButton btAdicionar1;
    public static br.com.cyber.componente.KButton btExcluir;
    public static br.com.cyber.componente.KTextField etNome;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbAlert;
    public static javax.swing.JLabel lbIconAlert;
    public static javax.swing.JPanel pnAlert;
    // End of variables declaration//GEN-END:variables
}
