package com.cice.principal;

import com.cice.clases.Calculadora;
import com.cice.clases.Personaje;

public class Principal {
	
	//Creamos aqui el método Main
	public static void main (String [] args) {
		/*
		//Vamos a crear un personaje (un objeto)
		
		//Constructor de la clase Personaje
		//Personaje es la clase y Protagonista es el objeto
		Personaje protagonista = new Personaje();
		
		//Vamos a ponerle un nombre al personaje
		String nombre = "Brad";
		protagonista.setNombre(nombre);
		
		//Le decimos que hacer al protagonista
		protagonista.saludar();
		protagonista.caminar();
		protagonista.detenerse();
		protagonista.correr();
		protagonista.saltar();
		*/
		
		
		//CALCULADORA
		
		//Creamos el objeto de la Clase Calculadora
		Calculadora calculadora = new Calculadora();
		
		//Todo lo tenemos programado dentro del menú mostrarMenú por eso solo llamos a este método
		//Todos los demás métodos en la calculadora tienen ámbito privado. Este método tiene ámbito público
		calculadora.mostrarMenu();
	}

}
