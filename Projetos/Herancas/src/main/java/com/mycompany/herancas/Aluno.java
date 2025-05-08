package com.mycompany.herancas;

public class Aluno extends Pessoa{
    private String matricula,curso;
    
    public void cancelarMatricula(){
        System.out.println("Matricula Cancelada. ");
    }

    //constructor (apaga o antigo erro e faz um novo constructor)
    public Aluno(String matricula, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    //getter and setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
     
    
    
}
