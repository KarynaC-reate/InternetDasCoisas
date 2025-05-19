
package cinema;

public class Filme {
    private int id;
    private String titulo;
    private String genero;
    private String ano;
    
    //constructor
    public Filme(int id, String titulo, String genero, String ano) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
    }
    
    //constructor
    public Filme() {
    }
     
    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    
}
