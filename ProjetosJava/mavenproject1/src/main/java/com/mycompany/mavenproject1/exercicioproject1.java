/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

public class exercicioproject1 {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
       System.out.println("Ola, digite o seu nome: ");
       String nome=teclado.nextLine();
       System.out.format("Ola %s seja bem-vindo",nome);
       
       double a=10f, b=9.8f;
       
       System.out.format("A nota de %s e %.2f ", nome,(a+b)/2);
       
   }
}