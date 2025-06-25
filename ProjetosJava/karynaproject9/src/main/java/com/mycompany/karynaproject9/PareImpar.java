//classe pareimpar com operador ternario
package com.mycompany.karynaproject9;

public class PareImpar {
    private int valor;

    //constructor
    public PareImpar(int valor) {
        this.valor = valor;
    }

    //getter and setter
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String verificaParEImpar(){
        String resposta = (this.getValor()%2==0)?"PAR":"IMPAR";
        return resposta;
    }
    
}
