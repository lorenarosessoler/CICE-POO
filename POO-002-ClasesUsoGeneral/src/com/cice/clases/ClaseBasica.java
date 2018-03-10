/*
 * Comentarios
 */
package com.cice.clases;

/**
 * Comentarios JavaDocs
 * @author lorenarosessoler
 *
 */
public class ClaseBasica {
	
	//Dentro de una clase nos podemos encontrar:
	
	//ATRIBUTOS (También conocidos como VARIABLES) - características que van a tener nuestra clases
	String nombre = "Bego";
	float altura = 1.65f;
	int vida = 100;
	
	
	
	//MÉTODOS (También conocidos como FUNCIONES) - funciones que puede realizar nuestra clase
	//La estructura de un método:
	//El ámbito - ej: public, private
	//Tipo de devolución - ej: int, double, ... , void --> no devuelve nada
	//Nombre del método - no puede haber espacios ni caracteres especiales o de puntuación, utilizamos CamelCase
	//Parámetros de entrada - aparecen dentro de paréntesis
	public void andar() { 
		//bloque de código 
	}

	public String saludar() {
		return "Hola Mundo";
	}
}
