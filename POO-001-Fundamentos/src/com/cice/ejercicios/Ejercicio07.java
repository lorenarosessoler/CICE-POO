package com.cice.ejercicios;

import java.util.Scanner;

/*
 * EJERCICIO 07
 * Caculadora
 */
public class Ejercicio07 {
	public static void main (String [] args) {
		//Creamos el menu de la calculadora
		int opcion = 0;
		int a = 0;
		int b = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("MENÚ PRINCIPAL CALCULADORA v1.0");
			System.out.println("==============");
			System.out.println("1 - Suma");
			System.out.println("2 - Resta");
			System.out.println("0 - Salir");
			System.out.println("==============");
			System.out.print("La opción elegida es: ");
			opcion = sc.nextInt();
		
			if (opcion == 1) {
				System.out.print("Introduce el número A: ");
				a = sc.nextInt();
				System.out.print("Introduce el número B: ");
				b = sc.nextInt();
				
				int suma = a+b;
				System.out.println("La suma de los números A y B es igual: " +suma);
				
			} else if (opcion ==2) {
				System.out.print("Introduce el número A: ");
				a = sc.nextInt();
				System.out.print("Introduce el número B: ");
				b = sc.nextInt();
				
				int resta = a-b;
				System.out.println("La resta de los números A y B es igual: " +resta);
				
			} else {
				System.out.println("Hasta Pronto!");				
			}
			
		} while (opcion != 0);
		
	}

		

}
