//classe
package com.mycompany.herancas;

public class Animal {
    protected String animal;
    
    //metodo
    public void emitirSom(){
        System.out.println("O animal faz um som... ");
    }

    //constructor
    public Animal(String animal) {
        this.animal = animal;
    }   
    
    //getter and setter
    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
    
}
