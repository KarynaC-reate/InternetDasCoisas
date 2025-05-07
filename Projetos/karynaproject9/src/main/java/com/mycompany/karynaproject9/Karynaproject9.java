//main karyna
package com.mycompany.karynaproject9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Karynaproject9 {
    public static void main(String[] args) {         
     
    //PAR E IMPAR
    Scanner tecla = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO: ");
        int numeroDigitado = tecla.nextInt();
        
        PareImpar numero = new PareImpar(numeroDigitado);
        System.out.println(numero.verificaParEImpar());
        
    //BHASKARA
        Bhaskaraa bha = new Bhaskaraa(1,2,-14);  
        bha.calcularRaiz();

    //TRIANGULOS 
        TipoTriangulo tri = new TipoTriangulo(6,6,6);
        tri.verificaTriangulo();
       
        
//escrevendo     
    String textoA = String.valueOf(tri);
    String textoB = String.valueOf(bha);
    String textoC = numero.verificaParEImpar();
        String caminhoArquivo = "notas.txt";
        
    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))) {
        escritor.write(textoA);
        escritor.write(textoB);
        escritor.write(textoC);
        System.out.println("SALVO "+caminhoArquivo);            
            
    } catch (IOException e) {
        System.out.println("ERRO "+e.getMessage());
    }                          
     
//lendo        
    try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
        String linha;
        System.out.println("SALVO "+caminhoArquivo);        
        while ((linha = leitor.readLine()) !=null){
            System.out.println(linha);
    }
            
    } catch (IOException e) {
        System.out.println("ERRO "+e.getMessage());
    }
    
    }
    
}
