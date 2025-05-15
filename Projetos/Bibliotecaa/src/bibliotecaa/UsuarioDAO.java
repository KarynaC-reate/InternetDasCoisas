
package bibliotecaa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
        

public class UsuarioDAO {
    private final Connection connection;
    
    public UsuarioDAO(){     
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    public void criarUsuario(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO tb_usuarios(nome,email,"
                + "telefone,tipo_usuario)VALUES(?,?,?,?)";
       
        PreparedStatement pstmt = null;
        ResultSet rse = null;
       
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
            if(rse !=null) rse.close();
            if(pstmt !=null) pstmt.close();           
            }
        }
    
    public List<Usuario> listarUsuarios()throws SQLException{
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                Usuario usuario = new Usuario(0,"","","","");
                usuario.setId(rs.getInt("Id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setTelefone(rs.getString("telefone"));                   
                usuario.setTipo_usuario(rs.getString("tipo_usuario"));
            
                lista.add(usuario);
        }
        }catch (SQLException k){
                System.out.println("Erro" +k.getMessage());
        }
        finally{
            if(rs !=null) rs.close();
            if(pstm !=null) pstm.close();
            }
            return lista;
        }
    }       



