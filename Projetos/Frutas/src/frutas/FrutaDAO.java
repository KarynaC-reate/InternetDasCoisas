package frutas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FrutaDAO {
    private final Connection connection;
    
    public FrutaDAO(){     
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    //inserir usuarios
    public void criarFruta(Fruta fruta) throws SQLException{
        String sql = "INSERT INTO tb_fruta(nome,quantidade,"
                + "maturacao,local_colhido)VALUES(?,?,?,?)";
       
        PreparedStatement pstmt = null;
        ResultSet rs = null;
       
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, fruta.getNome());
            pstmt.setString(2, fruta.getQuantidade());
            pstmt.setString(3, fruta.getMaturacao());
            pstmt.setString(4, fruta.getLocalColhido());

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
    public List<Fruta> listarFrutas()throws SQLException{
        List<Fruta> lista = new ArrayList<>();
        String sql = "SELECT * FROM tb_fruta";
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                Fruta fruta = new Fruta(0,"","","","");
                fruta.setId(rs.getInt("Id"));
                fruta.setNome(rs.getString("nome"));
                fruta.setQuantidade(rs.getString("quantidade"));
                fruta.setMaturacao(rs.getString("maturacao"));                   
                fruta.setLocalColhido(rs.getString("local_colhido"));
            
                lista.add(fruta);
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
    public Fruta buscarFrutaPorId(int id) throws SQLException{
        String sql = "SELECT * FROM tb_fruta WHERE id=?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Fruta fruta = null;
        
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            
            if(rs.next()){
                fruta = new Fruta(0,"","","","");
                fruta.setId(rs.getInt("Id"));
                fruta.setNome(rs.getString("Nome"));
                fruta.setQuantidade(rs.getString("Quantidade"));
                fruta.setMaturacao(rs.getString("Maturação"));
                fruta.setLocalColhido(rs.getString("Local_colhido"));
                
            }
        }catch (SQLException e){
            System.out.println("Deu errado: ");
        }finally{
            if(rs !=null)rs.close();
            if(pstmt !=null)pstmt.close();
        }
        return fruta;
    }       
    
    //DELETE
    public void deletarFruta(int id) throws SQLException {
        String sql = "DELETE FROM tb_fruta WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            
            pstm.setInt(1, id);
            int linhasAfetadas = pstm.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Fruta deletada com sucesso! ");
            }else {
                System.out.println("Nenhuma fruta encontrada com o ID informado. ");
            }
            
        }catch (SQLException e) {
            System.out.println("Erro ao deletar fruta: " + e.getMessage());
        }
    }
    
    //UPDATE 
    public void atualizarFruta(Fruta fruta) throws SQLException {
        String sql = "UPDATE tb_fruta SET nome = ?, quantidade = ?, maturacao = ?, local_colhido = ? WHERE id = ?";
        PreparedStatement pstm = null;
        
        try{
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, fruta.getNome());
            pstm.setString(2, fruta.getQuantidade());
            pstm.setString(3, fruta.getMaturacao());
            pstm.setString(4, fruta.getLocalColhido());
            pstm.setInt(5, fruta.getId());
            
            int linhasAfetadas = pstm.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println(" atualizada com sucesso. ");
            }else{
                System.out.println("Fruta com ID nao encontrado. ");
            }
        }catch (SQLException e) {
            System.out.println("Erro ao atualizar fruta: " + e.getMessage());
        }finally{
            if (pstm !=null)pstm.close();
        }
    }
}
