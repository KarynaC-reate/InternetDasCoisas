//main
package com.mycompany.banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {        
        System.out.println("=====BEM-VINDO AO BANCO===== "); 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o numero da sua conta: ");
        int numConta = teclado.nextInt();
        teclado.nextLine();
        
        System.out.println("Tipo da conta(Corrente ou Poupança): ");
        String tipo = teclado.nextLine();
        
        System.out.println("Dono da conta: ");
        String dono = teclado.nextLine();
        
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Abrir conta ");                       
        System.out.println("2 - Fechar conta ");
        System.out.println("3 - Depositar ");
        System.out.println("4 - Sacar ");
        System.out.println("5 - Pagar mensalidade ");
        int opcao = teclado.nextInt();
        
        switch (opcao){
            
        }
        
    }
}
