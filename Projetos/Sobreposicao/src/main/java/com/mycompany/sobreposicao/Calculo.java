
package com.mycompany.sobreposicao;

public class Calculo {
    //Sobrecarga: variaveis iguais porém com estilos e parâmetros diferentes. 
    //Assinatura: o que vai dentro dos parenteses.
    public int metric(int a, int b){
        return a + b;
    }
    
    public double metric(double a, double b, double c){
        return Math.pow(b,2)-4 *a*c;
    }
    
    public float metric(float a, float b, float c, float d){
        return (a+b+c+d)/4;
        
    }
}
