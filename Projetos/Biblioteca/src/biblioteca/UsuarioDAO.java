
package biblioteca;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {
    private Connection connection;
    
    public UsuarioDAO(){     
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    public void criarUsuario(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO tb_usuarios(nome,email,"
                + "telefone,tipo_usuario)VALUES(?,?,?,?)";
       
        PreparedStatement pstmt = null;
       
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getEmail());
            pstmt.setString(3, usuario.getTelefone());
            pstmt.setString(4, usuario.getTipo_usuario());

            pstmt.executeUpdate();
            System.out.println("Deu certo. ");
        }catch(SQLException e){
            System.out.println("Deu errado. " +e.getMessage());
           
        }
        finally{
            if(pstmt !=null) pstmt.close();
            }
        }
    }

