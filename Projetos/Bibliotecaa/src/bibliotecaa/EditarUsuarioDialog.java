package bibliotecaa;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditarUsuarioDialog extends javax.swing.JFrame {
    
    EditarUsuarioDialog(JanelaPrincipal aThis, Usuario usuario, UsuarioDAO usuarioDAO) {

    String nome = JOptionPane.showInputDialog(this, "Nome:");
    //valida se foi digitado algo
        if (nome == null || nome.trim().isEmpty()) {
            return; // Usuario cancelou ou não digitou nada
        }
        
    try{
        usuarioDAO.atualizarUsuario(usuario);
    }catch (SQLException e) {
        System.out.println("DEU ERRADO ");
    }
    }
}
