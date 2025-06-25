//classe
package olaswing;

public class Aluno extends Pessoa{
    private String maricula;
    private String curso;
    

    public Aluno(String maricula, String curso, String nome, String endereco, String sexo, String cpf) {
        super(nome, endereco, sexo, cpf);
        this.maricula = maricula;
        this.curso = curso;
    }
    
    
    //getter and setter
    public String getMaricula() {
        return maricula;
    }

    public void setMaricula(String maricula) {
        this.maricula = maricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
