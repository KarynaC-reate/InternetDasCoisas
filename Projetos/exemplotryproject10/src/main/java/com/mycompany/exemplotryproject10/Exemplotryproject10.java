//main pessoa
package com.mycompany.exemplotryproject10;

import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDate;
import java.io.FileWriter;

public class Exemplotryproject10 {
    
    public static void main(String[] args) {
        try(Scanner teclado = new Scanner(System.in)){
            System.out.println("Quantas pessoas cadastrar? ");
            int qtd = teclado.nextInt();
            teclado.nextLine();
            Pessoa[] pessoas = new Pessoa[qtd];
            for(int i=0;i<qtd;i++){
                System.out.println("\n Cadastro de Pessoa "+(i+1)+"-----");
                
                System.out.println("Nome: ");
                String nome = teclado.nextLine();
                
                System.out.println("CPF: ");
                String cpf = teclado.nextLine();
                
                System.out.println("Data de Nascimento (AAAA-MM-DD): ");
                String dataStr = teclado.nextLine();
                
                System.out.println("Altura (em metros): ");
                double altura = teclado.nextDouble();
                
                System.out.println("Peso (em Kg): ");
                double peso = teclado.nextDouble();
                
                LocalDate data = LocalDate.parse(dataStr);
                
                pessoas[i] = new Pessoa(nome,cpf,data,altura,peso);
                
            }
            //SALVANDO BLOCO DE NOTAS
            try(FileWriter write = new FileWriter("karyna.txt")){
                write.write("Nome;CPF;DataNascimento;Altura;Peso;IMC;Maior Idade;\n");
                for(Pessoa p : pessoas){
                    write.write(p.toCVS()+"\n");
                }
                System.out.println("\nArquivo 'pessoas.txt' salvo com sucesso! ");
                
            }catch(IOException e){
                System.out.println("Erro ao salvar o rquivo: "+e.getMessage());
              }
            
        }
    
    }
}
