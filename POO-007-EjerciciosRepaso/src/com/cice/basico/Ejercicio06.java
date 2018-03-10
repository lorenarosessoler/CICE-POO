package com.cice.basico;

import java.util.Scanner;

/*
 * Ejercicio 06:
 * 
 * Crea un programa que realice:
 * - Lea una cantidad de grados centígrados y la pase a grados Fahrenheit
 * - La fórmula correspondiente es: F = 32 + (9 * C / 5)
 * - Crea un menu para mostrarlo
 */
public class Ejercicio06 {

	public static void main(String[] args) {

		//Variables necesarias
		Scanner sc = new Scanner (System.in);
		int opcion = 0;
		int c;
		int f;

		//Creamos el Menú
		do {		
			System.out.println("=======================================");
			System.out.println("MENÚ - CONVERSOR DE GRADOS ºC a ºF");
			System.out.println("=======================================");
			System.out.println("1 - Convertir grados centígrdos a Fahrenheit");
			System.out.println("0 - Salir");
			System.out.print("Elige un opción o presione 0 para salir: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.print("Introduce un valor en ºC: ");
				c = sc.nextInt();
				f = (32 + ( (9 * c) / 5));
				System.out.println("El valor de " +c+ " ºC es igual a " +f+ " ºF");
				break;
			
			 default:
				if (opcion != 0) {
					System.out.print("La opción escogida es incorrecta, elige otra opción o presione 0 para salir");
					break;
				}
			}
			
		} while (opcion != 0);
		
		System.out.println("Hasta la próxima!");
		
	}

}
