
package padaria;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Janela extends javax.swing.JFrame {

    public Janela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCadastrados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        btnBuscarID = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Comidas Cadastradas");

        btnCadastrados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrados.setForeground(new java.awt.Color(0, 204, 51));
        btnCadastrados.setText("Buscar");
        btnCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastradosActionPerformed(evt);
            }
        });

        tblTabela.setBorder(new javax.swing.border.MatteBorder(null));
        tblTabela.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id:", "Nome:", "Preço:", "Tipo:"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        btnBuscarID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarID.setForeground(new java.awt.Color(0, 204, 51));
        btnBuscarID.setText("Buscar por ID");
        btnBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 204, 51));
        btnAlterar.setText("Alterar/Deletar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(0, 204, 51));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Comida");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Preço:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(btnBuscarID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private final ComidaDAO comidaDAO = new ComidaDAO(); //private final ninguém poderá fazer alteração nele

    //CADASTRADOS
    private void btnCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastradosActionPerformed

        try{
            //limpa a tabela
            DefaultTableModel model = (DefaultTableModel) tblTabela.getModel();
            model.setRowCount(0);

            //busca os dados
            List<Comida> comidas = comidaDAO.listarComidas();

            //preenche a tabela
            for (Comida u : comidas) {
                model.addRow(new Object[]{
                    u.getId(),
                    u.getNome(),
                    u.getPreco(),
                    u.getTipo(),
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
            String input = JOptionPane.showInputDialog(this, "Digite o ID da comida: ");

            //valida se foi digitado algo
            if (input == null || input.trim().isEmpty()) {
                return; // Usuario cancelou ou não digitou nada
            }

            int id = Integer.parseInt(input.trim()); //Converte para inteiro

            //busca o usuario pelo id
            Comida comida = comidaDAO.buscarComidaPorId(id);

            //limpa a tabela
            DefaultTableModel model = (DefaultTableModel) tblTabela.getModel();
            model.setRowCount(0);

            if (comida != null) {
                //adiciona o usuario na tabela
                model.addRow(new Object[]{
                    comida.getId(),
                    comida.getNome(),
                    comida.getPreco(),
                    comida.getTipo()
                });

            }else {
                JOptionPane.showMessageDialog(this,
                    "Comida com ID " + id + "nao encontrado. ",
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
                "Erro ao buscar comida: " + e.getMessage(),
                "Erro",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarIDActionPerformed

    //ALTERAR
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        try{
            String input = JOptionPane.showInputDialog(this, "Digite o ID da comida para alterar: ");

            if (input == null || input.trim().isEmpty()) {
                return;
            }

            int id = Integer.parseInt(input.trim());

            Comida comida = comidaDAO.buscarComidaPorId(id);

            if (comida !=null) {
                EditarComidaDialog dialog = new EditarComidaDialog(this, comida, comidaDAO);
                dialog.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(this, "Comida com ID " + id + " nao encontrado. ");
            }

        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID invalido. Digite um numero. ");
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar comida:\n " + e.getMessage());

        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    //SALVAR
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        //1. coleta e sanitiza entradas
        String nome = txtNome.getText().trim();
        String preco = txtPreco.getText().trim();
        String tipo = txtTipo.getText().trim();

        //2. validação rápida de obrigatórios
        if (nome.isEmpty() || preco.isEmpty() || tipo.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "❗ Preencha todos os campos antes de salvar.",
                "Campos obrigatórios.",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        //3. monta o modelo - id como 0, assumindo que o banco trata como AUTO_INCREMENT
        Comida comida = new Comida(0, nome, preco, tipo);

        //4. persiste e dá feedback à interface
        try{
            comidaDAO.criarComida(comida);
            JOptionPane.showMessageDialog(this,
                "✔ Comida salva com sucesso!",
                "✔ Sucesso",
                JOptionPane.INFORMATION_MESSAGE);

        }catch (SQLException ex){
            java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE,"Erro ao salvar comida", ex);
            JOptionPane.showMessageDialog(this,
                "Não foi possível salvar a comida.\nDetalhes: " + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
            System.out.println("Deu errado. ");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscarID;
    private javax.swing.JButton btnCadastrados;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
