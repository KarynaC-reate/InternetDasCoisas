package cinema;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditarFilmeDialog extends JDialog{

    private JTextField txtTitulo,  txtGenero, txtAno;
    private JButton btnSalvar,btnDeletar;
    private Filme filme;
    private FilmeDAO filmeDAO;

        public EditarFilmeDialog(Filme filme, FilmeDAO filmeDAO) {
            super(parent, "Editar filme", true);
            this.filme = filme;
            this.filmeDAO = filmeDAO;
        
            
        setLayout(new GridLayout(6,2,10,10));
        
        setSize(400,300);
        
        setLocationRelativeTo(parent);
        
        add(new JLabel("Titulo:"));
        txtTitulo = new JTextField(filme.getTitulo());
        add(txtTitulo);
        
        add(new JLabel("Genero:"));
        txtGenero = new JTextField(filme.getGenero());
        add(txtGenero);
        
        add(new JLabel("Ano:"));
        txtAno = new JTextField(filme.getAno());
        add(txtAno);
                
        btnSalvar = new JButton("Salvar Alterações");
        btnSalvar.addActionListener(e -> salvarAlteracoes());
        
        btnDeletar = new JButton("Deletar usuario");
        btnDeletar.setForeground(Color.red);
        btnDeletar.addActionListener(e -> deletarFilme());
        
        add(btnSalvar);
        add(btnDeletar);
        
    }
    
    private void salvarAlteracoes(){
        filme.setTitulo(txtTitulo.getText().trim());
        filme.setGenero(txtGenero.getText().trim());
        filme.setAno(txtAno.getText().trim());
        
        try {
            filmeDAO.atualizarFilme(filme);
            JOptionPane.showMessageDialog(this, "Filme atualizado com sucesso ");
            dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar filme\n"
                    + e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void deletarFilme(){
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que excluir este filme?","Confirmação",
                JOptionPane.YES_NO_OPTION);
        
        if(confirmacao == JOptionPane.YES_OPTION){
            try {
                filmeDAO.deletarFilme(filme.getId());
                JOptionPane.showMessageDialog(this,"Filme deletado com sucesso!");
                dispose();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,"Erro ao deletar filmes\n"
                        +e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
