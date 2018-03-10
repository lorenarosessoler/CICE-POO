package com.cice.ejercicios;

/*
 * Dado una cadena vamos a contar el número de vocales que tiene
 */
public class Ejercio02 {
	
	public static void main(String[] args) {
		
		String cadena = "Esto es una cadena de caracteres"; //Tiene 13 vocales
		//Convierte todo a minúsculas
		cadena = cadena.toLowerCase();
		int contador = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			
			switch (cadena.charAt(i)) { //Nos devuelve el caracter que hay en una posisción dada
			//Hace distinción entre mayúsculas y minúsculas y las acentuadas...
			//Aquí sólo tenemos mayúsculas y minúsculas y por eso sólo hemos utilizado el .toLowerCase()
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					contador++; //contador = contador + 1; 
			}
		}
		
		System.out.println("Numero de vocales encontradas: " +contador);
		
	}


}
