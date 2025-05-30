
package pessoa;

public class pessoaa {
    private int id; 
    private String nome;
    private String email; 
    private String idade;
    private String sexo;

    
    //cons
    public pessoaa(int id, String nome, String idade, String sexo) {
        this.id = id;
        this.nome = nome;
        this.email = idade;
        this.sexo = sexo;
    }
    
    //c vazio

    public pessoaa() {
    }


    //g and s

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

    public String getIdade() {
        return email;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void getSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
