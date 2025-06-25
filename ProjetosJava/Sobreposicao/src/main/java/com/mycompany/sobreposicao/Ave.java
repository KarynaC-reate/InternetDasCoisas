
package com.mycompany.sobreposicao;

public class Ave extends Animal{
    private String corPena;
    
    //constructor
    public Ave(String corPena, double peso, int idade, String membros) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }
    

    //metodo
    public void fazerNinho() {
        System.out.println("O pássro faz... ");
        
    //getter and setter   
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
