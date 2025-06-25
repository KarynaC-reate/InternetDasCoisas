package aula1;

import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double a = teclado.nextDouble();

        if(a%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
    
}
