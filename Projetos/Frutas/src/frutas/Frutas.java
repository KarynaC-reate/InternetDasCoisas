//MAIN
package frutas;

import java.sql.SQLException;

public class Frutas {

    public static void main(String[] args) {
          //INSERIR FRUTA
//        ConnectionFactory conexao = new ConnectionFactory();
//        
//        if(conexao.conectaBD() !=null){
//            System.out.println("Deu certo ");
//        }else {
//            System.out.println("Deu errado ");
//        }
//        
//        FrutaDAO frutaDAO = new FrutaDAO();
//        Fruta fruta = new Fruta(1,"Maçã","190","madura","Brasília");
//       
//        try{
//            frutaDAO.criarFruta(fruta);
//        }catch (SQLException e){
//            System.out.println("Deu ruim ");
//        }
        
        //BUSCAR FRUTA
//        FrutaDAO frutaDAO = new FrutaDAO();
//        try{
//            int idBuscado=1;
//            Fruta fruta = frutaDAO.buscarFrutaPorId(idBuscado);
//            
//            if(fruta !=null){
//                           
//                    System.out.println("Deu certo ");
//                    System.out.println("ID: " +fruta.getId());
//                    System.out.println("NOME: " +fruta.getNome());                   
//                    System.out.println("QUANTIDADE: " +fruta.getQuantidade());
//                    System.out.println("MATURAÇÃO: " +fruta.getMaturacao());
//                    System.out.println("LOCAL_COLHIDO: " +fruta.getLocalColhido());    
//                    System.out.println("----------x----------");
//                }else
//                System.out.println("Nao encontrado: " +idBuscado);
//            
//                }catch (SQLException k){
//                System.out.println("Deu Errado " +k.getMessage());
//            } 
//        }   
    
        //DELETAR FRUTA
    
//        FrutaDAO frutaDAO = new FrutaDAO();
//        Fruta fruta = new Fruta();
//       
//        try{
//            frutaDAO.deletarFruta(1);
//        }catch (SQLException e){
//            System.out.println("Deu ruim ");
//        }
//    }
    
    //ATUALIZAR FRUTA
    FrutaDAO frutaDAO = new FrutaDAO();
    Fruta fruta = new Fruta(2,"Maçã","1900","Madura","Brasília");
        
    try{
        frutaDAO.atualizarFruta(fruta);
    }catch (SQLException e) {
        System.out.println("DEU ERRADO ");
    }
    }
    
}
