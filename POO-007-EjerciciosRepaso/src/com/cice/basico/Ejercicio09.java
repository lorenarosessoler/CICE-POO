package com.cice.basico;

import java.util.Scanner;

/*
 * Ejercicio 09
 * 
 * Programa que lee un número de tres cifras y las muestra por separado
 */
public class Ejercicio09 {

	public static void main(String[] args) {
		
		//Variables
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		//Solicitar numero al usuario
		System.out.print("Introduce un numero de tres cifras: ");
		numero = sc.nextInt();
		
		//Paso de int a String
		String cadena = String.valueOf(numero);
		
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		

	}

}
