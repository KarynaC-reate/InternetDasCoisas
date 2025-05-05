//exemplo try para salvar no bloco de notas
package com.mycompany.exemplotryproject10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplotryproject10 {

    public static void main(String[] args) {
        String texto = "Professor";
        String caminhoArquivo = "karyna.txt";
//escrevendo  
    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))) {
        escritor.write(texto);
        System.out.println("SALVO "+caminhoArquivo);            
            
    } catch (IOException e) {
        System.out.println("ERRO "+e.getMessage());
    }
    
//lendo file        
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

