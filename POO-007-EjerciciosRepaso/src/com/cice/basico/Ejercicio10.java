package com.cice.basico;

import java.util.Scanner;

/*
 * Ejercicio 10
 * 
 * Dada la fecha de nacimiento de una persona, calcula su numero de la suerte
 * Ejemplo: 12/07/1958 --> 12 + 7 +1958 = 1999 --> 1 + 9 + 9 + 9
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String cumple;
		int suerte = 0;
		int resultado = 0;
		
		System.out.print("Introduce su fecha de nacimiento, por ejemplo 26/10/1985: ");
		cumple = sc.nextLine();
		
		//Creo un array y guarda los datos por separado cuando encuentra el separador
		String[] datos = cumple.split("/");
		
		//Recorremos el array y guardamos en suerte todos los valores en uno
		for (String dato : datos) {
			suerte += Integer.parseInt(dato);
		}
	
		//Volver a convertir el numero suerte a un string
		String aux = String.valueOf(suerte);
		
		for (int i = 0; i < aux.length(); i++) {
			String ch = String.valueOf(aux.charAt(i));
			resultado += Integer.parseInt(ch);
		}
		System.out.print("Tu número de la suerte es: " +resultado);

	}

}
