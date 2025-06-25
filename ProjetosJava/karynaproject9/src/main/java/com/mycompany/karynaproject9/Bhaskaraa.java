 //classe bhaskara com raiz não real
package com.mycompany.karynaproject9;

public class Bhaskaraa {
    private double a,b,c;   
    
    //constructor
    public Bhaskaraa(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
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
        return (Math.pow(this.getB(),2)+(-4*this.getA()*this.getC()));
   
    }

 
    public void calcularRaiz(){
        double delta = calcularDelta();
        if (delta <0){
            System.out.println("RAIZ NÃO REAL! ");
        }else{
            double x1 = (-this.getB()+Math.sqrt(delta))/(2*this.getA());
            double x2 = (-this.getB()-Math.sqrt(delta))/(2*this.getA());
            System.out.format("DELTA: %.2f ",delta);
            System.out.format("X1: %.2f ",x1);
            System.out.format("X2: %.2f ",x2);
            
        }
        
    }
}
