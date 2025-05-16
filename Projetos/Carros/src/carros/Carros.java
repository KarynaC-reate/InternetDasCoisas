package carros;

import java.sql.SQLException;

public class Carros {
   
    public static void main(String[] args) {
        CarroDAO carroDAO = new CarroDAO();
        Carro carro = new Carro(1,"k","a","r","y");
       
        try{
            carroDAO.criarCarro(carro);
        }catch (SQLException e){
            System.out.println("Deu errado ");
        }
    }  
    
}
