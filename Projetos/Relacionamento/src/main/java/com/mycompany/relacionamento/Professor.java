//classe 
package com.mycompany.relacionamento;

public class Professor {
    String nome;
    Escola escola; //Associação a classe escola
    
    //constructor
    public Professor(String nome, Escola escola) {
        this.nome = nome;
        this.escola = escola;
    }   
    
    //metodo
    void mostrarDados(){
        System.out.println("Professor: " +nome+ " \nEscola: " +escola.nome);
        
    }
}
