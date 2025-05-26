package carros;

import java.sql.SQLException;

public class Carros {
   
    public static void main(String[] args) throws SQLException {
        
        ConnectionFactory conexao = new ConnectionFactory();
        
        if(conexao.conectaBD() !=null){
            System.out.println("Deu certo ");
        }else {
            System.out.println("Deu errado ");
        }
        
        CarroDAO carroDAO = new CarroDAO();
        Carro carro = new Carro(1,"fiat","2020","carro","4 portas");
        
        try{
            carroDAO.criarCarro(carro);
        }catch (SQLException e){
            System.out.println("Deu errado ");
        }
    }  
    
}
