package com.cice.ejercicios;

import java.util.Scanner;

/*
 * EJERCICIO 02
 * Escribir un programa que escriba en la pantalla tu nombre completo en una línea y en la siguiente línea tu fecha de nacimiento
 */
public class Ejercicio02 {
	
	public static void main (String [] args) {
		String nombre;
		String fecha;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("EJERCICIO 02");
		System.out.println("============");
		System.out.print("Introduzca su Nombre completo: ");
		nombre = sc.nextLine();
		
		System.out.print("Introduzca ahora su Fecha de Nacimiento: ");
		fecha = sc.nextLine();
		
		System.out.println("Su Nombre es: " +nombre);
		System.out.println("Su Fecha de Nacimiento es: " +fecha);
	}
}
