//classe objeto
package com.mycompany.interfac;

public class Aviao implements Transporte{
       
    @Override
    public void mover(){
        System.out.println("✈ O avião está voando pelos céus. ");
    }
}
