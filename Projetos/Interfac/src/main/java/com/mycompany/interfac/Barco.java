//casse objeto
package com.mycompany.interfac;


public class Barco implements Transporte{
    
    @Override
    public void mover(){
        System.out.println("⛵ O barco esta navegando no mar. ");
    }
}
