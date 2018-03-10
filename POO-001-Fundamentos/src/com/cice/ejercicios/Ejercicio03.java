package com.cice.ejercicios;

import java.util.Scanner;

/*
 * EJERCICIO 03
 * Escribir un programa que dado el precio de un producto, calcule el precio aplicando un descuento del 15% (tipo double)
 */
public class Ejercicio03 {
	
	public static void main (String [] args) {
		double precio;
		double precioRebajado;
		double descuento;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EJERCICIO 03");
		System.out.println("============");
		System.out.println("Hemos ido de compras y el jersey que me gusta está rebajado un 15%, ¿Qué me costará?");
		//Introducimos el precio del jersey
		System.out.print("Introduce el precio del jersey: ");
		precio = sc.nextDouble();
		
		//Calculamos el precio rebajado
		descuento = ((15 * precio)/100);
		precioRebajado = precio - descuento;
		
		//Mostramos por panatalla los dos precios
		System.out.println("El precio del jersey es " +precio+ "€");
		System.out.println("El precio rebajado es " +precioRebajado+ "€");
	}

}
