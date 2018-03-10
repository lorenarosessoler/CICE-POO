package com.cice.principal;

import com.cice.clases.Coche;

public class Principal {
	
	public static void main (String [] args) {
		
		Coche coche1 = new Coche ();
		coche1.pintarInformacion();
		
		
		coche1.setMatricula("BNHJUOA");
		coche1.setModelo("Audi");
		coche1.setPotencia(100);
		coche1.setColor("negro");
		coche1.pintarInformacion();

		
		Coche coche2 = new Coche("JJJJAAA", "Fiat", 200, "Rojo");
		coche2.pintarInformacion();

		
		
	}

}
