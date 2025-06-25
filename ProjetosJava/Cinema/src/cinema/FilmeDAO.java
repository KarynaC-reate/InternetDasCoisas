package cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilmeDAO {
    private final Connection connection;
    
    public FilmeDAO(){     
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    //CRIAR
    public void criarFilme(Filme filme) throws SQLException{
        String sql = "INSERT INTO tb_filmes(titulo,genero,"
                + "ano)VALUES(?,?,?)";
       
        PreparedStatement pstmt = null;
        ResultSet rs = null;
       
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, filme.getTitulo());
            pstmt.setString(2, filme.getGenero());
            pstmt.setString(3, filme.getAno());

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
    
    //LISTAR 
    public List<Filme> listarFilmes()throws SQLException{
        List<Filme> lista = new ArrayList<>();
        String sql = "SELECT * FROM tb_filmes";
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                Filme filme = new Filme(0,"","","");
                filme.setId(rs.getInt("Id"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setGenero(rs.getString("genero"));
                filme.setAno(rs.getString("ano"));
            
                lista.add(filme);
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
    
    //BUSCAR ID
    public Filme buscarFilmesPorId(int id) throws SQLException{
        String sql = "SELECT * FROM tb_filmes WHERE id=?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Filme filme = null;
        
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            
            if(rs.next()){
                filme = new Filme(0,"","","");
                filme.setId(rs.getInt("Id"));
                filme.setTitulo(rs.getString("Titulo"));
                filme.setGenero(rs.getString("Genero"));
                filme.setAno(rs.getString("Ano"));
                
            }
        }catch (SQLException e){
            System.out.println("Deu errado: ");
        }finally{
            if(rs !=null)rs.close();
            if(pstmt !=null)pstmt.close();
        }
        return filme;
     }       
    
     //DELETE
    public void deletarFilme(int id) throws SQLException {
        String sql = "DELETE FROM tb_filmes WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            
            pstm.setInt(1, id);
            int linhasAfetadas = pstm.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Filme deletado com sucesso! ");
            }else {
                System.out.println("Nenhum filme encontrado com o ID informado. ");
            }
            
        }catch (SQLException e) {
            System.out.println("Erro ao deletar filme: " + e.getMessage());
        }
    }
    
    //UPDATE 
    public void atualizarFilme(Filme filme) throws SQLException {
        String sql = "UPDATE tb_filmes SET titulo = ?, genero = ?, ano = ? WHERE id = ?";
        
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, filme.getTitulo());
            stmt.setString(2, filme.getGenero());
            stmt.setString(3, filme.getAno());
            stmt.setInt(4, filme.getId());
            
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Filme atualizado com sucesso. ");
            }else{
                System.out.println("Filme com ID nao encontrado. ");
            }
        }catch (SQLException e) {
            System.out.println("Erro ao atualizar filme: " + e.getMessage());
        }
    }
}



