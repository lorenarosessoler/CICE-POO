package com.cice.fundamentos;

public class Array {
	
	public static void main  (String [] args) {
		
		//ARRAYS DE UNA DIMENSIÓN
		//Es un objeto java que permite almacenar en su interior varios datos del mismo tipo
		int [] arrayEnteros = {1, 2, 3, 4, 5};

		System.out.println("El valor de la posición 0 debe ser 1 y el valor recogido es: " + arrayEnteros [0]);
		System.out.println(arrayEnteros [4]); //Debe ser 5
		
		//Definimos un array con 7 espacios
		String [] arrayString = new String [7]; //Posiciones de 0 a 6
		arrayString [0] = "Lunes";
		arrayString [1] = "Martes";
		arrayString [2] = "Miércoles";
		arrayString [3] = "Jueves";
		arrayString [4] = "Viernes";
		arrayString [5] = "Sábado";
		arrayString [6] = "Domingo";
		
		System.out.println(arrayString [2]); //Debe ser miércoles
		
		//El array [] se puede indicar en el tipo de datos o en el nombre
		//String [] arrayString = new String [7];
		//String array2[] = new String [2];
		
		
		//ARRAYS DE DOS DIMENSIONES --> MATRICES --> CAJA DE CAJAS, una caja es un array
		int [] [] array2D = new int [2] [5]; //Array de dos dimensiones
		
		//Para acceder a la primera posición de la primera caja/array, accedo mediante la posición [0]
		
		//Para almacenar un número requiero el número de caja y su posición [0] [x]
		array2D [0] [0] = 0;
		array2D [0] [1] = 1;
		array2D [0] [2] = 2;
		array2D [0] [3] = 3;
		array2D [0] [4] = 4;
		
		array2D [1] [0] = 5;
		array2D [1] [1] = 6;
		array2D [1] [2] = 7;
		array2D [1] [3] = 8;
		array2D [1] [4] = 9;
		
		System.out.println(array2D [0][4]); // Saca 4 por pantalla
		System.out.println("-------------------------");
		System.out.println(array2D [1] [1]); // Saca 6 por pantalla


	}
	

}
