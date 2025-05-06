//main karyna
package com.mycompany.karynaproject9;

import java.io.BufferedWriter;
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
        
        
        Bhaskaraa bha = new Bhaskaraa(1,2,-14);  
        bha.calcularRaiz();
       // numero.verificaParEImpar();
//escrevendo     
    String textoC = String.valueOf(bha);
    String text = numero.verificaParEImpar();
        String caminhoArquivoC = "parimpar.txt";
        
    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivoC))) {
       escritor.write(textoC);
        escritor.write(text);
        System.out.println("SALVO "+caminhoArquivoC);            
            
    } catch (IOException e) {
        System.out.println("ERRO "+e.getMessage());
    }                       
    
    
    
   
    }
    
}
