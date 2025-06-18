package padaria;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditarComidaDialog extends JDialog {
    
    private JTextField txtNome, txtPreco, txtTipo;
    private JButton btnSalvar,btnDeletar;
    private Comida comida;
    private ComidaDAO comidaDAO;

    public EditarComidaDialog(Frame parent, Comida comida, ComidaDAO comidaDAO) {
        super(parent, "Editar comida", true);
        this.comida = comida;
        this.comidaDAO = comidaDAO;
        
        setLayout(new GridLayout(6,2,10,10));
        
        setSize(400,300);
        
        setLocationRelativeTo(parent);
        
        add(new JLabel("Nome:"));
        txtNome = new JTextField(comida.getNome());
        add(txtNome);
        
        add(new JLabel("Preco:"));
        txtPreco = new JTextField(comida.getPreco());
        add(txtPreco);
        
        add(new JLabel("Tipo:"));
        txtTipo = new JTextField(comida.getTipo());
        add(txtTipo);
        
        btnSalvar = new JButton("Salvar Alterações");
        btnSalvar.addActionListener(e -> salvarAlteracoes());
        
        btnDeletar = new JButton("Deletar comida");
        btnDeletar.setForeground(Color.red);
        btnDeletar.addActionListener(e -> deletarComida());
        
        add(btnSalvar);
        add(btnDeletar);
        
    }
    
    private void salvarAlteracoes(){
        comida.setNome(txtNome.getText().trim());
        comida.setPreco(txtPreco.getText().trim());
        comida.setTipo(txtTipo.getText().trim());
        
        try {
            comidaDAO.atualizarComida(comida);
            JOptionPane.showMessageDialog(this, "Comida atualizada com sucesso ");
            dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar comida\n"
                    + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void deletarComida(){
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que excluir esta comida?","Confirmação",
                JOptionPane.YES_NO_OPTION);
        
        if(confirmacao == JOptionPane.YES_OPTION){
            try {
                comidaDAO.deletarComida(comida.getId());
                JOptionPane.showMessageDialog(this,"Comida deletada com sucesso!");
                dispose();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,"Erro ao deletar comidas\n"
                        +e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
