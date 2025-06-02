package switch_2;

import java.util.Scanner;
import javax.swing.JFrame;

public class Switch_2 {

    public static void main(String[] args) {
    Scanner opcao = new Scanner(System.in);
    JFrame frame = new JFrame();
    frame.setAlwaysOnTop(true);
    
        System.out.print("Escolha as opcoes e 1, 2, ou 3: ");
        int escolha=opcao.nextInt();
        
        switch (escolha) {
            case 1:
                System.out.println("Informe um valor: ");
                double num1=opcao.nextDouble();
                System.out.println("Informe outro valor: ");
                double num2=opcao.nextDouble();
                System.out.format("A soma e: " + (num1+num2));
                break;
        
            case 2:
               System.out.println("digite um numero");
               int n1 =opcao.nextInt();
               //String num=(n1%2==0)?"Par":"Impar";
               String num = (Math.floorMod(n1, 2)==0)?"Par":"Impar";
               System.out.println(num);      
               break;
               
            case 3:  
               double a=1, b=1, c=-12;
               double delta;
               double x1;
               double x2;
               delta=Math.pow(b,2)-4*a*c;
               x1=(-b+Math.sqrt(delta))/(2*a);
               x2=(-b-Math.sqrt(delta))/(2*a);
               System.out.format("Delta: %.2f \nx1: %.2f \nx2: %.2f",delta,x1,x2); 
               break;
               
        }
    }
}
