package com.cice.logica;

import com.cice.persona.Persona;

public class Logica {
	
	//Método Calcular IMC y le paso una persona
	static public void CalcularIMC(Persona persona) {
		
		//Recuperar el peso y la altura y haver el cálculo del IMC
		double pesoPersona = persona.getPeso();
		double alturaPersona= persona.getAltura();
		
		//Fórmula: peso(Kg) / altura(m)^2 nos da un índoce
		double imc = pesoPersona / (alturaPersona * alturaPersona);
		
		//Rangos del índice:
		//< 16 - bajo peso severo
		//16 < i < 18,5 - bajo peso
		//18,5 < i < 25 - normal
		//25 < i < 30 - Sobrepeso
		//> 30 - Obesidad
		
		//swith no funciona con un double, utilizamos if & else if
		
		if (imc < 16) {
			System.out.println("Tu IMC es de: " +imc+ ". Obteniendo un rango de: DESNUTRICIÓN.");
		} else if  (imc > 16 && imc < 18.5) {
			System.out.println("Tu IMC es de: " +imc+ ". Obteniendo un rango de: BAJO PESO.");
		} else if  (imc > 18.5 && imc < 25) {
			System.out.println("Tu IMC es de: " +imc+ ". Obteniendo un rango de: NORMAL");
		} else if  (imc > 25 && imc < 30) {
			System.out.println("Tu IMC es de: " +imc+ ". Obteniendo un rango de: SOBREPESO");
		} else if  (imc > 30) {
			System.out.println("Tu IMC es de: " +imc+ ". Obteniendo un rango de: OBESIDAD");
		}
	}
}
