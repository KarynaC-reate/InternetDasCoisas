package carros;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtPortas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnBuscarID = new javax.swing.JButton();
        btnCadastrados = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Marca:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Carro");

        jLabel3.setText("Ano:");

        jLabel4.setText("Tipo:");

        jLabel5.setText("Portas:");

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Marca:", "Ano:", "Tipo:", "Portas:"
            }
        ));
        jScrollPane1.setViewportView(tblTabela);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Carros Cadastrados");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnBuscarID.setText("Buscar por ID");
        btnBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDActionPerformed(evt);
            }
        });

        btnCadastrados.setText("Buscar");
        btnCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastradosActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPortas))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAno))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnSalvar)
                .addGap(148, 148, 148)
                .addComponent(btnBuscarID)
                .addGap(57, 57, 57)
                .addComponent(btnCadastrados)
                .addGap(46, 46, 46)
                .addComponent(btnAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnBuscarID)
                    .addComponent(btnCadastrados)
                    .addComponent(btnAlterar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

private final CarroDAO carroDAO = new CarroDAO(); //private final ninguém poderá fazer alteração nele
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

    //1. coleta e sanitiza entradas
    String marca = txtMarca.getText().trim();
    String ano = txtAno.getText().trim();
    String tipo = txtTipo.getText().trim();
    String portas = txtPortas.getText().trim();
    
    //2. validação rápida de obrigatórios
    if (marca.isEmpty() || ano.isEmpty() || tipo.isEmpty() || portas.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "❗ Preencha todos os campos antes de salvar.",
                "Campos obrigatórios. ",
                JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    //3. monta o modelo - id como 0, assumindo que o banco trata como AUTO_INCREMENT
    Carro carro = new Carro(0, marca, ano, tipo, portas);
    
    //4. persiste e dá feedback à interface
    try{
        carroDAO.criarCarro(carro);
        JOptionPane.showMessageDialog(this,
                "✔ Carro salvo com sucesso!",
                "✔ Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
        
    }catch (SQLException ex){
        java.util.logging.Logger.getLogger(getClass().getName()).log(java.util.logging.Level.SEVERE,"Erro ao salvar carro", ex);
        JOptionPane.showMessageDialog(this,
                "Não foi possível salvar.\nDetalhes: " + ex.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        System.out.println("Deu errado. ");
    }
    
    }//GEN-LAST:event_btnSalvarActionPerformed

    //CADASTRADOS
    private void btnCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastradosActionPerformed
        try{
            //limpa a tabela
            DefaultTableModel model = (DefaultTableModel) tblTabela.getModel();
            model.setRowCount(0);
            
            //busca os dados 
            List<Carro> carros = carroDAO.listarCarros();
            
            //preenche a tabela
            for (Carro u : carros) {
                model.addRow(new Object[]{
                    u.getId(),
                    u.getMarca(),                 
                    u.getAno(),
                    u.getTipo(),
                    u.getPortas(),
                });
            }
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(this,
                "Erro ao buscar dados: " + ex.getMessage(),
                "Erro ",
                JOptionPane.ERROR_MESSAGE);
        }          
    }//GEN-LAST:event_btnCadastradosActionPerformed

    //BUSCAR POR ID
    private void btnBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDActionPerformed
        try{
        //solicita o id 
        String input = JOptionPane.showInputDialog(this, "Digite o ID do carro: ");
            
        //valida se foi digitado algo
        if (input == null || input.trim().isEmpty()) {
            return; // Usuario cancelou ou não digitou nada
        }
            
        int id = Integer.parseInt(input.trim()); //Converte para inteiro
        
        //busca o usuario pelo id
        Carro carro = carroDAO.buscarCarroPorId(id);
            
        //limpa a tabela
        DefaultTableModel model = (DefaultTableModel) tblTabela.getModel();
        model.setRowCount(0);
        
        if (carro != null) {
            //adiciona o usuario na tabela
            model.addRow(new Object[]{
            carro.getId(),
            carro.getMarca(),
            carro.getAno(),
            carro.getTipo(),
            carro.getPortas()
        });
            
        }else {
            JOptionPane.showMessageDialog(this,
                "Carro com ID " + id + "nao encontrado. ",
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
            "Erro ao buscar carro: " + e.getMessage(),
            "Erro",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarIDActionPerformed

    //ALTERAR
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try{
        String input = JOptionPane.showInputDialog(this, "Digite o ID do carro para alterar: ");
            
        if (input == null || input.trim().isEmpty()) {
            return; 
        }
            
        int id = Integer.parseInt(input.trim());
        
        Carro carro = carroDAO.buscarCarroPorId(id);
        
        if (carro !=null) {
            EditarCarroDialog dialog = new EditarCarroDialog(this, carro, carroDAO);
            dialog.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this, "Carro com ID " + id + "nao encontrado. ");
        }
        
    }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID invalido. Digite um numero. ");
    }catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao buscar carro:\n " + e.getMessage());

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
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
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPortas;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
