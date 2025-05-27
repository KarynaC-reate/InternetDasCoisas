package carros;

import java.sql.SQLException;

public class Carros {
   
    public static void main(String[] args) throws SQLException {
        
        //ConnectionFactory conexao = new ConnectionFactory();
        
        //if(conexao.conectaBD() !=null){
            //System.out.println("Deu certo ");
        //}else {
            //System.out.println("Deu errado ");
        //}
        
        //CarroDAO carroDAO = new CarroDAO();
        //Carro carro = new Carro(1,"fiat","2020","carro","4 portas");
        
        //try{
            //carroDAO.criarCarro(carro);
        //}catch (SQLException e){
            //System.out.println("Deu errado ");
        //}
        
        CarroDAO carroDAO = new CarroDAO();
        try{
            int idBuscado=1;
            Carro carro = carroDAO.buscarCarroPorId(idBuscado);
            
            if(carro !=null){
                           
                    System.out.println("Deu certo ");
                    System.out.println("ID: " +carro.getId());
                    System.out.println("MARCA: " +carro.getMarca());                   
                    System.out.println("ANO: " +carro.getAno());
                    System.out.println("TIPO: " +carro.getTipo());
                    System.out.println("PORTAS: " +carro.getPortas());    
                    System.out.println("----------x----------");
                }else
                System.out.println("Nao encontrado: " +idBuscado);
            
                }catch (SQLException k){
                System.out.println("Deu Errado " +k.getMessage());
            }      
        }     
}
