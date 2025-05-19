//main
package cinema;
public class Cinema {

    public static void main(String[] args) {

    Filme filme = new Filme();
    filme.setTitulo("Booh");
    filme.setGenero("Terror");
    filme.setAno("2025");
    
    System.out.println(filme.getTitulo());
    System.out.println(filme.getGenero());
    System.out.println(filme.getAno());
    
    
    }  
}
