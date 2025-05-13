//entidade(classe para sobrecarga)
package com.mycompany.sobrecarga;

public class Calculos {
    
    public String calcular(int valor){
        String resposta = (valor%2==0)?"PAR":"IMPAR";
        return resposta;
    }
    
    public int calcular(int a, int b){
        return (a + b);
    }
    
    public double calcular(double a, double b, double c){   
        double delta = Math.pow(b,2)-4 *a*c;
        double x1 = (-b+Math.sqrt(delta))/(2*a);
        double x2 = (-b-Math.sqrt(delta))/(2*a);   
        System.out.format("Delta: %.2f, X1: %.2f, X2: %.2f ",delta,x1,x2);        
        return 0;
       
    }
    
    public float calcular(float a, float b, float c, float d){
        return (a+b+c+d)/4;
        
    }
}
