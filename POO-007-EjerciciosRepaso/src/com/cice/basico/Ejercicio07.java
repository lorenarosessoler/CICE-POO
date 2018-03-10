package com.cice.basico;

import java.util.Scanner;

/*
 * Ejercicio 07:
 * Crea un programa que realice:
 * - Pase la velocidad en Km/h a m/s. La velocidad se lee por teclado
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int velKmh;
		int velMs;
		int opcion = 0;
		
		do {
			System.out.println("=======================");
			System.out.println("CONVERSOR DE VELOCIDAD");
			System.out.println("=======================");
			System.out.print("Introduce una velocidad en Km/h o presione 0 para salir: ");
			velKmh = sc.nextInt();
			
			//Control del bucle
			opcion = velKmh;
			
			if (opcion != 0) {
				velMs = ((velKmh * 1000) / 3600);
				System.out.println("El valor de la velocidad " +velKmh+ " Km/h es igual a " +velMs+ " m/s");
			} else {
				System.out.println("Hasta Pronto!");
			}
			
		} while (opcion != 0);
	}
}
