package com.mycompany.interfac;

public class Interfac {

    public static void main(String[] args) {

        Transporte carro = new Carro();
        carro.mover();
        
        Transporte barco = new Barco();
        barco.mover();
        
        Transporte aviao = new Aviao();
        aviao.mover();
    }
}
