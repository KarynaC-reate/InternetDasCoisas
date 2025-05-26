package carros;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CarroDAO {
    private final Connection connection;
    
    public CarroDAO(){
        this.connection = new ConnectionFactory().conectaBD();
    }
    
    public void criarCarro(Carro carro)throws SQLException{
        String sql = "INSERT INTO Carros(marca,ano,"
                + "tipo,portas)VALUES(?,?,?,?)";
       
        PreparedStatement pstm = null;
        ResultSet rse = null;
        
        try{
            pstm = connection.prepareStatement(sql);
            pstm.setString(1,carro.getMarca());
            pstm.setString(2,carro.getAno());
            pstm.setString(3,carro.getTipo());
            pstm.setString(4,carro.getPortas());
            
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
