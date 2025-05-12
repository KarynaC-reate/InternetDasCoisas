
package com.mycompany.polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
        Mamifero mamif = new Mamifero();
        mamif.emitirSom();

        Mamifero lobo = new Lobo();
        lobo.emitirSom();
        
        Mamifero dog = new Cachorro();
        dog.emitirSom();
        
    }
}
