package olaswing;

import javax.swing.JOptionPane;

public class MinhaTerceiraJanela extends javax.swing.JFrame {

    public MinhaTerceiraJanela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtParImpar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnParImpar = new javax.swing.JButton();
        lblParImparResul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtParImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParImparActionPerformed(evt);
            }
        });

        jLabel1.setText("           Valor ");

        btnParImpar.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btnParImpar.setText("=");
        btnParImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParImparActionPerformed(evt);
            }
        });

        lblParImparResul.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblParImparResul.setForeground(new java.awt.Color(0, 102, 255));
        lblParImparResul.setText("O valor é:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtParImpar)
                    .addComponent(btnParImpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblParImparResul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtParImpar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnParImpar)
                .addGap(28, 28, 28)
                .addComponent(lblParImparResul, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtParImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParImparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParImparActionPerformed

    private void btnParImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParImparActionPerformed

    int valor = Integer.parseInt(txtParImpar.getText());
    String ParImpar = (valor%2==0)?"PAR":"IMPAR";
    lblParImparResul.setText(ParImpar);       
    
    System.out.println("O resultado e: " +lblParImparResul);
    JOptionPane.showMessageDialog(null, "O resultado é: "+ParImpar);

    }//GEN-LAST:event_btnParImparActionPerformed

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
            java.util.logging.Logger.getLogger(MinhaTerceiraJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MinhaTerceiraJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MinhaTerceiraJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MinhaTerceiraJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinhaTerceiraJanela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnParImpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblParImparResul;
    private javax.swing.JTextField txtParImpar;
    // End of variables declaration//GEN-END:variables
}
