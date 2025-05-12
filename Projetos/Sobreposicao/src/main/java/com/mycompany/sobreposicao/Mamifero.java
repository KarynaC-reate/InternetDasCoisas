package com.mycompany.sobreposicao;

public class Mamifero extends Animal {
    private String corPelo;

    //constructor
    public Mamifero(String corPelo, double peso, int idade, String membros) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }
      
    //metodo
    public void corPelo(){
        System.out.println("A cor do pelo e... ");
    }
    
    //getter and setter
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
}
