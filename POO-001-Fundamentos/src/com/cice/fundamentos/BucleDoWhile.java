package com.cice.fundamentos;

import java.util.Scanner;

public class BucleDoWhile {
	public static void main (String [] args) {
		
		System.out.println("EJEMPLO 1");
		//EJEMPLO 1
		int a = 0;
		int b = 1;
		do {
			System.out.println("A es mayor que B");
			a=b;
		} while (a<b);
		
		
		System.out.println("================");
		System.out.println("EJEMPLO 2");

		//EJEMPLO 2: Menu
		// Saldra del bucle solo cuando se introduzca el valor 0
		int opcion = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("==============");
			System.out.println("Elige una opción");
			System.out.println("1 - Suma");
			System.out.println("2 - Resta");
			System.out.println("0 - Salir");
			opcion = sc.nextInt();
			
		} while (opcion != 0);
		
	}

		
}
