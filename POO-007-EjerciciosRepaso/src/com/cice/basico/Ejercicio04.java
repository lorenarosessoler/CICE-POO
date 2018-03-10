package com.cice.basico;

/*
 * Ejercicio 04:
 * 
 * Crea un programa que realice lo siguiente:
 * - Declara cuatro variables del tipo entero y asignales un valor.
 * - Inmediantamente después haz las operaciones necesarias para que:
 * -- B tome el valor de C
 * -- C el valor de A
 * -- A tome el valor de D
 * -- D tome el valor de B
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		int A = 4;
		int B = 24;
		int C = 3;
		int D = 25;
		
		System.out.println(A); // 4
		System.out.println(B); // 24
		System.out.println(C); // 3
		System.out.println(D); // 25
		
		System.out.println("______________");

		//Queremos:
		// A = 25
		// B = 3
		// C = 4
		// D = 24
		// Creamos una variable auxiliar para solucionarlo
		int auxiliar = 0;
		
		auxiliar = D; // 25
		D = B;	//24
		B = C;	//3
		C = A; //4
		A = auxiliar; //25
		
		System.out.println(A); 
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);


	}

}
