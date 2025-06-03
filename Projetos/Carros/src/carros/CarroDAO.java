package carros;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    private final Connection connection;
    
    public CarroDAO(){
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    public void criarCarro(Carro carro)throws SQLException{
        String sql = "INSERT INTO Carros(marca,ano,"
                + "tipo,portas)VALUES(?,?,?,?)";
       
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,carro.getMarca());
            pstmt.setString(2,carro.getAno());
            pstmt.setString(3,carro.getTipo());
            pstmt.setString(4,carro.getPortas());
            
            pstmt.executeUpdate();
            System.out.println("DEU CERTO. ");
        }catch (SQLException e){
            System.out.println("DEU ERRADO. " +e.getMessage()); 
            
        }finally{
            if(rs !=null) rs.close();
            if(pstmt !=null) pstmt.close();
        }
    }
    
    public List<Carro> listarCarros()throws SQLException{
        List<Carro> lista = new ArrayList<>();
        String sql = "SELECT * FROM Carros";
        
        PreparedStatement pstm = null;
        ResultSet rs = null;
        
        try{
            pstm = connection.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()){
                Carro carro = new Carro(0,"","","","");
                carro.setId(rs.getInt("Id"));
                carro.setMarca(rs.getString("marca"));
                carro.setAno(rs.getString("ano"));
                carro.setTipo(rs.getString("tipo"));                   
                carro.setPortas(rs.getString("portas"));
            
                lista.add(carro);
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
    
     public Carro buscarCarroPorId(int id) throws SQLException{
        String sql = "SELECT * FROM Carros WHERE id=?";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Carro carro = null;
        
        try{
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            
            if(rs.next()){
                carro = new Carro(0,"","","","");
                carro.setId(rs.getInt("Id"));
                carro.setMarca(rs.getString("Marca"));
                carro.setAno(rs.getString("Ano"));
                carro.setTipo(rs.getString("Tipo"));
                carro.setPortas(rs.getString("Portas"));
                
            }
        }catch (SQLException e){
            System.out.println("Deu errado: ");
        }finally{
            if(rs !=null)rs.close();
            if(pstmt !=null)pstmt.close();
        }
        return carro;
     } 
    
     //DELETE
    public void deletarCarro(int id) throws SQLException {
        String sql = "DELETE FROM Carros WHERE id = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)) {
            
            pstm.setInt(1, id);
            int linhasAfetadas = pstm.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Carro deletado com sucesso! ");
            }else {
                System.out.println("Nenhum carro encontrado com o ID informado. ");
            }
            
        }catch (SQLException e) {
            System.out.println("Erro ao deletar carro: " + e.getMessage());
        }
    }
    
    //UPDATE 
    public void atualizarUsuario(Carro carro) throws SQLException {
        String sql = "UPDATE tb_usuarios SET nome = ?, email = ?, telefone = ?, tipo_usuario = ? WHERE id = ?";
        
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getAno());
            stmt.setString(3, carro.getTipo());
            stmt.setString(4, carro.getPortas());
            stmt.setInt(5, carro.getId());
            
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Carro atualizado com sucesso. ");
            }else{
                System.out.println("Carro com ID nao encontrado. ");
            }
        }catch (SQLException e) {
            System.out.println("Erro ao atualizar carro: " + e.getMessage());
        }
    }
}


