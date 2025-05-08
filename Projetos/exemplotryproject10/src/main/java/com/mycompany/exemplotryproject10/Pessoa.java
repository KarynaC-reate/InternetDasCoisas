//classe
package com.mycompany.exemplotryproject10;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome, cpf;
    private LocalDate dataNascimento;
    private double altura, peso;   

    //constructor
    public Pessoa(String nome, String cpf, LocalDate dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }
    
    //IMC
    public double calcularIMC(){
        if(this.getAltura()<=0){
            throw new IllegalArgumentException("ALTURA MENOR DO QUE 0! ");
        }
        return this.getPeso()/(Math.pow(this.getAltura(),2));
    }
    
    //MAIOR IDADE
    public boolean isMaiorDeIdade(){
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(this.getDataNascimento(),hoje);
        return idade.getYears()>=18;
    }
    
    //SALVAR
    public String toCVS(){
        return this.getNome() +";"+ this.getDataNascimento()+";"+this.getAltura()
                +";"+this.getPeso()+";"+String.format("%.2f", calcularIMC())
                +";"+(isMaiorDeIdade()?"Sim":"Nao");
    }
        
    //getter and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    }

    

