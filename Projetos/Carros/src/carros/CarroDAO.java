package carros;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CarroDAO {
    private final Connection connection;
    
    public CarroDAO(){
        this.connection = new ConnectionFactory().conectaDB();
    }
    
    public void criarCarro(Carro carro)throws SQLException{
        String sql = "INSERT INTO tb_usuarios(nome,email,"
                + "telefone,tipo_usuario)VALUES(?,?,?,?)";
       
        PreparedStatement pstm = null;
        ResultSet rse = null;
        
        try{
            pstm = connection.prepareStatement(sql);
            pstm.setString(1,carro.getAno());
            pstm.setString(2,carro.getMarca());
            pstm.setString(3,carro.getPortas());
            pstm.setString(3,carro.getTipo());
            
            pstm.executeUpdate();
            System.out.println("DEU CERTO. ");
        }catch (SQLException e){
            System.out.println("DEU ERRADO. "); 
            
        }finally{
            if(rse !=null) rse.close();
            if(pstm !=null) pstm.close();
        }
    }
}
