package padaria;

import java.sql.SQLException;

public class Padaria {
    public static void main(String[] args) {

        //ConnectionFactory conexao = new ConnectionFactory();
        
        //if(conexao.conectaBD() !=null){
            //System.out.println("Deu certo ");
        //}else {
            //System.out.println("Deu errado ");
        //}
        
        //ComidaDAO comidaDAO = new ComidaDAO();
        //Comida comida = new Comida(1,"Pao","11.99 kg","comida");
       
        //try{
            //comidaDAO.criarUsuario(comida);
        //}catch (SQLException e){
            //System.out.println("Deu ruim ");
        //}
        
       /* ComidaDAO comidaDAO = new ComidaDAO();
        try{
            int idBuscado=1;
            Comida comida = comidaDAO.buscarComidaPorId(idBuscado);
            
            if(comida !=null){
                           
                    System.out.println("Deu certo ");
                    System.out.println("ID: " +comida.getId());
                    System.out.println("NOME: " +comida.getNome());                   
                    System.out.println("PRECO: " +comida.getPreco());
                    System.out.println("TIPO: " +comida.getTipo());
                    System.out.println("----------x----------");
                }else
                System.out.println("Nao encontrado: " +idBuscado);
            
                }catch (SQLException k){
                System.out.println("Deu Errado " +k.getMessage());
            }
        } */   
    
    //DELETAR USUARIO
    /*    ComidaDAO comidaDAO = new ComidaDAO();
        Comida comida = new Comida();
       
        try{
            comidaDAO.deletarComida(1);
        }catch (SQLException e){
            System.out.println("Deu ruim ");
        }
    */
    
    //ATUALIZAR USUARIO
    ComidaDAO comidaDAO = new ComidaDAO();
    Comida comida = new Comida();
        
    try{
        comidaDAO.atualizarUsuario(comida);
    }catch (SQLException e) {
        System.out.println("DEU ERRADO ");
    }
    }
}
