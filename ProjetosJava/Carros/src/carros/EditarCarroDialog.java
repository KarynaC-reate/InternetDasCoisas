package carros;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditarCarroDialog extends JDialog{
        
    private JTextField txtMarca, txtAno, txtTipo, txtPortas;
    private JButton btnSalvar,btnDeletar;
    private Carro carro;
    private CarroDAO carroDAO;
    
    public EditarCarroDialog(Frame parent, Carro carro, CarroDAO carroDAO) {
        super(parent, "Editar carro", true);
        this.carro = carro;
        this.carroDAO = carroDAO;
        
        setLayout(new GridLayout(6,2,10,10));
        
        setSize(400,300);
        
        setLocationRelativeTo(parent);
        
        add(new JLabel("Marca:"));
        txtMarca = new JTextField(carro.getMarca());
        add(txtMarca);
        
        add(new JLabel("Ano:"));
        txtAno = new JTextField(carro.getAno());
        add(txtAno);
        
        add(new JLabel("Tipo:"));
        txtTipo = new JTextField(carro.getTipo());
        add(txtTipo);
        
        add(new JLabel("Portas:"));
        txtPortas = new JTextField(carro.getPortas());
        add(txtPortas);
        
        btnSalvar = new JButton("Salvar Alterações");
        btnSalvar.addActionListener(e -> salvarAlteracoes());
        
        btnDeletar = new JButton("Deletar carro");
        btnDeletar.setForeground(Color.red);
        btnDeletar.addActionListener(e -> deletarCarro());
        
        add(btnSalvar);
        add(btnDeletar);
        
    }
    
    private void salvarAlteracoes(){
        carro.setMarca(txtMarca.getText().trim());
        carro.setAno(txtAno.getText().trim());
        carro.setTipo(txtTipo.getText().trim());
        carro.setPortas(txtPortas.getText().trim());
        
        try {
            carroDAO.atualizarUsuario(carro);
            JOptionPane.showMessageDialog(this, "Carro atualizado com sucesso ");
            dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar carro\n"
                    + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void deletarCarro(){
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que excluir este carro?","Confirmação",
                JOptionPane.YES_NO_OPTION);
        
        if(confirmacao == JOptionPane.YES_OPTION){
            try {
                carroDAO.deletarCarro(carro.getId());
                JOptionPane.showMessageDialog(this,"Carro deletado com sucesso!");
                dispose();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,"Erro ao deletar carros\n"
                        +e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
