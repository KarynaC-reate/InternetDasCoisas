/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_vetor_project4;

/**
 *
 * @author ead
 */
public class Exercicio_vetor_project4 {

    public static void main(String[] args) {
        
        String mes[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        int dia[] = {31,28,31,30,31,30,31,30,31,31,30,31,30,31};
          
        for(int i=0;i<mes.length;i++){
            System.out.println(mes[i]+ " tem "+ dia[i]+ " dias. ");
            System.out.println("--------------------");
            System.out.format("%s tem %d dias\n",mes[i],dia[i]);
        }           
    }
}
