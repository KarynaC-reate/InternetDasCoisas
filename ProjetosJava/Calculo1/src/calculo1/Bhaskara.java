package calculo1;

public class Bhaskara {
    private double a,b,c;

//constructor
    public Bhaskara(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //método para calcular delta
    public double delta(){
        return Math.pow(this.getB(),2) -4 *(this.getA()*this.getC());
    }
    
    //método para resultado, x1 e x2 
    public double[] resultado(){
        double delta = delta(); //puxa o método delta()
        
        double x1 = (-this.getB()+Math.sqrt(delta))/(2*this.getA());
        double x2 = (-this.getB()-Math.sqrt(delta))/(2*this.getA());
        
        return new double[]{x1,x2};
    }
    
//getter and setter
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
}
