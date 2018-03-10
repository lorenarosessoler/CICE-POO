package com.cice.basico;

/*
 * Ejercicio 01:
 * 
 * Programa una aplicación que realice los siguiente:
 * - Declara tres variables, un entero, un decimal y un caracter y asignales un valor correcto
 * - Pinta por consola el valor de cada variable concatenando con el nombre de cada una
 * - Pinta por consola los cálculos del (entero + decimal) y (decimal - entero)
 */
public class Ejercicio01 {
	
	//Método main
	public static void main (String [] args) {
		
		//Variables
		int entero = 5;
		double decimal = 1.5;
		String palabra = "coche";
		
		//Pintamos variables por pantalla
		System.out.println("El numero es: " +entero);
		System.out.println("El numero decimal es: " +decimal);
		System.out.println("La palabra es: " +palabra);
		
		//Cálculos
		System.out.println("La suma de " +entero+ " + " +decimal+ " es igual a " +(entero + decimal));
		System.out.println("La resta de " +decimal+ " - " +entero+ " es igual a " +(decimal - entero));


	}

}
