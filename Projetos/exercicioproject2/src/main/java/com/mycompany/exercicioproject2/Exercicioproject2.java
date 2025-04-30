/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicioproject2;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercicioproject2 { 
    public static void main(String[] args) {
        
    Scanner opcao = new Scanner(System.in);
    JFrame frame = new JFrame();
               frame.setAlwaysOnTop(true);
    
        System.out.print("Escolha as opcoes e 1 a 3: ");
        int escolha=opcao.nextInt();
        
        switch (escolha) {
            case 1:
               System.out.println("digite um numero");
               int n1 =opcao.nextInt();
               String num=(n1%2==0)?"Par":"Impar";
               System.out.println(num);      
               
               
               JOptionPane.showMessageDialog(null, num);
               break;
               
            case 2:  
               double a=1, b=5, c=14, x1,x2,delta;
               System.out.println("Informe os Valores de A,B,C: "); 
               double resultado =opcao.nextDouble();
               delta=Math.pow(b,2)-4*a*c;
               x1=(-b+Math.sqrt(delta))/(2*a);
               x2=(-b-Math.sqrt(delta))/(2*a);
               System.out.format("O delta: %.2f\n x1: %.2f\n x2: %.2f",delta,x1,x2); 
                           
               break;
               
            case 3:
               System.out.println("Informe a idade: ");
               double idade=opcao.nextDouble();
               if(idade >18){
                   System.out.println("Deve votar.");
               }if(idade>70){
                   System.out.println("Nao precisa votar.");
               }else{
                   System.out.println("Nao tem permissao para votar.");
               } 
               
               JOptionPane.showConfirmDialog(null, idade);
               break;
       }
    }
    
}
