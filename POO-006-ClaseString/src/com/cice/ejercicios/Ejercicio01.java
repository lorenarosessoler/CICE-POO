package com.cice.ejercicios;


/*
 * Dado un array de strings, vamos a mostrar por consola la cadena con mayor número de caracteres
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		
		//Variables locales
		int longitud = 0;
		String cadena = "";
		String[] cadenas = {"Bang Bang Lucky Luck", "Esta cadena es mucho más larga que la otra definida"};
		
		for (int i = 0; i < cadenas.length; i++) {
			
			if (cadenas[i].length() > longitud) {
				
				longitud = cadenas[i].length();
				cadena = cadenas[i];
			}
		}
	
		System.out.println("La cadena más larga es: " +cadena+ " y tiene: " +longitud+ " caracteres");

	}

}
