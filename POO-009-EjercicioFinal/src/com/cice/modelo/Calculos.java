package com.cice.modelo;

public class Calculos {
	
	//VARIABLES LOCALES
	
	//CONSRUCTORES
	
	//MÉTODOS
	
	//Sumar
	public static String sumar (double numA, double numB) {
		String resultado = null;
		double operacion = 0;
		operacion = numA + numB;
		resultado = String.valueOf(operacion);
		return resultado;
	}
		
	//Restar
	public static String restar (double numA, double numB) {
		String resultado = null;
		double operacion = 0;
		operacion = numA - numB;
		resultado = String.valueOf(operacion);
		return resultado;
	}		
		
	//Multiplicar
	public static String multiplicar (double numA, double numB) {
		String resultado = null;
		double operacion = 0;
		operacion = numA * numB;
		resultado = String.valueOf(operacion);
		return resultado;
	}		
		
	//Dividir
	public static String dividir (double numA, double numB) {
		String resultado = null;
		double operacion = 0;
		operacion = numA / numB;
		resultado = String.valueOf(operacion);
		return resultado;
	}
		
}
