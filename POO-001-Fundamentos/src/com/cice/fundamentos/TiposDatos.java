package com.cice.fundamentos;

public class TiposDatos {
	
	public static void main (String[] args) {
		
		//DEFINICIÓN DE VARIABLES CON ASIGNACIÓN DE VALORES
		//Se almacenan en la memoria RAM de nuestra computadora
		int entero = 3; // Numeros enteros
		float comaFlotante = 1.5f; // Numeros con coma flotante, siempre con f al final
		double decimal = 3.456; //Numeros decimales
		long enteroGranCapacidad = 56900000; //Numeros enteros de gran capacidad
		char caracter = 'c'; //Caracteres
		boolean booleano = true; //Booleanos - True or False
		
		String cadenaCaracteres = "Esto es una cadena de caracteres";
		
		//Puntero - nombre de la variable (entero, ...)
		//Busca en la memoria RAM el nombre del puntero
		System.out.println(entero);
		System.out.println(comaFlotante);
		System.out.println(decimal);
		System.out.println(enteroGranCapacidad);
		System.out.println(caracter);
		System.out.println(booleano);
		System.out.println(cadenaCaracteres);
		
		System.out.println("-------------------------");

		//OPERACIONES MATEMÁTICAS
		System.out.println(comaFlotante + 1.5f);
		System.out.println(comaFlotante + 0.15f);
		System.out.println(decimal * 5);
		System.out.println(comaFlotante / 1.15f);
		System.out.println(4 % 2); //Resto de una división
		//El Resto es útil para saber si un número es par o impar
		System.out.println(24 % 3); //Número impar
		System.out.println(30 % 2); //Número par
		
		System.out.println("-------------------------");

		//SIGNOS DE COMPARACIÓN
		//Devuelve booleanos
		System.out.println(2 > 6); //false
		System.out.println(2 < 6); //true
		System.out.println(2 == 3); //false
		System.out.println(2 <= 3); //true
		System.out.println(3 >= 6); //false
		System.out.println(2 != 3); //true
		
		System.out.println("-------------------------");

		//CONCATENACIÓN DE DATOS
		System.out.println("El valor de entero es: " + entero + " y el valor decimal es: " + decimal);





		




		

		


	}

}
