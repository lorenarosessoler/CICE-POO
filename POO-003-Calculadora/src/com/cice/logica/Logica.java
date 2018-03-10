package com.cice.logica;

/*
 * Contiene todos los métodos lógicos de nuestra aplicación:
 * Sumar
 * Restar
 * Multiplicar
 * Dividir
 * Salir
 */

public class Logica {
	
	//Sumar
	public static int sumar (int numA, int numB) {
		//REGLAS DE BUENA PROGRAMACIÓN
			//Siempre que tengamos un método con devolución, creamos una variable interna de ese tipo e insertamos
			//la cláusula return devolviendo ese tipo

		int resultado = 0;
		resultado = numA + numB;
		return resultado;
	}

	
	//Restar
	public static int restar (int numA, int numB) {
		int resultado = 0;
		resultado = numA - numB;
		return resultado;
	}
	
	
	//Multiplicar
	public static int multiplicar (int numA, int numB) {
		int resultado = 0;
		resultado = numA * numB;
		return resultado;
	}
	
	
	//Dividir
	public static int dividir (int numA, int numB) {
		int resultado = 0;
		resultado = numA / numB;
		return resultado;
	}
}
