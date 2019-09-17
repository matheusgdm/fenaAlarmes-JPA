package View;

import javax.swing.JOptionPane;
import model.CadastroCliente;


public class MeusDados extends javax.swing.JFrame {

    CadastroCliente c = new CadastroCliente();
    CadastroCliente clienteLogado;

    public MeusDados() {
        initComponents();

//        txtTotalDSC.setText(String.valueOf("Quantidade: " + c.getContadorCentralDSC()));
//        txtJFL.setText(String.valueOf("Quantidade: " + c.getContadorCentralJFL()));
//        txtTeclaDSC.setText(String.valueOf("Quantidade: " + c.getContadorTecladoDSC()));
//        txtTeclaParadox.setText(String.valueOf("Quantidade: " + c.getContadorTecladoParadox()));
//        txtBateIntel.setText(String.valueOf("Quantidade: " + c.getContadorBateriaIntel()));
//        txtBateriaMoura.setText(String.valueOf("Quantidade: " + c.getContadorBateriaMoura()));
//        txtSensorParadox.setText(String.valueOf("Quantidade: " + c.getContadorSensorParadox()));
//        txtSensorPassivo.setText(String.valueOf("Quantidade: " + c.getContadorSensorIntel()));
//        txtSireneGLK.setText(String.valueOf("Quantidade: " + c.getContadorSireneGlk()));
//        txtSireneECP.setText(String.valueOf("Quantidade: " + c.getContadorSireneEcp()));
//        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));
    }

    public MeusDados(CadastroCliente clienteLogado) {
        this.clienteLogado = clienteLogado;
        initComponents();
        txtNomeCliente.setText("Nome: ".concat(this.clienteLogado.getNome() + " " +  this.clienteLogado.getSobrenome()));
        txtEmailCliente.setText("Email: " + this.clienteLogado.getEmail());
        txtNascionalidadeCliente.setText("Nascionalidade: " + this.clienteLogado.getNascionalidade());
        txtTelefonesCliente.setText("Telefones: " + this.clienteLogado.getTelefones());
        

//        txtTotalDSC.setText(String.valueOf("Quantidade: " + c.getContadorCentralDSC()));
//        txtJFL.setText(String.valueOf("Quantidade: " + c.getContadorCentralJFL()));
//        txtTeclaDSC.setText(String.valueOf("Quantidade: " + c.getContadorTecladoDSC()));
//        txtTeclaParadox.setText(String.valueOf("Quantidade: " + c.getContadorTecladoParadox()));
//        txtBateIntel.setText(String.valueOf("Quantidade: " + c.getContadorBateriaIntel()));
//        txtBateriaMoura.setText(String.valueOf("Quantidade: " + c.getContadorBateriaMoura()));
//        txtSensorParadox.setText(String.valueOf("Quantidade: " + c.getContadorSensorParadox()));
//        txtSensorPassivo.setText(String.valueOf("Quantidade: " + c.getContadorSensorIntel()));
//        txtSireneGLK.setText(String.valueOf("Quantidade: " + c.getContadorSireneGlk()));
//        txtSireneECP.setText(String.valueOf("Quantidade: " + c.getContadorSireneEcp()));
//        txtTotal.setText(String.valueOf("Valor total: R$ " + c.getPrecoTotalCompra()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JLabel();
        txtTelefonesCliente = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JLabel();
        txtNascionalidadeCliente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(540, 230, 0, 0));
        setResizable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel12.setText("Meus dados:");

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNomeCliente.setText("jLabel1");

        txtTelefonesCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTelefonesCliente.setText("jLabel1");

        txtEmailCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtEmailCliente.setText("jLabel1");

        txtNascionalidadeCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtNascionalidadeCliente.setText("jLabel1");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNascionalidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtNascionalidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTelefonesCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(92, 92, 92))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new MenuInicial(clienteLogado).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeusDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel txtEmailCliente;
    private javax.swing.JLabel txtNascionalidadeCliente;
    private javax.swing.JLabel txtNomeCliente;
    private javax.swing.JLabel txtTelefonesCliente;
    // End of variables declaration//GEN-END:variables
}
