/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

public class exercicio_project1 {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    
       System.out.println("Olá, digite o seu nome: ");
       String nome = teclado.nextLine();
        System.out.format("Olá %s seja bem-vindo(a)",nome);
    }
}