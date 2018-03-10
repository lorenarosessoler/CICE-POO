package com.cice.clases;

public class Personaje {
	
	//Atributos o Variables
	String nombre;
	int vida;
	boolean haceMagia;
	
	//Metodos - Funciones
	public void saludar() {
		System.out.println("Hola! Me llamo " +nombre);
	}
	public void caminar() {
		System.out.println("Estoy caminando...");
	}
	
	public void detenerse() {
		System.out.println("Ok! Me detengo...");
	}
	
	public void correr() {
		System.out.println("Voy corriendo...");
	}

	public void saltar() {
		System.out.println("Que alto salto!");
	}
	
	
	
	//Métodos get/set - ejemplo:
	public void setNombre (String name) {
		nombre = name;
	}


}
