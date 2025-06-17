package swingmatematica;


public class SwingMatematica {

    public static void main(String[] args) {
    Matematica matematica = new Matematica();
    
    System.out.println("SOMA DE VALORES: ");
    double a = matematica.soma(5,6);
        System.out.println(a);
        
    System.out.println("\nPAR OU IMPAR: ");    
    String b = matematica.ParImpar(1);
        System.out.println(b);
        
    System.out.println("\nBHASKARA: ");
    double c = matematica.Bhas(1, 5, -14);
        System.out.println(c);
    }
    
}
