package cadastrar;

public class Pessoa {
    private int id; 
    private String nome;
    private String email; 
    private String idade;
    private String sexo;
    
    //constructor
    public Pessoa(int id, String nome, String email, String idade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //constructor vazio
    public Pessoa() {
    }
    
    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
