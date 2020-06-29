package com.mycompany.generanumapp;

import java.util.Scanner;

public class GeneraNumApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();
      
        
      int contador = 1;
      while( contador <= numero2){
          
         int numeroAleatorio =(int) Math.floor(Math.random() * (numero1-numero2)+numero2);
          System.out.println("" + numeroAleatorio);
          
          contador++;
      }
       
      /*  for (int i = 1; i <= numero2; i++) {
            int numeroAleatorio =(int) Math.floor(Math.random() * (numero1-numero2)+numero2);
            System.out.println(numeroAleatorio);
            
        }
      */

    }
}
