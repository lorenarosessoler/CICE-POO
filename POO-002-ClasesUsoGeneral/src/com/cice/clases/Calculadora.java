package com.cice.clases;

import java.util.Scanner;


public class Calculadora {
	
	//Atributos - características de nuestra Calculadora
	
	//Variables locales - se utilizan localmente en esta clase
	Scanner sc = new Scanner (System.in); 	//Creamos un objeto de la clase Scanner
	int a = 0;
	int b = 0;
	
	//Funciones de nuestra Calculadora
	
	//Método Mostrar Menú
	public void mostrarMenu() {
		//Creamos el menu de la calculadora
		//Variables internas del método - sólo funcionarán aquí dentro
		int opcion = 0;
		
		System.out.println("CALCULADORA ROSES");
		System.out.println("----------------------");
		
		do {
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("======================");
			System.out.println("1 - Suma");
			System.out.println("2 - Resta");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("0 - Salir");
			System.out.println("======================");
			System.out.print("¿Qué operación quieres realizar?: ");
			
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 0:
				salir ();
				break;
			case 1:
				sumar ();
				break;
			case 2:
				restar ();
				break;
			case 3:
				multiplicar ();
				break;
			case 4:
				dividir ();
				break;
			default:
				salir ();
				break;
			}
		
		} while (opcion != 0);
	}
	
	//Introduce los números
	private void introduceNumeros() {
		System.out.print("Introduce el número A: ");
		a = sc.nextInt();
		System.out.print("Introduce el número B: ");
		b = sc.nextInt();
	}

	
	//Método Sumar
	private void sumar() {
		introduceNumeros();
		int suma = a+b;
		System.out.println("La suma de los números A y B es igual: " +suma);	
	}
	
	
	//Método Restar
	private void restar() {
		introduceNumeros();
		int resta = a-b;
		System.out.println("La resta de los números A y B es igual: " +resta);
	}
	
	
	//Método Multiplicar
	private void multiplicar() {
		introduceNumeros();
		int multiplicacion = a*b;
		System.out.println("La multiplicación de los números A y B es igual: " +multiplicacion);
	}
	
	
	//Método Dividir
	private void dividir() {
		introduceNumeros();
		int division = a/b;
		System.out.println("La división de los números A y B es igual: " +division);
	}
	
	
	//Método Salir
	private void salir() {
		System.out.println("Hasta Pronto!");				
	}

}
