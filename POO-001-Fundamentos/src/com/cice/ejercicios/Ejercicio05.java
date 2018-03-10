package com.cice.ejercicios;

import java.util.Scanner;

/*
 * EJERCICIO 05
 * Desarrollar un programa que a partir de un determinado número, vaya realizando la suma de todos los números consecutivos
 * a dicho número. EL proceso finalizará cuando alcance o supere el valor de 100. Se mostrará solo el resultado final
 */
public class Ejercicio05 {
	public static void main (String [] args) {
		//definición de varables
		int numero= 0;
		int suma = 0;
		
		//Pedimos un número al usuario
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		
		System.out.println("Vamos a realizar la suma de de todos los números consecutivos a dicho número. EL proceso finalizará cuando alcance o supere el valor de 100");	
		
		for (int i = numero; suma <= 100; i++) {
			suma = suma + i;
		}
		System.out.println("Dado un numero" +numero+ "la suma de sus consecutivos es: " +suma);
	}
}
