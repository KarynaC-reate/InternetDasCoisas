//main
package com.mycompany.banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);

        ContaBanco conta = new ContaBanco();
        
        System.out.println("===== BEM-VINDO AO BANCO ===== "); 
        
        System.out.println("Conta aberta com sucesso. ");
        System.out.println("Saldo inicial atual: ");
        conta.abrirConta("1", 200);
        System.out.println(conta.getSaldo("1"));
        
        System.out.println("Saque bem-sucedido. ");
        conta.sacar("1", 40);
        
        System.out.println("Pagamento bem-sucedido. ");
        conta.pagar("1", 50);
        
        System.out.println("Deposito bem-sucedido. ");
        conta.depositar("1", 300);
        
        System.out.println("Saldo atual final: ");
        System.out.println(conta.getSaldo("1"));
        
        conta.fecharConta("1");
        System.out.println("Conta fechada com sucesso. ");
        
    /*  System.out.println("Escolha uma opcao: ");
        System.out.println("1 - Abrir conta ");                       
        System.out.println("2 - Checar saldo ");
        System.out.println("3 - Depositar ");
        System.out.println("4 - Sacar ");
        System.out.println("5 - Pagar mensalidade ");
        System.out.println("6 - Fechar conta ");
        int opcao = teclado.nextInt();
        
        switch (opcao){
            case 1:
                System.out.println("Digite o numero da sua conta: ");
                int numConta = teclado.nextInt();
                teclado.nextLine();
        
                System.out.println("Tipo da conta(Corrente ou Poupança): ");
                String tipo = teclado.nextLine();
        
                System.out.println("Dono da conta: ");
                String dono = teclado.nextLine();
                break;
                
            case 2:
                System.out.println("Saldo atual: ");
                System.out.println(conta.getSaldo("1"));
                break;
                
            case 3:
                conta.depositar("1", 300);
                System.out.println("Deposito bem-sucedido. ");
                break;
                
            case 4:
                conta.sacar("1", 40);
                System.out.println("Saque bem-sucedido. ");
                break;
                
            case 5:
                conta.pagar("1", 50);
                System.out.println("Pagamento bem-sucedido. ");
                break;
                
            case 6:
                conta.fecharConta("1");
                System.out.println("Conta fechada com sucesso. ");
                break;
                
        }*/
    }
}
