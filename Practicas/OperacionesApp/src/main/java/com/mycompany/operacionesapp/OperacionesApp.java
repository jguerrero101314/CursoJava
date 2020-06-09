/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operacionesapp;

import java.util.Scanner;

/**
 *
 * @author JAGN
 */
public class OperacionesApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Ingre el numero 1: ");
        int numero1 = sc.nextInt();
        System.out.println(" Ingre el numero 2: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("El resutado de la suma es: " + suma);
        System.out.println("El resutado de la resta es: " + resta);
        System.out.println("El resutado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resutado de la division es: " + division);
        System.out.println("El resutado del modulo es: " + modulo);

    }

}
