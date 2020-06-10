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
            System.out.println("El numero 1 es mayor " );
        else if( numero2 > numero1)
            System.out.println("El numero 2 es mayor " );
        else
            System.out.println("Los dos numeros son iguales");
        
    }
    
}
