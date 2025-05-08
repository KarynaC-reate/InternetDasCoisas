//classe
package com.mycompany.banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private String status;
    private boolean contaAberta;

    //constructor
    public ContaBanco(int numConta, String tipo, String dono, double saldo, String status, boolean contaAberta) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
        this.contaAberta = contaAberta;
    }  

    //abrir conta
    public void abrirConta(double ValorInicial){
        if(!contaAberta){
            System.out.println("Conta ja aberta. ");
        }else{
            saldo = ValorInicial;
            contaAberta = true;
            System.out.println("Conta aberta com sucesso. ");
        }
    }

    //getter and setter
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isContaAberta() {
        return contaAberta;
    }

    public void setContaAberta(boolean contaAberta) {
        this.contaAberta = contaAberta;
    }

    
    
    
    
}
