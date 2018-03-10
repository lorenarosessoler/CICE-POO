package com.cice.fundamentos;

public class Condicionales {
	public static void main  (String [] args) {
		int a = 7;
		int b = 6;
		
		//Condicional IF
		if (a > b) {
			System.out.println("a es mayor que b");
		} else {
			System.out.println("a no es mayor que b");
		}
		
		System.out.println("-------------------------");

		//Doble condicional IF
		if (a <= b) {
			
			if (a < b) {
				System.out.println("a es menor que b");
			} else {
				System.out.println("a es igual que b");
			}
			
		} else {
			System.out.println("a es mayor que b");
		}
		
		System.out.println("-------------------------");

		//Concatenación de condicionales IF
		if (a == b) {
			System.out.println("a es igual que b");
		} else if (a < b) {
			System.out.println("a es menor que b");
		} else {
			System.out.println("a es mayor que b");
		}
		
		System.out.println("-------------------------");

		//Condicional SWITCH--> int, char, String
		switch (a) {
			case 0:
				System.out.println("a es 0");
			case 1:
				System.out.println("a es 1");
			case 2:
				System.out.println("a es 2");
			case 3:
				System.out.println("a es 3");
			case 4:
				System.out.println("a es 4");
			case 5:
				System.out.println("a es 5");
			default:
				System.out.println("a no esta comprendida en 0 y 5");

		}
	}

}
