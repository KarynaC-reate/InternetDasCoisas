package pkgswitch;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.println("Isso e um(a): ");
        
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripe";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
    
}
