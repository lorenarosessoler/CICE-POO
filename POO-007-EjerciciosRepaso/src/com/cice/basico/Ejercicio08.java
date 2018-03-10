package com.cice.basico;

import java.util.Scanner;

/*
 * Ejercicio 08
 * 
 * Crea un programa que realice:
 * - Calcule el área de un triángulo a partir dados sus tres lados
 * -- a = raiz cuadrada [p (p-a) (p-b) (p-c)]
 * -- p = (a + b + c) / 2
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		
		//Variables
		Scanner sc = new Scanner (System.in);
		double a;
		double b;
		double c;
		double p;
		double area;
		int opcion = 0;
		
		do {
			System.out.println("=======================");
			System.out.println("CALCULADORA ÁREA DE UN TRIANGULO");
			System.out.println("=======================");
			System.out.print("Presione 1 para calcular el área de un triángulo o 0 para salir: ");
			opcion = sc.nextInt();
			
			if (opcion != 0) {
				System.out.print("Introduce el valor del Lado a: ");
				a = sc.nextInt();
				System.out.print("Introduce el valor del Lado b: ");
				b = sc.nextInt();
				System.out.print("Introduce el valor del Lado c: ");
				c = sc.nextInt();
				
				p = (a + b + c) / 2;
				area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
				System.out.println("El área del triángulo es igual a " +area);

			} else {
				
				System.out.println("Hasta Pronto!");
			}
			
		} while (opcion != 0);
	}

}
