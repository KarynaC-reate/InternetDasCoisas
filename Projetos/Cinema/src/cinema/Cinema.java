package cinema;

import java.sql.SQLException;

public class Cinema {
    public static void main(String[] args) {

    //ConnectionFactory conexao = new ConnectionFactory();
        
        //if(conexao.conectaBD() !=null){
            //System.out.println("Deu certo ");
        //}else {
           //System.out.println("Deu errado ");
        //}
    
        //FilmeDAO filmeDAO = new FilmeDAO();
        //Filme filme = new Filme(1,"Booh!","terror","2025");
       
        //try{
            //filmeDAO.criarFilme(filme);
        //}catch (SQLException e){
            //System.out.println("Deu ruim ");
        //}
        
        FilmeDAO filmeDAO = new FilmeDAO();
        try{
            int idBuscado=1;
            Filme filme = filmeDAO.buscarUsuarioPorId(idBuscado);
            
            if(filme !=null){
                           
                    System.out.println("Deu certo ");
                    System.out.println("ID: " +filme.getId());
                    System.out.println("TITULO: " +filme.getTitulo());                   
                    System.out.println("GENERO: " +filme.getGenero());
                    System.out.println("ANO: " +filme.getAno());
                    System.out.println("----------x----------");
                }else
                System.out.println("Nao encontrado: " +idBuscado);
            
                }catch (SQLException k){
                System.out.println("Deu Errado " +k.getMessage());
            }
        }           
}
