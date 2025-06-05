package bibliotecaa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;      
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {
    private final Connection connection;
    
    public UsuarioDAO(){     
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    //inserir usuarios
    public void criarUsuario(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO tb_usuarios(nome,email,"
                + "telefone,tipo_usuario)VALUES(?,?,?,?)";
       
        PreparedStatement pstmt = null;
        ResultSet rs = null;
       
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
            if(rs !=null) rs.close();
            if(pstmt !=null) pstmt.close();           
            }
        }
    
    //listar usuarios
    public List<Usuario> listarUsuarios()throws SQLException{
        List<Usuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM tb_usuarios";
        
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
    
    //buscar por id
    public Usuario buscarUsuarioPorId(int id) throws SQLException{
        String sql = "SELECT * FROM tb_usuarios WHERE id=?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            
            if(rs.next()){
                usuario = new Usuario(0,"","","","");
                usuario.setId(rs.getInt("Id"));
                usuario.setNome(rs.getString("Nome"));
                usuario.setEmail(rs.getString("Email"));
                usuario.setTelefone(rs.getString("Telefone"));
                usuario.setTipo_usuario(rs.getString("tipo_usuario"));
                
            }
        }catch (SQLException e){
            System.out.println("Deu errado: ");
        }finally{
            if(rs !=null)rs.close();
            if(pstmt !=null)pstmt.close();
        }
        return usuario;
    }       
    
    //DELETE
    public void deletarUsuario(int id) throws SQLException {
        String sql = "DELETE FROM tb_usuarios WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            
            pstm.setInt(1, id);
            int linhasAfetadas = pstm.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Usuario deletado com sucesso! ");
            }else {
                System.out.println("Nenhum usuario encontrado com o ID informado. ");
            }
            
        }catch (SQLException e) {
            System.out.println("Erro ao deletar usuario: " + e.getMessage());
        }
    }
    
    //UPDATE 
    public void atualizarUsuario(Usuario usuario) throws SQLException {
        String sql = "UPDATE tb_usuarios SET nome = ?, email = ?, telefone = ?, tipo_usuario = ? WHERE id = ?";
        
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getTelefone());
            stmt.setString(4, usuario.getTipo_usuario());
            stmt.setInt(5, usuario.getId());
            stmt.executeUpdate();
            
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Usuario atualizado com sucesso. ");
            }else{
                System.out.println("Usuario com ID nao encontrado. ");
            }
        }catch (SQLException e) {
            System.out.println("Erro ao atualizar usuario: " + e.getMessage());
        }
    }
    /*
    public void atualizarTabela() {
        String sql = "SELECT id, nome, telefone, tipo_usuario FROM tb_usuarios";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            model.setRowCount(0);
            
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("ID"),
                    rs.getString("Nome"),
                    rs.getString("Email"),
                    rs.getString("Telefone"),
                    rs.getString("tipo_usuario")
                });
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados: " + e.getMessage());
        }
    }*/
}

