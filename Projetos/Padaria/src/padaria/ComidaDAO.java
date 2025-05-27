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
    
    public void criarUsuario(Comida comida) throws SQLException{
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
}
