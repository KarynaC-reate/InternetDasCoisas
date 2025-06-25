package carros;

public class Carro {
    private int id;
    private String marca;
    private String ano;
    private String tipo;
    private String portas;

    //constructor
    public Carro(int id, String marca, String ano, String tipo, String portas) {
        this.id = id;
        this.marca = marca;
        this.ano = ano;
        this.tipo = tipo;
        this.portas = portas;
    }
    
    //constructor

    public Carro() {
    }
    
    
    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPortas() {
        return portas;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }
    
}
