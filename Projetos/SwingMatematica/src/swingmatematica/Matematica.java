package swingmatematica;

public class Matematica {
    public double soma(double a, double b){
        double soma = a+b;
        return soma;
    }
    
    public String ParImpar(int n1){
        String num = (n1%2==0)?"PAR":"IMPAR";
        return num;
    }
    
    public double Bhas(double a, double b, double c){
        
        double delta = Math.pow(b,2)-4*a*c;
        double x1 = (-b+Math.sqrt(delta))/(2*a);
        double x2 = (-b-Math.sqrt(delta))/(2*a);
        
        System.out.println(delta);
        System.out.println(x1);
        System.out.println(x2);
        
        return x2;
    }
   
}
