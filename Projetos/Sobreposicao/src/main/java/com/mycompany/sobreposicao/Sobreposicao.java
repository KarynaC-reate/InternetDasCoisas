package com.mycompany.sobreposicao;
public class Sobreposicao {

    public static void main(String[] args) {
        //Calculo conta = new Calculo();
        
        //conta.metric(2, 5);
        //conta.metric(1,-1,12);
        //conta.metric(8f, 4f, 6f, 2f);
        
        //System.out.println(conta.metric(2,5));
        //System.out.println(conta.metric(1,-1,12));
        //System.out.println(conta.metric(8f,4f,6f,2f));
        Mamifero maya = new Mamifero("Marrom",30,1,"4");
        
        maya.setCorPelo("Marrom");
        maya.corPelo();
        System.out.println(maya.getCorPelo());
        
    }
}
