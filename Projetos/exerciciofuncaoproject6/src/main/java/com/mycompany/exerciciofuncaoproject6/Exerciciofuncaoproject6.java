/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciofuncaoproject6;

public class Exerciciofuncaoproject6 {
    static double bhas(double a, double b, double c) {                               
        double delta = Math.pow(b,2)-4*a*c;
        double x1 = (-b+Math.sqrt(delta))/(2*a);  
        double x2 = (-b-Math.sqrt(delta))/(2*a);
        return delta;            
        
    }    
        
    public static void main(String[] args) {
        System.out.println(bhas(1,5,-14));
    }                   
}
