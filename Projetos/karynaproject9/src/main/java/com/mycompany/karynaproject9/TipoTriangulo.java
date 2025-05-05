//clase TipoTriangulo
package com.mycompany.karynaproject9;

public class TipoTriangulo {   
    private double ladoA,ladoB,ladoC;

    //constructor
    public TipoTriangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    //getter and setter
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

       
    
    public String verificaTriangulo(){
        Scanner teclado = new Scanner(System.in);
        
        if(ladoA+ladoB>ladoC && ladoA + ladoC>ladoB && ladoB +ladoC>ladoA){
            if(ladoA==ladoB && ladoB==ladoC){
                System.out.println("O triangulo e equilatero ");
            }else if (ladoA==ladoB || ladoA==ladoC || ladoB==ladoC){
                System.out.println("O triangulo e isosceles ");
            }else{
                System.out.println("O triangulo e escaleno ");
            }
             teclado.close();   
            //if(Math.pow(ladoA,2)+Math.pow(ladoB,2)==Math.pow(ladoC,2) ||
            //        Math.pow(ladoA,2)+Math.pow(ladoC,2)==Math.pow(ladoB,2) ||
             //       Math.pow(ladoB,2)+Math.pow(ladoC,2)==Math.pow(ladoA,2)){
             //   System.out.println("O triangulo e retangulo ");
            //else if
        }
    }    
}
