//classe Bhaskara
package com.mycompany.classe_bhasproject8;

public class Bhaskara {
    private double a,b,c;
    //double delta = Math.pow(b,2)-4*a*c;
    //double x1 = (-b+Math.sqrt(delta))/(2*a);
    //double x2 = (-b-Math.sqrt(delta))/(2*a);

    
    //constructor
    public Bhaskara(double a, double b, double c) {
        this.a = 2;
        this.b = 6;
        this.c = -16;
    }
      
    
    
    //getter and setter
    public double getA() {
        return a;//funcao
    }

    public void setA(double a) {
        this.a = a;//procedimento
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    
    
    
    
    public double calcularDelta(){
        return (Math.pow(this.getB(),2)-(4*this.getA()*this.getC()));
    }
    
    public void calcularRaiz(){
        //Para calcular o delta
        double delta = calcularDelta();
        
        if(delta<0){
            System.out.println("Não existe raiz real. ");
        }else{
            double x1 = (-this.getB()+Math.sqrt(delta))/(2*this.getA());
            double x2 = (-this.getB()-Math.sqrt(delta))/(2*this.getA());
            System.out.format("Delta: %.2f ",delta);
            System.out.format("X1: %.2f ",x1);
            System.out.format("X2: %.2f ",x2);
        }
    }
     
      
}
