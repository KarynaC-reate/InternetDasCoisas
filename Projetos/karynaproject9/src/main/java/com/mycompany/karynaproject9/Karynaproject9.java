//main karyna
package com.mycompany.karynaproject9;

import java.util.Scanner;

public class Karynaproject9 {

    public static void main(String[] args) {              
    Bhaskaraa bhas = new Bhaskaraa(1,5,-14);       
        
        bhas.setA(1);
        bhas.setB(5);
        bhas.setC(-14);    
        bhas.calcularRaiz();

    Scanner teclado = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO: ");
        int numeroDigitado = teclado.nextInt();
        
        PareImpar numero = new PareImpar(numeroDigitado);
        System.out.println(numero.verificaParEImpar());
    
//transcrever os resultados no bloco de notas        
    
    }
    
}
