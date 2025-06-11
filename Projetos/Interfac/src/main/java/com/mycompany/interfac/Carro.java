//classe objeto
package com.mycompany.interfac;

class Carro implements Transporte{
    
    @Override //=sobreposicao;sobreescrita de transporte;
    public void mover(){
        System.out.println("🚗   _____  O carro esta andando pela estrada. \n __|__|__|__ \n|__--___--__| \n   --   -- ");
    }
  
}
