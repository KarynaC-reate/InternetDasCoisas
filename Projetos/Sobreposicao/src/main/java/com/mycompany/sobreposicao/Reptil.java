
package com.mycompany.sobreposicao;

public class Reptil extends Animal {
    private String corEscama;
    
    //constructor
    public Reptil(String corEscama, double peso, int idade, String membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }
   
    
    //metodo
    public void corEscama(){
        System.out.println("A cor da escama é... ");
        
    }
    //getter and setter 
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
