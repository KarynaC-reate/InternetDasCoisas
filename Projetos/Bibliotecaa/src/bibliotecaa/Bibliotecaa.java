package bibliotecaa;

import java.sql.SQLException;
import java.util.List;

public class Bibliotecaa {

    public static void main(String[] args) {
        //ConnectionFactory conexao = new ConnectionFactory();
        
        //if(conexao.conectaBD() !=null){
            //System.out.println("Deu certo ");
        //}else {
            //System.out.println("Deu errado ");
        //}
        
        //UsuarioDAO usuarioDAO = new UsuarioDAO();
        //Usuario usuario = new Usuario(1,"karyna","k@gmail.com","61-2222","k");
       
        //try{
            //usuarioDAO.criarUsuario(usuario);
        //}catch (SQLException e){
            //System.out.println("Deu ruim ");
        //}
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        try{
            List<Usuario> usuario = usuarioDAO.listarUsuarios();
            if(usuario.isEmpty()){
                System.out.println("VAZIA. ");
            }else{
                for(Usuario usuario : usuarios){
                    System.out.println("ID" +usuario.getId());
                    System.out.println("NOME" +usuario.getNome());                   
                    System.out.println("EMAIL" +usuario.getEmail());
                    System.out.println("TELEFONE" +usuario.getTelefone());
                    System.out.println("TIPO_USUARIO" +usuario.getTipo_usuario());    
                    System.out.println("----------x----------");
                }}
                }catch (SQLException k){
                System.out.println("Deu Errado" +k.getMessage());
            }
        }                     
}
    

