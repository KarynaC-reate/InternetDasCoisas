
package com.mycompany.sobreposicao;

public class Peixe extends Animal{
    private String corEscama;
    
    //constructor
    public Peixe(String corEscama, double peso, int idade, String membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }
       
    
    //metodo
    public void soltarBolha(){
        System.out.println("O peixe faz... ");
        
    //getter and setter    
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
