/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor_exercicio_project5;

public class Vetor_exercicio_project5 {
    public static void bhas(double a, double b, double c) {
                             
        double delta = Math.pow(b,2)-4*a*c;
        double x1 = (-b+Math.sqrt(delta))/(2*a);  
        double x2 = (-b-Math.sqrt(delta))/(2*a);
        
        System.out.format("O valor de %.2f\n O valor de %.2f\n O valor de %.2f",delta,x1,x2);
    }
    
    public static void main(String[] args){
        bhas(1,5,-14);
    }
}





