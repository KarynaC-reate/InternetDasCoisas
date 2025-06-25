package frutas;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class EditarFrutaDialog extends JDialog {
    
    private JTextField txtNome, txtQuantidade, txtMaturacao, txtLocalColhido;
    private JButton btnSalvar,btnDeletar;
    private Fruta fruta;
    private FrutaDAO frutaDAO;

    public EditarFrutaDialog(Frame parent, Fruta fruta, FrutaDAO frutaDAO) {
        super(parent, "Editar fruta", true);
        this.fruta = fruta;
        this.frutaDAO = frutaDAO;
        
        setLayout(new GridLayout(6,2,10,10));
        
        setSize(400,300);
        
        setLocationRelativeTo(parent);
        
        add(new JLabel("Nome:"));
        txtNome = new JTextField(fruta.getNome());
        add(txtNome);
        
        add(new JLabel("Quantidade:"));
        txtQuantidade = new JTextField(fruta.getQuantidade());
        add(txtQuantidade);
        
        add(new JLabel("Maturacao:"));
        txtMaturacao = new JTextField(fruta.getMaturacao());
        add(txtMaturacao);
        
        add(new JLabel("LocalColhido:"));
        txtLocalColhido = new JTextField(fruta.getLocalColhido());
        add(txtLocalColhido);
        
        btnSalvar = new JButton("Salvar Alterações");
        btnSalvar.addActionListener(e -> salvarAlteracoes());
        
        btnDeletar = new JButton("Deletar fruta");
        btnDeletar.setForeground(Color.red);
        btnDeletar.addActionListener(e -> deletarFruta());
        
        add(btnSalvar);
        add(btnDeletar);
        
    }
    
    private void salvarAlteracoes(){
        fruta.setNome(txtNome.getText().trim());
        fruta.setQuantidade(txtQuantidade.getText().trim());
        fruta.setMaturacao(txtMaturacao.getText().trim());
        fruta.setLocalColhido(txtLocalColhido.getText().trim());
        
        try {
            frutaDAO.atualizarFruta(fruta);
            JOptionPane.showMessageDialog(this, "Fruta atualizado com sucesso ");
            dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar fruta\n"
                    + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void deletarFruta(){
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que excluir esta fruta?","Confirmação",
                JOptionPane.YES_NO_OPTION);
        
        if(confirmacao == JOptionPane.YES_OPTION){
            try {
                frutaDAO.deletarFruta(fruta.getId());
                JOptionPane.showMessageDialog(this,"Fruta deletada com sucesso!");
                dispose();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,"Erro ao deletar frutas\n"
                        +e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
