package com.cice.figuras;

/*
 * Esta clase definirá las operaciones sobre un círculo. 
 * Recibirá un argumento de entrada que será el radio y calculará el área y el perímetro
 * 
 *  Atributos Locales:
 *  Radio
 *  Área
 *  Perímetro
 *  
 *  Métodos:
 *  Calcular Area 
 *  Calcular Perímetro
 *  
 *  Fórmulas:
 *  Área: pi*radio^2
 *  Perímetro: 2*pi*radio
 */

public class Circulo {
	
	//ATRIBUTROS
	private double radio;
	private double area;
	private double perimetro;
	
	
	//Constructor que inicialice la variable radio
	public Circulo (double rad) {
		radio = rad;
	}
	
	
	//MÉTODOS
	public double calcularArea() {
		area = 0;
		area = Math.PI * radio * radio;
		return area;	
	}
	
	public double calcularPerimetro() {
		perimetro = 0;
		perimetro = 2 * Math.PI * radio;
		return perimetro;
	}
	

}
