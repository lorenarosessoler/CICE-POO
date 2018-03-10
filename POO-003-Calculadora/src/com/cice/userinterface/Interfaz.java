package com.cice.userinterface;

import java.util.Scanner;

import com.cice.logica.Logica;

/*
 * Diseñamos la interfaz gráfica de nuestra aplicación
 */

public class Interfaz {
	
	//ATRIBUTOS
	private Scanner sc = new Scanner (System.in); 	//Creamos un objeto de la clase Scanner
	private int opcion = 0;
	private int numA = 0;
	private int numB = 0;
	private int resultado;
	//private Logica logica = new Logica();

	//MÉTODOS
	
	//Iniciar la calculadora
	public void iniciar() {
		System.out.println("CALCULADORA ROSES");
		System.out.println("----------------------");
		mostrarMenu();
		
	}

	//Mostrar Menu Calculadora
	private void mostrarMenu() {
		System.out.println("MENÚ PRINCIPAL");
		System.out.println("======================");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.println("0 - Salir");
		System.out.println("======================");		
		
		getOpcion();
		
	}
			
	
	//Obtener opciones
	private void getOpcion() {
		do{
			System.out.print("¿Qué operación quieres realizar?: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
				case 0:
					salir();
					break;
				
				case 1:
					getNumeros();
					resultado = Logica.sumar(numA, numB);
					System.out.println("El resultado de la suma es: " +resultado);
					break;
					
				case 2:
					getNumeros();
					resultado = Logica.restar(numA, numB);
					System.out.println("El resultado de la resta es: " +resultado);
					break;
					
				case 3:
					getNumeros();
					resultado = Logica.multiplicar(numA, numB);
					System.out.println("El resultado de la multiplicación es: " +resultado);
					break;
					
				case 4:
					getNumeros();
					resultado = Logica.dividir(numA, numB);
					System.out.println("El resultado de la división es: " +resultado);
					break;
					
				default:
					System.out.println("OPCIÓN INCORRECTA!");
					System.out.println("Seleciona otra opción");
					mostrarMenu();
					break;
			}
			
		} while (opcion != 0);
	}
	
	
	//Obtener los números
	private void getNumeros() {
		System.out.print("Introduce el número A: ");
		numA = sc.nextInt();
		System.out.print("Introduce el número B: ");
		numB = sc.nextInt();
	}
	
	
	//Salir
	public void salir() {
		System.out.println("Gracias por utilizar la Calculadora Roses");				
		System.out.println("Hasta Pronto!");				
	}
	
}
