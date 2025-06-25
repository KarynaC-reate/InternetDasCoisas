/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repet2_project3;

/**
 *
 * @author ead
 */
public class Repet2_project3 {

    public static void main(String[] args) {
        int linha = 5; 
       
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(linha-i);j++){
                System.out.print(" ");              
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}
