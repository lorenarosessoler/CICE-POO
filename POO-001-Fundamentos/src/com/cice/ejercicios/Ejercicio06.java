package com.cice.ejercicios;

/*
 * EJERCICIO 06
 * Crear un array de las notas de un alumno, calcular la media y que pinte un calificación
 * Calificación:
 * 0 - 4.9 --> insuficiente
 * 5 - 5.9 --> suficiente
 * 6 - 6.9 --> bien
 * 7 - 8.9 --> notable
 * 9 - 10 --> sobresaliente
 */
public class Ejercicio06 {
	
	public static void main (String [] args) {
		System.out.println("EJERCICIO 06");
		System.out.println("============");
		
		//Creo array de las notas del alumno y las saco por pantalla
		double [] arrayNotas = {3, 5, 7, 6, 9};
		System.out.println("Las notas del alumno son:" );
		for (double nota : arrayNotas) {
			System.out.println(nota);
		}
		
		double media = 0;
		double sumaNotas = 0;
		for (double nota : arrayNotas) {
			sumaNotas += nota; //Esto es igual a: sumaNotas = sumaNotas + nota;
		}
		media = sumaNotas/arrayNotas.length;
		
		System.out.println("EJEMPLO CON IF:");
		//Vamos a mostrar la calificación utilizando una cadena de IFs
		if (media < 5) {
			System.out.println("Calificación: " +media+ " - INSUFICIENTE. Sigue Estudiando!");
		} else if (5 <= media  && media < 6) {
			System.out.println("Calificación: " +media+  " - SUFICIENTE. Podrías mejor tu calificación.");
		} else if (6 <= media && media < 7) {
			System.out.println("Calificación: " +media+ " - BIEN. No está mal");
		} else if (7 <= media && media < 8) {
			System.out.println("Calificación: " +media+ " - NOTABLE. Te has esforzado bastante!");
		} else {
			System.out.println("Calificación: "+media+ " - SOBRESALIENTE. Brillante!!");
		}
		
		
		System.out.println("EJEMPLO CON SWITCH:");
		//Vamos a hacer lo mismo con un switch
		//Switch solo funciona con datos tipo entero, primero debemos converti el dato double a int utilizando CASTING
		//Casting
		int notaMedia = (int) media;
		//Podems poner en cada caso la nota correspondiente pero podemos abreviarlo con break
		//Por ejemplo del 0 al 4 tendra la misma nota pues lo abreviamos asi:
		switch (notaMedia) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Calificación: " +media+ " - INSUFICIENTE. Sigue Estudiando!");
				break;
			case 5:
				System.out.println("Calificación: " +media+  " - SUFICIENTE. Podrías mejor tu calificación.");
				break;
			case 6:
				System.out.println("Calificación: " +media+ " - BIEN. No está mal");
				break;
			case 7:
			case 8:
				System.out.println("Calificación: " +media+ " - NOTABLE. Te has esforzado bastante!");
				break;
			case 9:
			case 10:
				System.out.println("Calificación: " +media+ " - NOTABLE. Te has esforzado bastante!");
				break;
		}
		
	}
}
