package com.cice.fundamentos;

public class BucleForEach {
	public static void main (String [] args) {
		//Creo un array
		String [] guilopes = {"Loles", "Laura", "Tude", "Paula", "Cli", "Lorena", "Bego", "Oli", "ELena"};
		System.out.println("GUILOPES:");
		
		//Cada vuelta que da nombre adquiere un valor de guilopes
		for (String nombre : guilopes) {
			System.out.println(nombre);
		}
	}

}
