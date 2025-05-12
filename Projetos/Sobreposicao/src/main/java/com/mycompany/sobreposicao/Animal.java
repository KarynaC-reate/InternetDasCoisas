
package com.mycompany.sobreposicao;

public class Animal {
    private double peso;
    private int idade;
    private String membros;
    
    //constructor
    public Animal(double peso, int idade, String membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }   
    
   //metodos
   public void locomover(){
       System.out.println("O animal se locomove... ");
   }
    
   public void alimentar(){
       System.out.println("O animal se alimenta de... ");
   }
    
   public void emitirSom(){
       System.out.println("O animal faz um som... ");
   }
   
   //getter and setter

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMembros() {
        return membros;
    }

    public void setMembros(String membros) {
        this.membros = membros;
    }
   
}
