package com.cice.basico;

/*
 * Ejercicio 02:
 * 
 * Crea un programa que realice lo siguiente:
 * - Declara dos variables X e Y de tipo entero, dos variables M y N de tipo decimal. Asignales un valor
 * - Pinta por consola todas las operaciones matemáticas que se te ocurran entre ellas
 */
public class Ejecicio02 {
	
	//Método main
	public static void main (String [] args) {
		
		//Variables
		int X = 2;
		int Y = 5;
		double M = 1.5;
		double N = 4.75;
		
		//Operaciones matemáticas
		System.out.println("La suma de " +X+ " + " +Y+ " es igual a " +(X + Y));
		System.out.println("La resta de " +N+ " - " +X+ " es igual a " +(N - X));
		System.out.println("La multiplicación de " +Y+ " * " +M+ " es igual a " +(Y * M));
		System.out.println("La divisón de " +N+ " / " +X+ " es igual a " +(N / X));
		System.out.println("El resto de la multiplicación entre " +Y+ " % " +X+ " es igual a " +(Y % X));

	}

}
