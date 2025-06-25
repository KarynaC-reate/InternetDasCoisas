/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repet3_project3;

/**
 *
 * @author ead
 */
public class Repet3_project3 {

    public static void main(String[] args) {
    int linhas = 5;
        
        for(int i=1; i<=linhas;i++){
        //direita
            for(int j=1; j<=(linhas-i);j++){
                System.out.print(" ");
            }
            //esquerdo
            for(int k=1; k<=i;k++){
                System.out.print("#");
            }
            System.out.println(" ");
            
            //direito
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
