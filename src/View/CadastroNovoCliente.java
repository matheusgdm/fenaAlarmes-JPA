package View;

//codigo antigo
//import Repository.ClienteRep;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import model.CadastroCliente;
//Codigo antigo!
//import model.CompraAtual;
import model.Telefone;

/**
 *
 * @author mathe
 */
public class CadastroNovoCliente extends javax.swing.JFrame {

    static EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory("FenaAlarmesJPAPU");
        
       static EntityManager em = emf.createEntityManager();
    
    CadastroCliente c = new CadastroCliente();
    Telefone ct = new Telefone();
//Codigo Antigo!
//    CompraAtual ca = new CompraAtual();

    public CadastroNovoCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        painelEmailTelaCadastro = new javax.swing.JTextField();
        painelSobrenomeTelaCadastro = new javax.swing.JTextField();
        painelNomeTelaCadastro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        painelTelefone01TelaCadastro = new javax.swing.JTextField();
        painelTelefone02TelaCadastro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        painelNascionalidadeTelaCadastro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        painelSenhaTelaCadastro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnSalvarCadastro = new javax.swing.JButton();
        button1 = new java.awt.Button();
        jLabel9 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fena Alarmes - Cadastro");
        setBounds(new java.awt.Rectangle(540, 230, 800, 600));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel2.setText("Sobrenome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel3.setText("Telefone 02:");

        painelEmailTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelEmailTelaCadastroActionPerformed(evt);
            }
        });

        painelSobrenomeTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelSobrenomeTelaCadastroActionPerformed(evt);
            }
        });

        painelNomeTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelNomeTelaCadastroActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel4.setText("Escolha seu e-mail:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel5.setText("Telefone 01:");

        painelTelefone01TelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelTelefone01TelaCadastroActionPerformed(evt);
            }
        });

        painelTelefone02TelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelTelefone02TelaCadastroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel6.setText("Nascionalidade:");

        painelNascionalidadeTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelNascionalidadeTelaCadastroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel7.setText("Senha:");

        painelSenhaTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelSenhaTelaCadastroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 34)); // NOI18N
        jLabel8.setText("Digite seus dados:");

        btnSalvarCadastro.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        btnSalvarCadastro.setText("Cadastrar!");
        btnSalvarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroActionPerformed(evt);
            }
        });

        button1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button1.setLabel("SAIR");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel9.setText("        (Todos os campos são obrigatórios)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(painelNascionalidadeTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(painelTelefone02TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(painelTelefone01TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(painelEmailTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(painelSenhaTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(painelNomeTelaCadastro)
                                .addComponent(painelSobrenomeTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalvarCadastro)
                                .addGap(248, 248, 248))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(303, 303, 303))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelNomeTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelSobrenomeTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(painelEmailTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTelefone01TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTelefone02TelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelNascionalidadeTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelSenhaTelaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnSalvarCadastro)
                .addGap(23, 23, 23)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void painelEmailTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelEmailTelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_painelEmailTelaCadastroActionPerformed

    private void painelSobrenomeTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelSobrenomeTelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_painelSobrenomeTelaCadastroActionPerformed

    private void painelNomeTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelNomeTelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_painelNomeTelaCadastroActionPerformed

    private void painelTelefone01TelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelTelefone01TelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_painelTelefone01TelaCadastroActionPerformed

    private void painelTelefone02TelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelTelefone02TelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_painelTelefone02TelaCadastroActionPerformed

    private void painelNascionalidadeTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelNascionalidadeTelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_painelNascionalidadeTelaCadastroActionPerformed

    private void painelSenhaTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelSenhaTelaCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_painelSenhaTelaCadastroActionPerformed

    private void btnSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroActionPerformed
        if(painelNomeTelaCadastro.getText().equals("") || painelSobrenomeTelaCadastro.getText().equals("") || 
           painelEmailTelaCadastro.getText().equals("") || painelTelefone01TelaCadastro.getText().equals("") || 
           painelTelefone02TelaCadastro.getText().equals("") || painelNascionalidadeTelaCadastro.getText().equals("") || 
           painelSenhaTelaCadastro.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Impossível realizar o cadastro, campos obrigatórios não estão preenchidos!");
        }else{
           //salvando cadastro do cliente
            c.setNome(painelNomeTelaCadastro.getText());
            c.setSobrenome(painelSobrenomeTelaCadastro.getText());
            c.setEmail(painelEmailTelaCadastro.getText());
            try {
            ct.setNumero_telefone(painelTelefone01TelaCadastro.getText());
            } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Telefone 01 não é válido!");
            }
            try {
            ct.setNumero_telefone(painelTelefone02TelaCadastro.getText());    
            } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Telefone 02 não é válido!");
            }
            c.setSenha(painelSenhaTelaCadastro.getText());
            String nasc = painelNascionalidadeTelaCadastro.getText() != null || !painelNascionalidadeTelaCadastro.getText().isEmpty()  ? painelNascionalidadeTelaCadastro.getText(): "Brasil";
            c.setNascionalidade(nasc);
            //codigo novo!!
            em.persist(c);
            em.getTransaction().begin();
            em.getTransaction().commit();

// Codigo antigo
//            ClienteRep eRep = new ClienteRep();
//            
//            try {
//                eRep.salvar(c);
//            } catch (SQLException ex) {
//                Logger.getLogger(CadastroNovoCliente.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(rootPane, "Não foi possivel salvar novo cadastro!");
//            }

            JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso!!");
            this.setVisible(false); 
            //Codigo antigo!
            //new TelaInicial().setVisible(true);
        }
        
    }//GEN-LAST:event_btnSalvarCadastroActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        this.setVisible(false); 
//Codigo antigo!
//        new TelaInicial().setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroNovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroNovoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarCadastro;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField painelEmailTelaCadastro;
    private javax.swing.JTextField painelNascionalidadeTelaCadastro;
    private javax.swing.JTextField painelNomeTelaCadastro;
    private javax.swing.JTextField painelSenhaTelaCadastro;
    private javax.swing.JTextField painelSobrenomeTelaCadastro;
    private javax.swing.JTextField painelTelefone01TelaCadastro;
    private javax.swing.JTextField painelTelefone02TelaCadastro;
    // End of variables declaration//GEN-END:variables
}