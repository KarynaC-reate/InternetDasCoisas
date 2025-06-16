package cinema;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaF extends javax.swing.JFrame {

    public JanelaF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        btnCadastrados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnBuscarID = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvarPerformed = new javax.swing.JButton();
        txtTitulo = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Filmes Cadastrados");

        btnCadastrados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrados.setForeground(new java.awt.Color(0, 153, 204));
        btnCadastrados.setText("Buscar");
        btnCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastradosActionPerformed(evt);
            }
        });

        tblTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblTabela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, "", null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id:", "Título:", "Gênero:", "Ano:"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        btnBuscarID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarID.setForeground(new java.awt.Color(0, 153, 204));
        btnBuscarID.setText("Buscar por ID");
        btnBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 153, 204));
        btnAlterar.setText("Alterar/Deletar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSalvarPerformed.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSalvarPerformed.setForeground(new java.awt.Color(0, 153, 204));
        btnSalvarPerformed.setText("Salvar");
        btnSalvarPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPerformedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Filme");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Título:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Gênero:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ano:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnSalvarPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscarID)
                        .addGap(29, 29, 29)
                        .addComponent(btnCadastrados)
                        .addGap(31, 31, 31)
                        .addComponent(btnAlterar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvarPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //CADASTRADOS
    private final FilmeDAO filmeDAO = new FilmeDAO(); //private final ninguém poderá fazer alteração nele
    
    private void btnCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastradosActionPerformed

        try{
            //limpa a tabela
            DefaultTableModel model = (DefaultTableModel) tblTabela.getModel();
            model.setRowCount(0);

            //busca os dados
            List<Filme> filmes = filmeDAO.listarFilmes();

            //preenche a tabela
            for (Filme u : filmes) {
                model.addRow(new Object[]{
                    u.getId(),
                    u.getTitulo(),
                    u.getGenero(),
                    u.getAno(),
                });
            }

        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this,
                "Erro ao buscar dados: " + ex.getMessage(),
                "Erro ",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastradosActionPerformed

    //BUSCAR ID
    private void btnBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDActionPerformed
        try{
            //solicita o id
            String input = JOptionPane.showInputDialog(this, "Digite o ID do filme: ");

            //valida se foi digitado algo
            if (input == null || input.trim().isEmpty()) {
                return; // Usuario cancelou ou não digitou nada
            }

            int id = Integer.parseInt(input.trim()); //Converte para inteiro

            //busca o usuario pelo id
            Filme filme = filmeDAO.buscarFilmesPorId(id);

            //limpa a tabela
            DefaultTableModel model = (DefaultTableModel) tblTabela.getModel();
            model.setRowCount(0);

            if (filme != null) {
                //adiciona o usuario na tabela
                model.addRow(new Object[]{
                    filme.getId(),
                    filme.getTitulo(),
                    filme.getGenero(),
                    filme.getAno(),
                });

            }else {
                JOptionPane.showMessageDialog(this,
                    "Filme com ID " + id + "nao encontrado. ",
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
                "Erro ao buscar filme: " + e.getMessage(),
                "Erro",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarIDActionPerformed

    //ALTERAR
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        try{
            String input = JOptionPane.showInputDialog(this, "Digite o ID do filme para alterar: ");

            if (input == null || input.trim().isEmpty()) {
                return;
            }

            int id = Integer.parseInt(input.trim());

            Filme filme = filmeDAO.buscarFilmesPorId(id);

            if (filme !=null) {
                EditarFilmeDialog dialog = new EditarFilmeDialog(this, filme, filmeDAO);
                dialog.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(this, "Filme com ID " + id + "nao encontrado. ");
            }

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID invalido. Digite um numero. ");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar filme:\n " + e.getMessage());

        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    //SALVAR
    private void btnSalvarPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPerformedActionPerformed

        //1. coleta e sanitiza entradas
        String titulo = txtTitulo.getText().trim();
        String genero = txtGenero.getText().trim();
        String ano = txtAno.getText().trim();

        //2. validação rápida de obrigatórios
        if (titulo.isEmpty() || genero.isEmpty() || ano.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "❗ Preencha todos os campos antes de salvar.",
                "Campos obrigatórios.",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        //3. monta o modelo - id como 0, assumindo que o banco trata como AUTO_INCREMENT
        Filme filme = new Filme(0, titulo, genero, ano);

        //4. persiste e dá feedback à interface
        try{
            filmeDAO.criarFilme(filme);
            JOptionPane.showMessageDialog(this,
                "✔ Filme salvo com sucesso!",
                "✔ Sucesso",
                JOptionPane.INFORMATION_MESSAGE);

        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE,"Erro ao salvar filme", ex);
            JOptionPane.showMessageDialog(this,
                "Não foi possível salvar o filme.\nDetalhes: " + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
            System.out.println("Deu errado. ");
        }

    }//GEN-LAST:event_btnSalvarPerformedActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaF().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
