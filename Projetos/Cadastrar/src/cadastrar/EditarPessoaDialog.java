package cadastrar;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditarPessoaDialog extends JDialog{

    private JTextField txtNome, txtEmail, txtIdade, txtSexo;
    private JButton btnSalvar,btnDeletar;
    private Pessoa pessoa;
    private PessoaDAO pessoaDAO;

    public EditarPessoaDialog(Frame parent, Pessoa pessoa, PessoaDAO pessoaDAO) {
        super(parent, "Editar Pessoa", true);
        this.pessoa = pessoa;
        this.pessoaDAO = pessoaDAO;
        
        setLayout(new GridLayout(6,2,10,10));
        
        setSize(400,300);
        
        setLocationRelativeTo(parent);
        
        add(new JLabel("Nome:"));
        txtNome = new JTextField(pessoa.getNome());
        add(txtNome);
        
        add(new JLabel("Email:"));
        txtEmail = new JTextField(pessoa.getEmail());
        add(txtEmail);
        
        add(new JLabel("Idade:"));
        txtIdade = new JTextField(pessoa.getIdade());
        add(txtIdade);
        
        add(new JLabel("Sexo:"));
        txtSexo = new JTextField(pessoa.getSexo());
        add(txtSexo);
        
        btnSalvar = new JButton("Salvar Alterações");
        btnSalvar.addActionListener(e -> salvarAlteracoes());
        
        btnDeletar = new JButton("Deletar pessoa");
        btnDeletar.setForeground(Color.red);
        btnDeletar.addActionListener(e -> deletarPessoa());
        
        add(btnSalvar);
        add(btnDeletar);
        
    }
    
    private void salvarAlteracoes(){
        pessoa.setNome(txtNome.getText().trim());
        pessoa.setEmail(txtEmail.getText().trim());
        pessoa.setIdade(txtIdade.getText().trim());
        pessoa.setSexo(txtSexo.getText().trim());
        
        try {
            pessoaDAO.atualizarPessoa(pessoa);
            JOptionPane.showMessageDialog(this, "Pessoa atualizada com sucesso. ");
            dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar pessoa.\n"
                    + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void deletarPessoa(){
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que excluir este pesssoa?","Confirmação",
                JOptionPane.YES_NO_OPTION);
        
        if(confirmacao == JOptionPane.YES_OPTION){
            try {
                pessoaDAO.deletarPessoa(pessoa.getId());
                JOptionPane.showMessageDialog(this,"Pessoa deletada com sucesso!");
                dispose();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,"Erro ao deletar pessoas\n"
                        +e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
