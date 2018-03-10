package com.cice.basico;
/*
 * Ejercicio 05:
 * 
 *  Crea un programa que realice:
 *  - Declara una variable a de tipo entero y asignale un valor.
 *  - A continuación muestra un mensaje por consola indicando si el valor de la variable:
 *  -- par o impar
 *  -- positivo o negativo
 *  -- múltiplo de 5
 *  -- múltiplo de 10
 *  -- si es mayor o menor que 100
 */

public class Ejercicio05 {

	public static void main(String[] args) {
		
		//Declaración de variable
		int a = 150;
		
		//Par o impar
		if ((a % 2) == 0) {
			System.out.println("El número " +a+ " es par.");
		} else {
			System.out.println("El número " +a+ " es impar.");
		}
		
		
		//Positivo o negativo
		if (a <= 0) {
			System.out.println("El número " +a+ " es negativo.");
		} else {
			System.out.println("El número " +a+ " es positivo.");
		}

		//Múltiplo de 10
		if ((a % 10) == 0) {
			System.out.println("El número " +a+ " es mútlipo de 10.");
		} else {
			System.out.println("El número " +a+ " no es múltiplo de 10.");
		}
		
		//Mayor o Menor que 100
		if (a <= 100) {
			System.out.println("El número " +a+ " es menor que 100.");
		} else {
			System.out.println("El número " +a+ " es mayor que 100.");
		}

	}

}
