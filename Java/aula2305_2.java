/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23.pkg05;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class aula2305_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        int [] numero = new int [10];
        int impar = 0;
        int par =0;
        
        System.out.println("------------Programa Pares e Impares ---------");
        System.out.println("Digite 15 numeros inteiros:");
        
        for (int i = 0; i < numero.length ; i++){
            System.out.println("Numero " + (i+1) + ":");
            numero[i] = scanner.nextInt();
           
              if (numero[i] %2 == 0){
            par = par + 1; 
        }
        else{ 
                impar++;
            }
           
                
        }
            System.out.println("A quantidade de par eh:" +par);
            System.out.println("A quantidade de impar eh:" +impar);
            
            scanner.close();
        }
        }
    

