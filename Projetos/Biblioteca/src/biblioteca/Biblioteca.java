
package biblioteca;
import java.sql.SQLException;
public class Biblioteca {

    public static void main(String[] args) {
        //ConnectionFactory conexao = new ConnectionFactory();
        
        //if(conexao.conectaBD() !=null){
            //System.out.println("Deu certo ");
        //}else {
            //System.out.println("Deu errado ");
        //}
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario(1,"karyna","k@gmail.com","2222","k");
       
        try{
            usuarioDAO.criarUsuario(usuario);
        }catch (SQLException e){
            System.out.println("Deu ruim ");
        }
        
    }
    
}
