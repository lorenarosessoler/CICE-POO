package com.cice.logica;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cice.vistas.Principal;

/*
 * Aquí vamos a crear toda la lógica de la calculadora
 */

public class Logica {

	//Variables locales
	private String numeroPantalla = "";
	private double primerNumerando;
	private double segundoNumerando;
	private boolean esPrimerNumeroPulsado;
	private boolean esPrimerNumeroIntroducido;
	private Principal principal;
	private JLabel txtPantalla = new JLabel();

	
	//CONSTRUCTORES
	public Logica (Principal principal) {
		this.principal = principal;
		
	}
	
	
	//MÉTODOS
	
	//Analiza que boton se ha pulsado para realizar una acción
	//Esa acción será concatenar el número a la pantalla
	public void analizarBotonPulsado(JPanel botonPulsado) {
		String aux = botonPulsado.getName();
		numeroPantalla += aux;
		txtPantalla.setText(numeroPantalla);
	}

	//Comprobará la operación solicita y llamará al método de cálculo correspondiente
	public void seleccionarCalculo () {
		
	}
	
}
