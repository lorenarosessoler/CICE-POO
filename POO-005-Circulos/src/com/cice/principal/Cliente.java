package com.cice.principal;

import java.util.Scanner;

import com.cice.figuras.Circulo;

/*
 * Esta clase se va a encargar de:
 * Crear el objeto círculo incianizandolo con el radio
 * Pintará por pantalla los resultados del área y del perímetro
 */

public class Cliente {
	
	public static void main (String [] args) {
		
		//Atributos
		Scanner sc = new Scanner(System.in);
		double radio;
		double perimetro;
		double area;
		
		System.out.println("CALCULADORA DE ÁREA Y PERÍMETRO");
		
		do {

			//Menu
			System.out.println("===============================");
			System.out.print("Introduzca el radio del círculo o presione 0 para salir: ");
			radio = sc.nextDouble();
			
			if (radio !=0) {

				//Creamos el Círculo
				Circulo circulo = new Circulo (radio);
				
				//Calculamoe el área y el perímetro
				area = circulo.calcularArea();
				perimetro = circulo.calcularPerimetro();
			
				//Pintar por consola los resultados
				System.out.println("El Área del Círculo es: " +area);
				System.out.println("El Perímetro del Círculo es: " +perimetro);
			}
			
		} while (radio != 0);
		System.out.print("Hasta luego");


	}

}
