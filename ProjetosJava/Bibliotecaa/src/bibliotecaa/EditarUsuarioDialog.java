package bibliotecaa;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditarUsuarioDialog extends JDialog {
    
    private JTextField txtNome, txtEmail, txtTelefone, txtTipo_usuario;
    private JButton btnSalvar,btnDeletar;
    private Usuario usuario;
    private UsuarioDAO usuarioDAO;
    
    public EditarUsuarioDialog(Frame parent, Usuario usuario, UsuarioDAO usuarioDAO) {
        super(parent, "Editar usuario", true);
        //constructor
        this.usuario = usuario;
        this.usuarioDAO = usuarioDAO;
        
        setLayout(new GridLayout(6,2,10,10));
        
        setSize(400,300);
        
        setLocationRelativeTo(parent);
        
        add(new JLabel("Nome:"));
        txtNome = new JTextField(usuario.getNome());
        add(txtNome);
        
        add(new JLabel("Email:"));
        txtEmail = new JTextField(usuario.getEmail());
        add(txtEmail);
        
        add(new JLabel("Telefone:"));
        txtTelefone = new JTextField(usuario.getTelefone());
        add(txtTelefone);
        
        add(new JLabel("Email:"));
        txtTipo_usuario = new JTextField(usuario.getTipo_usuario());
        add(txtTipo_usuario);
        
        btnSalvar = new JButton("Salvar Alterações");
        btnSalvar.addActionListener(e -> salvarAlteracoes());
        
        btnDeletar = new JButton("Deletar usuario");
        btnDeletar.setForeground(Color.red);
        btnDeletar.addActionListener(e -> deletarUsuario());
        
        add(btnSalvar);
        add(btnDeletar);
        
    }
    
    private void salvarAlteracoes(){
        usuario.setNome(txtNome.getText().trim());
        usuario.setEmail(txtEmail.getText().trim());
        usuario.setTelefone(txtTelefone.getText().trim());
        usuario.setTipo_usuario(txtTipo_usuario.getText().trim());
        
        try {
            usuarioDAO.atualizarUsuario(usuario);
            JOptionPane.showMessageDialog(this, "Usuario atualizado com sucesso ");
            dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar usuario\n"
                    + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void deletarUsuario(){
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que excluir este usuário?","Confirmação",
                JOptionPane.YES_NO_OPTION);
        
        if(confirmacao == JOptionPane.YES_OPTION){
            try {
                usuarioDAO.deletarUsuario(usuario.getId());
                JOptionPane.showMessageDialog(this,"Usuário deletado com sucesso!");
                dispose();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,"Erro ao deletar usuários\n"
                        +e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}