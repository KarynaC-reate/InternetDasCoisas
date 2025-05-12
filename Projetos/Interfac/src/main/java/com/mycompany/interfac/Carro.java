//classe objeto
package com.mycompany.interfac;

class Carro implements Transporte{
    
    @Override //=sobreposicao;sobreescrita de transporte;
    public void mover(){
        System.out.println("🚗 O carro esta andando pela estrada. ");
    }
    
}
