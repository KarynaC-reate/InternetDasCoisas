//main
package com.mycompany.sobrecarga;

import java.util.Scanner;
//Sobrecarga: usar o mesmo nome de método
public class Sobrecarga {

    public static void main(String[] args) {
    Calculos conta = new Calculos();  
    Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");      
        int numero = teclado.nextInt();
        
        System.out.println("O numero e: ");
        System.out.println(conta.calcular(numero));
        
        System.out.println("Soma igual a: ");
        System.out.println(conta.calcular(2,7));
        
        System.out.println("Bhaskara igual a:");
        System.out.println(conta.calcular(1, 2, -14));
        
        System.out.println("Media igual a: ");
        System.out.println(conta.calcular(7f,6f,3f,8f));

    }
}
