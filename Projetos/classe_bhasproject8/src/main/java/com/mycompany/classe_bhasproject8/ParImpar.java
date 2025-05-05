//classe ParImpar
package com.mycompany.classe_bhasproject8;

public class ParImpar {    
    
    
    private int valor;

    //contructor
    public ParImpar(int valor) {
        this.valor = valor;
    }
    
    //getter and setter
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String verificaParOuImpar(){
        //encapsular->substitui a variável pelo this do constructor
        String resposta =(this.getValor()%2==0)?"Par":"Impar";
        return resposta;
    }
}       
    
      

    

 
    
    

   