package bibliotecaa;

import java.sql.SQLException;

public class Bibliotecaa {
    public static void main(String[] args) {    
        
        //ConnectionFactory conexao = new ConnectionFactory();
        
        //if(conexao.conectaBD() !=null){
            //System.out.println("Deu certo ");
        //}else {
            //System.out.println("Deu errado ");
        //}
        
        //INSERIR USUARIO
        //UsuarioDAO usuarioDAO = new UsuarioDAO();
        //Usuario usuario = new Usuario(1,"Joao","joao@gmail.com","61-2222","aluno");
       
        //try{
            //usuarioDAO.criarUsuario(usuario);
        //}catch (SQLException e){
            //System.out.println("Deu ruim ");
        //}
        
        //BUSCAR USUARIO
        /*UsuarioDAO usuarioDAO = new UsuarioDAO();
        try{
            int idBuscado=1;
            Usuario usuario = usuarioDAO.buscarUsuarioPorId(idBuscado);
            
            if(usuario !=null){
                           
                    System.out.println("Deu certo ");
                    System.out.println("ID: " +usuario.getId());
                    System.out.println("NOME: " +usuario.getNome());                   
                    System.out.println("EMAIL: " +usuario.getEmail());
                    System.out.println("TELEFONE: " +usuario.getTelefone());
                    System.out.println("TIPO_USUARIO: " +usuario.getTipo_usuario());    
                    System.out.println("----------x----------");
                }else
                System.out.println("Nao encontrado: " +idBuscado);
            
                }catch (SQLException k){
                System.out.println("Deu Errado " +k.getMessage());
            } 
        }   
*/    
    
  /*  //DELETAR USUARIO
    
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();
       
        try{
            usuarioDAO.deletarUsuario(0);
        }catch (SQLException e){
            System.out.println("Deu ruim ");
        }
    }*/
    
    //ATUALIZAR USUARIO
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    Usuario usuario = new Usuario();
        
    try{
        usuarioDAO.atualizarUsuario(usuario);
    }catch (SQLException e) {
        System.out.println("DEU ERRADO ");
    }
   }
}
