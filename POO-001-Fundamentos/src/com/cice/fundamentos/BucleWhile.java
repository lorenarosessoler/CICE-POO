package com.cice.fundamentos;

public class BucleWhile {
	public static void main (String [] args) {
		
		//while (condición) {ejecutar sentencias}
		int a=1;
		int b=0;
		while (a<b){
			//CUIDADO - bucle infinito
			System.out.println("A es mayor que B");
			
			//Para solucionar este bucle infinito añadiríamos:
			a=b;
		}
	}


}
