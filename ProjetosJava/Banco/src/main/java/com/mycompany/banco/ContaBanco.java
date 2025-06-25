//classe
package com.mycompany.banco;

import java.util.ArrayList;
import java.util.List;

public class ContaBanco {
    private List<Conta> contas = new ArrayList<>();

    //abrir conta
    public void abrirConta(String numero, double saldoInicial){
        
        for (Conta conta : contas) {
            if(conta.getNumero().equals(numero)){
                throw new IllegalArgumentException("Erro: conta ja existe");
            }
        }
        contas.add(new Conta(numero, saldoInicial));       
    }

    public void fecharConta(String numero){
        for (Conta conta : contas){
            if(conta.getNumero().equals(numero)){
                contas.remove(conta);
                return;
            }       
        }
        throw new IllegalArgumentException("Erro: Conta nao encontrada. ");
    }    
          
    public void depositar(String numero, double valor){
        for (Conta conta : contas){
            if(conta.getNumero().equals(numero)){
                conta.depositar(valor);
                return;
            }       
        }
        throw new IllegalArgumentException("Erro: Conta nao encontrada. ");
    }
            
    public void sacar(String numero,double valor){
        for (Conta conta : contas){
            if(conta.getNumero().equals(numero)){
                conta.sacar(valor);
                return;
            }       
        }
        throw new IllegalArgumentException("Erro: Conta nao encontrada. ");
    }
    
    public void pagar(String numero, double valor){
        for (Conta conta : contas){
            if(conta.getNumero().equals(numero)){
                conta.sacar(valor);
                return;
            }
            throw new IllegalArgumentException("Erro: Conta nao encontrada. ");    
        }
       
    }
    
    public double getSaldo(String numero){
        for (Conta conta : contas){
            if(conta.getNumero().equals(numero)){
                return conta.getSaldo();
            }
        }
        throw new IllegalArgumentException("Erro: Conta nao encontrada. ");    

    }
      
    
}
