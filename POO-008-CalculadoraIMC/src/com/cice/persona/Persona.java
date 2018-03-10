package com.cice.persona;

/*
 * En esta clase vamos a alamacenar todas los valores relacionados con la Persona
 */
public class Persona {
	
	//Atributos de la persona
	private String nombre;
	private String apellidos;
	private int edad;
	private double altura;
	private double peso;
	
	//Constructores 
	//Constructor sin parámetros inicializados
	public Persona() {
		
	}
	
	//Constructor con parámetros inicializados
	public Persona (String nombre, String apellidos, int edad, double altura, double peso) {
		//this. hace referencia a la propia clase, si va seguido this.atributo 
		//hace referencia a un atributo de la propia clase
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	

	
}
