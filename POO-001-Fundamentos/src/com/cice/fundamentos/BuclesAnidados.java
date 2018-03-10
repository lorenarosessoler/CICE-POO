package com.cice.fundamentos;

public class BuclesAnidados {
	public static void main (String [] args) {
		//Un for dentro de un for
		
		//EJEMPLO 1 - TABLAS DE MULTIPLICAR
		System.out.println("EJEMPLO 1 - TABLAS DE MULTIPLICAR");

		//Utilizamos la variable i para definir cual sera la tabla que vamos a calcular (ej: la tabla del 1, la del 2, ...)
		for (int i = 1; i <= 10; i++) {
			
			//Utilizamos la variable j para definir la variable por la que multiplicamos cada vez
			for (int j = 1; j <= 10; j++) {
				int resultado = (i * j); 
				System.out.println(+i+ " x " +j+ " = " +resultado);
			}
			//Separador de tablas
			System.out.println("---------------");
		}
		
		
		
		//EJEMPLO 2 - ARRAYS BIDIMENSIONALES CON BUCLES ANIDADOS
		System.out.println("==========================");
		System.out.println("EJEMPLO 2 - ARRAYS BIDIMENSIONALES CON BUCLES ANIDADOS");
		
		//Array Bidimensional de dos alumnos con cuatro datos cada uno
		String [][] alumnos = new String [2][4];
		alumnos [0][0] = "12345A";
		alumnos [0][1] = "Lorena";
		alumnos [0][2] = "Roses";
		alumnos [0][3] = "Java";

		alumnos [1][0] = "98765B";
		alumnos [1][1] = "Maria";
		alumnos [1][2] = "Oliver";
		alumnos [1][3] = "Finanzas";
		
		//Utilizamos la variable i para ver cuantos alumnos -- recorrela primer caja
		for (int i = 0; i < alumnos.length; i++) {
			
			//Por cada alumno recorremos sus datos
			System.out.println("---------");
			System.out.println("ALUMNO: ");
			System.out.println("---------");
			
			//Utilizamos la variable j para recorrer la segunda caja, los 4 datos de cada alumno
			for (int j = 0; j < alumnos[i].length; j++) {
				System.out.println(alumnos [i][j]);
			}
		}
		
		
		//EJEMPLO 3 - ARRAYS BIDIMENSIONALES CON FOR EACH
		System.out.println("==========================");
		System.out.println("EJEMPLO 3 - ARRAYS BIDIMENSIONALES CON FOR EACH");
		
		for (String [] alumno : alumnos) {
			System.out.println("---------");
			System.out.println("ALUMNO: ");
			System.out.println("---------");
			
			for (String datos : alumno) {
				System.out.println(datos);
			}
		}
	}


}
