package com.cice.fundamentos;

public class BucleFor {
	
	public static void main (String [] args) {
		//ELEMPLO 1
		System.out.println("EJEMPLO 1");
		
		//Defino un array
		int [] arrayEnteros = {1, 2, 3, 4, 5};
		
		//Al principio definíamos cada possición del array manualmente
		//System.out.println(arrayEnteros[0]);
		//System.out.println(arrayEnteros[1]);
		//System.out.println(arrayEnteros[2]);
		//System.out.println(arrayEnteros[3]);
		//System.out.println(arrayEnteros[4]);
		
		//Bucle For
		//for (int = 0; i < 10 ; i++) {sentencias de código}
		//for (inicio; una condición; incremento) {sentencias de código}
		//i++ --> i = i + 1
		//Podemos poner en la condición el valor del array o para no equivocarnos utilizar "lenght"
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println("El valor del array en su posición actual es: " +arrayEnteros[i]);
		}
		
		
		System.out.println("===================================================================");
		
		
		System.out.println("EJEMPLO 2");
		//EJEMPLO 2
		//Bucle que del 1 al 100 muestre por pantalla sólo los número pares
		System.out.println("Vamos a mostrar por pantalla sólo los números pares del 1 al 100");
		for (int i = 1; i<=100; i++) {
			//Mientras el resto de un número divisible por 2 sea 0, este número será par
			if (i % 2 == 0) {
				System.out.println(+i);
			}			
		}
	}

}
