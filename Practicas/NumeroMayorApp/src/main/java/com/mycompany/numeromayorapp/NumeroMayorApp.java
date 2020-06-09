/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.numeromayorapp;

import java.util.Scanner;

/**
 *
 * @author JAGN
 */
public class NumeroMayorApp {
    public static void main(String[] args){
        
        Scanner sc = new Scanner( System.in );
        
        
        System.out.println("Ingre el numero1: ");
        int numero1 = sc.nextInt();
        
        System.out.println("Ingrese el numero2: ");
        int numero2 = sc.nextInt();
        
        if( numero1 > numero2)
            System.out.println("El numero mayor es: " + numero1);
        else if( numero2 > numero1)
            System.out.println("El numero mayor es: " + numero2);
        else
            System.out.println("Los dos numeros son iguales");
        
    }
    
}
