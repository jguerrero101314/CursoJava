package com.operadores;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Proporciona el alto:");
		int alto = sc.nextInt();
		
		System.out.print("Proporciona el ancho:");
		int ancho = sc.nextInt();
		
		int area = alto * ancho;
		int perimetro = (alto + ancho) * 2;
		
		System.out.println("Area = " + area);
		System.out.println("Perimetro = " + perimetro);

	}

}
