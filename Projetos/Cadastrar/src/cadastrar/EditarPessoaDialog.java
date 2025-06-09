package cadastrar;

import java.sql.SQLException;

public class EditarPessoaDialog {
    
    EditarPessoaDialog(JanelaCadastro aThis, Pessoa pessoa, PessoaDAO pessoaDAO) {
        
    try{
        pessoaDAO.atualizarPessoa(pessoa);
    }catch (SQLException e) {
        System.out.println("DEU ERRADO ");
    }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
}
