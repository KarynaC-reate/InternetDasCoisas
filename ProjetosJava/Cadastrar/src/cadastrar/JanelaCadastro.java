package cadastrar;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JanelaCadastro extends javax.swing.JFrame {

    public JanelaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnBuscarID = new javax.swing.JButton();
        btnCadastrados = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Idade:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Sexo:");

        tblTabela.setBorder(new javax.swing.border.MatteBorder(null));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id:", "Nome:", "Email:", "Idade:", "Sexo:"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        btnBuscarID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscarID.setText("Buscar por ID");
        btnBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDActionPerformed(evt);
            }
        });

        btnCadastrados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrados.setText("Cadastrados");
        btnCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastradosActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar/Deletar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(txtEmail)
                                .addComponent(txtIdade)
                                .addComponent(txtSexo))
                            .addComponent(btnSalvar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnBuscarID)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastrados)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarID)
                    .addComponent(btnCadastrados)
                    .addComponent(btnAlterar)
                    .addComponent(btnSalvar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //SALVAR
    private final PessoaDAO pessoaDAO = new PessoaDAO(); //private final ninguém poderá fazer alteração nele

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

    String nome = txtNome.getText().trim();
    String email = txtEmail.getText().trim();
    String idade = txtIdade.getText().trim();
    String sexo = txtSexo.getText().trim();
    
    if (nome.isEmpty() || email.isEmpty() || idade.isEmpty() || sexo.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Preencha todos os campos antes de salvar.",
                "Campos obrigatórios.",
                JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    Pessoa pessoa = new Pessoa(0, nome, email, idade, sexo);
    
    try{
        pessoaDAO.criarPessoa(pessoa);
        JOptionPane.showMessageDialog(this,
                "Pessoa salva com sucesso!",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
        
    }catch (SQLException ex){
        java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE,"Erro ao salvar pessoa", ex);
        JOptionPane.showMessageDialog(this,
                "Não foi possível salvar a pessoa.\nDetalhes: " + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        System.out.println("Deu errado. ");
    }

    }//GEN-LAST:event_btnSalvarActionPerformed

    // BUSCAR
    private void btnBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDActionPerformed
        try{
        //solicita o id 
        String input = JOptionPane.showInputDialog(this, "Digite o ID da pessoa: ");
            
        //valida se foi digitado algo
        if (input == null || input.trim().isEmpty()) {
            return; // Usuario cancelou ou não digitou nada
        }
            
        int id = Integer.parseInt(input.trim()); //Converte para inteiro
        
        //busca o usuario pelo id
        Pessoa pessoa = pessoaDAO.buscarPessoaPorId(id);
            
        //limpa a tabela
        DefaultTableModel model = (DefaultTableModel) tblTabela.getModel();
        model.setRowCount(0);
        
        if (pessoa != null) {
            //adiciona o usuario na tabela
            model.addRow(new Object[]{
            pessoa.getId(),
            pessoa.getNome(),
            pessoa.getEmail(),
            pessoa.getIdade(),
            pessoa.getSexo()
        });
            
        }else {
            JOptionPane.showMessageDialog(this,
                "Pessoa com ID " + id + "nao encontrado. ",
                "Nao encontrado",
            JOptionPane.INFORMATION_MESSAGE);
        }
                
    }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
            "ID invalido. Por favor, digite um numero inteiro. ",
            "Erro de entrada",
            JOptionPane.INFORMATION_MESSAGE);
        
    }catch (SQLException e) {
        JOptionPane.showMessageDialog(this,
            "Erro ao buscar pessoa: " + e.getMessage(),
            "Erro",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarIDActionPerformed

    private void btnCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastradosActionPerformed
        try{
            //limpa a tabela
            DefaultTableModel model = (DefaultTableModel) tblTabela.getModel();
            model.setRowCount(0);
            
            //busca os dados 
            List<Pessoa> pessoas = pessoaDAO.listarPessoas();
            
            //preenche a tabela
            for (Pessoa u : pessoas) {
                model.addRow(new Object[]{
                    u.getId(),
                    u.getNome(),                 
                    u.getEmail(),
                    u.getIdade(),
                    u.getSexo(),
                });
            }
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this,
                "Erro ao buscar dados: " + ex.getMessage(),
                "Erro ",
                JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnCadastradosActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       String nome = txtNome.getText();
       String email = txtEmail.getText();
       String idade = txtIdade.getText();
       String sexo = txtSexo.getText();
               
        try{
        String input = JOptionPane.showInputDialog(this, "Digite o ID da pessoa para alterar: ");
            
        if (input == null || input.trim().isEmpty()) {
            return; 
        }
            
        int id = Integer.parseInt(input.trim());
        
        Pessoa pessoa = pessoaDAO.buscarPessoaPorId(id);
        
        if (pessoa !=null) {
            EditarPessoaDialog dialog = new EditarPessoaDialog(this, pessoa, pessoaDAO);
            dialog.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this, "Pessoa com ID " + id + "nao encontrado. ");
        }
        
    }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID invalido. Digite um numero. ");
    }catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao buscar pessoa:\n " + e.getMessage());
    }
    }//GEN-LAST:event_btnAlterarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscarID;
    private javax.swing.JButton btnCadastrados;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
