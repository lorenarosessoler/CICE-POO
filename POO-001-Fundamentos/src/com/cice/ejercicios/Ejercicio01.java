package com.cice.ejercicios;

import java.util.Scanner;

/*
 * EJERCICIO 01
 * Pedir al usuario que introduzca dos números enteros y vamos a decir si son iguales o a es mayor o menos que b
 */
public class Ejercicio01 {
	
	public static void main  (String [] args) {
		//Creo dos variables donde almacenar los números solicitados
		int a;
		int b;
		
		//SCANNER -- herramienta de java que lee todo lo que escribimos por teclado y lo añada al código
		Scanner sc = new Scanner (System.in);
		
		System.out.println("EJERCICIO 1");
		System.out.println("===========");

		//Pedir al usuario que introduzca por consola dos números enteros
		System.out.print("Introduzca un número entero: ");
		//Almaceno primer número
		a = sc.nextInt();
		
		System.out.print("Introduzca otro número entero: ");
		//Almaceno segundo número
		b = sc.nextInt();
		
		//Comprobamos si a es igual, mayor o menos que b
		if (a > b) {
			System.out.println("A (" + a + ") es mayor que B (" + b + ")");
		} else if  (a < b) {
			System.out.println("A (" + a + ") es menor que B (" + b + ")");
		} else {
			System.out.println("A (" + a + ") es igual que B (" + b + ")");
		}

	}

}
