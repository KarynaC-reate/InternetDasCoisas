//main da classe ParImpar e Bhaskara
package com.mycompany.classe_bhasproject8;

import java.util.Scanner;

public class Classe_bhasproject8 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);  
        System.out.println("Digite um numero: ");
        int numeroDigitado=entrada.nextInt();
        
        ParImpar numero = new ParImpar(numeroDigitado);
        System.out.println(numero.verificaParOuImpar());
        
        }
        
    //Bhaskara bhas = new Bhaskara(1,5,-14);   
        //System.out.println(bhas.delta);
        //System.out.println(bhas.x1);
        //System.out.println(bhas.x2);
        //System.out.println("--------------------");
        //System.out.format("O valor de %.2f\n O valor de %.2f\n O valor de %.2f",bhas.delta,bhas.x1,bhas.x2);
        //get apenas mostra e set altera(insere)
        
        //bhas.calcularRaiz();
        
        //bhas.setA(1);
        //bhas.setB(5);
        //bhas.setC(-14);        
        
        //bhas.calcularRaiz();
        
    //ParImpar parimpar = new ParImpar();
        //System.out.println("--------------------");
        //System.out.println(parimpar.num);
        
    //}
}
