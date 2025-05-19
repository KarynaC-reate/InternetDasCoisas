
package com.mycompany.banco;

public class Conta {
    String numero;
    double saldo;
    
    //constructor
    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        if(valor <= 0) {
            throw new IllegalArgumentException("Erro: Valor deve ser positivo. ");    
        }
        saldo += valor;
    }
    
    public void sacar(double valor){
        if(valor <= 0) {
            throw new IllegalArgumentException("Erro: Valor deve ser positivo. ");    
        }
        if(saldo < valor) {
            throw new IllegalArgumentException("Erro: Saldo insuficiente para saque. ");    
           
        }
        saldo -= valor;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
}
