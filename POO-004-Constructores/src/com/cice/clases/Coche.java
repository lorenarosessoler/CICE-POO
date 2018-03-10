package com.cice.clases;

public class Coche {
	
	//ATRIBUTOS
	String matricula; 
	String modelo;
	int potencia;
	String color;
	
	//CONSTRUCTORES
	//Contructor por defecto
	public Coche () {
		matricula = "ABCDRE";
		modelo = "Desconocido";
		potencia = 0;
		color = "Desconocido";
	}
	
	//Constructor al cual le paso parámetros inicliazadores
	public Coche (String mat, String mod, int pot, String col) {
		matricula = mat;
		modelo = mod;
		potencia = pot;
		color = col;
	}

	
	//MÉTODOS SET
	public void setMatricula (String mat) {
		matricula = mat;
	}
	
	public void setModelo (String mod) {
		modelo = mod;
	}
	
	public void setPotencia (int pot) {
		potencia = pot;
	}
	
	public void setColor (String col) {
		color = col;
	}

	
	//MÉTODOS
	public void pintarInformacion() {
		System.out.println("=======================");
		System.out.println("INFORMACIÓN DEL COCHE");
		System.out.println("=======================");
		System.out.println("Matrícula: " +matricula);
		System.out.println("Modelo: " +modelo);
		System.out.println("Potencia: " +potencia);
		System.out.println("Color: " +color);		
	}

}
