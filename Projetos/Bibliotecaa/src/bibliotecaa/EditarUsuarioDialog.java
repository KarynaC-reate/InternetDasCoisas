package bibliotecaa;

import java.sql.SQLException;

public class EditarUsuarioDialog extends javax.swing.JFrame {
    
    EditarUsuarioDialog(JanelaPrincipal aThis, Usuario usuario, UsuarioDAO usuarioDAO) {
    
    try{
       usuarioDAO.atualizarUsuario(usuario);
    }catch (SQLException e) {
        System.out.println("DEU ERRADO ");
    }
    }
}