package com.cice.principal;

import java.util.Scanner;

import com.cice.logica.Logica;
import com.cice.persona.Persona;

/*
 * En esta clase programamos el menu, la user interface
 */
public class Principal {

	public static void main(String[] args) {
		
		//Variables a utilizar
		Scanner sc = new Scanner (System.in);
		int opcion;
		
		//Creo una persona a partir de la clase Persona
		Persona usuario = new Persona();
		
		//Menú
		System.out.println("** CALCULADOR IMC **");
		System.out.println("======================");
		System.out.println("");
		System.out.print("Introduce tu Nombre: ");
		usuario.setNombre(sc.nextLine());
		System.out.print("Introduce tus Apellidos: ");
		usuario.setApellidos(sc.nextLine());
		System.out.print("Introduce tu Edad: ");
		usuario.setEdad(sc.nextInt());
		System.out.print("Introduce tu Peso en Kg: ");
		usuario.setPeso(sc.nextDouble());
		System.out.print("Introduce tu Altura en metros: ");
		usuario.setAltura(sc.nextDouble());
		System.out.println("");
		System.out.println("¿Qué quieres hacer " +usuario.getNombre()+ " ?");
		System.out.println("1. Calcular tu IMC");
		System.out.println("0. Salir");
		System.out.print("Tu opcion es: ");
		opcion = sc.nextInt();
		
		if (opcion != 0) {
			//Hago el método estático en la clase lógica porque éste no depende de ninguna variable de esta clase
			Logica.CalcularIMC(usuario);
		} else{
			System.out.print("Hasta Luego!");

		}






	}

}
