package com.cice.ejercicios;

/*
 * EJERCICIO 04
 * Vamos a sacar por pantalla la tabla de multiplicar del número 7
 */
public class Ejercicio04 {
	public static void main (String [] args) {
		System.out.println("EJERCICIO 04");
		System.out.println("============");
		for (int i = 1; i <= 10; i++) {
			int resultado = (7 * i); 
			System.out.println("7 x " +i+ " = " +resultado);
		}
	}

}
