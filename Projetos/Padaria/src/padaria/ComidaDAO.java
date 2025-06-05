package padaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComidaDAO {
    private final Connection connection;
    
    public ComidaDAO(){     
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    public void criarComida(Comida comida) throws SQLException{
        String sql = "INSERT INTO tb_comidas(nome,preco,"
                + "tipo)VALUES(?,?,?)";
       
        PreparedStatement pstmt = null;
        ResultSet rs = null;
       
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, comida.getNome());
            pstmt.setString(2, comida.getPreco());
            pstmt.setString(3, comida.getTipo());

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
    
    public List<Comida> listarComidas()throws SQLException{
        List<Comida> lista = new ArrayList<>();
        String sql = "SELECT * FROM tb_comidas";
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                Comida comida = new Comida(0,"","","");
                comida.setId(rs.getInt("Id"));
                comida.setNome(rs.getString("nome"));
                comida.setPreco(rs.getString("preco"));
                comida.setTipo(rs.getString("Tipo"));                   
            
                lista.add(comida);
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
    
    public Comida buscarComidaPorId(int id) throws SQLException{
        String sql = "SELECT * FROM tb_comidas WHERE id=?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Comida comida = null;
        
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            
            if(rs.next()){
                comida = new Comida(0,"","","");
                comida.setId(rs.getInt("Id"));
                comida.setNome(rs.getString("Nome"));
                comida.setPreco(rs.getString("preco"));
                comida.setTipo(rs.getString("Tipo"));
                
            }
        }catch (SQLException e){
            System.out.println("Deu errado: ");
        }finally{
            if(rs !=null)rs.close();
            if(pstmt !=null)pstmt.close();
        }
        return comida;
     }   
    
    //DELETE
    public void deletarComida(int id) throws SQLException {
        String sql = "DELETE FROM tb_comidas WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            
            pstm.setInt(1, id);
            int linhasAfetadas = pstm.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Comida deletada com sucesso! ");
            }else {
                System.out.println("Nenhuma comida encontrada com o ID informado. ");
            }
            
        }catch (SQLException e) {
            System.out.println("Erro ao deletar comida: " + e.getMessage());
        }
    }
    
    //UPDATE 
    public void atualizarComida(Comida comida) throws SQLException {
        String sql = "UPDATE tb_comidas SET nome = ?, preco = ?, tipo = ? WHERE id = ?";
        
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, comida.getNome());
            stmt.setString(2, comida.getPreco());
            stmt.setString(3, comida.getTipo());
            stmt.setInt(4, comida.getId());
            
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Comida atualizada com sucesso. ");
            }else{
                System.out.println("Comida com ID nao encontrado. ");
            }
        }catch (SQLException e) {
            System.out.println("Erro ao atualizar comida: " + e.getMessage());
        }
    }
}

