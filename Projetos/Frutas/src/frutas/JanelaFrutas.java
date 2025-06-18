package frutas;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaFrutas extends javax.swing.JFrame {

    public JanelaFrutas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCadastrados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnBuscarID = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvarPerformed = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtMaturacao = new javax.swing.JTextField();
        txtLocalColhido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Local Colhido:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Frutas Cadastradas");

        btnCadastrados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrados.setForeground(new java.awt.Color(0, 153, 255));
        btnCadastrados.setText("Cadastrados");
        btnCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastradosActionPerformed(evt);
            }
        });

        tblTabela.setBorder(new javax.swing.border.MatteBorder(null));
        tblTabela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id:", "Nome:", "Email:", "Telefone:", "Tipo:"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        btnBuscarID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarID.setForeground(new java.awt.Color(0, 153, 255));
        btnBuscarID.setText("Buscar por ID");
        btnBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 153, 255));
        btnAlterar.setText("Alterar/Deletar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSalvarPerformed.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSalvarPerformed.setForeground(new java.awt.Color(51, 153, 255));
        btnSalvarPerformed.setText("Salvar");
        btnSalvarPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPerformedActionPerformed(evt);
            }
        });

        txtMaturacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaturacaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Fruta");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Quantidade:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Maturação:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaturacao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLocalColhido))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnSalvarPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBuscarID)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrados)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaturacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLocalColhido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalvarPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastradosActionPerformed
        try{
            //limpa a tabela
            DefaultTableModel model = (DefaultTableModel) tblTabela.getModel();
            model.setRowCount(0);

            //busca os dados
            List<Fruta> frutas = frutaDAO.listarFrutas();

            //preenche a tabela
            for (Fruta u : frutas) {
                model.addRow(new Object[]{
                    u.getId(),
                    u.getNome(),
                    u.getQuantidade(),
                    u.getMaturacao(),
                    u.getLocalColhido(),
                });
            }

        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this,
                "Erro ao buscar dados: " + ex.getMessage(),
                "Erro ",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastradosActionPerformed

    private void btnBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDActionPerformed
        try{
            //solicita o id
            String IDinput = JOptionPane.showInputDialog(this, "Digite o ID da fruta: ");

            //valida se foi digitado algo
            if (IDinput == null || IDinput.trim().isEmpty()) {
                return; // Usuario cancelou ou não digitou nada
            }

            int id = Integer.parseInt(IDinput.trim()); //Converte para inteiro

            //busca o usuario pelo id
            Fruta fruta = frutaDAO.buscarFrutaPorId(id);

            //limpa a tabela
            DefaultTableModel model = (DefaultTableModel) tblTabela.getModel();
            model.setRowCount(0);

            if (fruta != null) {
                //adiciona o usuario na tabela
                model.addRow(new Object[]{
                    fruta.getId(),
                    fruta.getNome(),
                    fruta.getQuantidade(),
                    fruta.getMaturacao(),
                    fruta.getLocalColhido()
                });

            }else {
                JOptionPane.showMessageDialog(this,
                    "Fruta com ID " + id + "nao encontrado. ",
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
                "Erro ao buscar fruta: " + e.getMessage(),
                "Erro",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarIDActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try{
            String inputID = JOptionPane.showInputDialog(this, "Digite o ID da fruta para alterar: ");

            if (inputID == null || inputID.trim().isEmpty()) {
                return;
            }

            int id = Integer.parseInt(inputID.trim());

            Fruta fruta = frutaDAO.buscarFrutaPorId(id);

            if (fruta !=null) {
                EditarFrutaDialog dialog = new EditarFrutaDialog(this, fruta, frutaDAO);
                dialog.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(this, "Fruta com ID " + id + "nao encontrado. ");
            }

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID invalido. Digite um numero. ");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar fruta:\n " + e.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnSalvarPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPerformedActionPerformed

        //1. coleta e sanitiza entradas
        String nome = txtNome.getText().trim();
        String quantidade = txtQuantidade.getText().trim();
        String maturacao = txtMaturacao.getText().trim();
        String localColhido = txtLocalColhido.getText().trim();

        //2. validação rápida de obrigatórios
        if (nome.isEmpty() || quantidade.isEmpty() || maturacao.isEmpty() || localColhido.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "❗ Preencha todos os campos antes de salvar.",
                "Campos obrigatórios.",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        //3. monta o modelo - id como 0, assumindo que o banco trata como AUTO_INCREMENT
        Fruta fruta = new Fruta(0, nome, quantidade, maturacao, localColhido);

        //4. persiste e dá feedback à interface
        try{
            frutaDAO.criarFruta(fruta);
            JOptionPane.showMessageDialog(this,
                "✔ Fruta salvo com sucesso!",
                "✔ Sucesso",
                JOptionPane.INFORMATION_MESSAGE);

        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE,"Erro ao salvar fruta", ex);
            JOptionPane.showMessageDialog(this,
                "Não foi possível salvar a fruta.\nDetalhes: " + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
            System.out.println("Deu errado. ");

        }
    }//GEN-LAST:event_btnSalvarPerformedActionPerformed

    private void txtMaturacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaturacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaturacaoActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaFrutas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaFrutas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscarID;
    private javax.swing.JButton btnCadastrados;
    private javax.swing.JButton btnSalvarPerformed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtLocalColhido;
    private javax.swing.JTextField txtMaturacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
