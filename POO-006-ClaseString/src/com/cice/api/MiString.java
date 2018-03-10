package com.cice.api;

public class MiString {

	public static void main(String[] args) {
		
		String cadena = "Cadena de caracteres";
		
		//Es capaz de inicializarse sin utilizar un constructor
		String cadena2 = new String ("Cadena de caracteres 2"); 
		
		//Métodos ya definidos dentro de la clase
		
		//.length - Nos devuelve el tamaño del String (número de caracteres)
		int tamaño = cadena.length();
		System.out.println(tamaño);
		
		
		System.out.println("-----------------------------");
		//.charAt(int pos) - Nos devuelve el caracter que hay en una posisción dada
		char posicion = cadena2.charAt(5);
		System.out.println(posicion);
		
		
		System.out.println("-----------------------------");
		//.indexOf(String cadena) - Nos devuelve la posición de ese caracter o cadena.
		//Si no encuentra devuelve -1
		String mail = "lorena.roses@hotmail.com";
		//Comprobamos si el mail contiene la @
		System.out.println(mail.indexOf("@")); //muestra la posisción de la @
		System.out.println(mail.indexOf("+")); //devuelve -1
		
		//.indexOf (String cadena, int pos) - Dada la posisción de inicio buscara desde ahí el caracter dado.
		//Si no encuentra devuelve -1
		System.out.println("La letra a se encuentra: " +mail.indexOf("h", 3)); //Busca el caracter a desde la posición 5
		

		System.out.println("-----------------------------");
		//.lastIndexOf() - Nos indica la última posisción de un caracter  en una cadena
		System.out.println("La letra o se encuentra en la última posición en : " +mail.lastIndexOf("o")); 

		//.lastIndexOf(String cadena, int posicion) - Nos devuelve la última posisición de un caracter dada una posición inicial y el caracter buscado
		System.out.println("La letra e se encuentra en la última posición en : " +mail.lastIndexOf("e", 9)); //recorre la cadena hasta la posicion 9. La posiscion 9 es la última
		
		
		System.out.println("-----------------------------");
		//.substring(int posicion1, int posicion 2) - Nos devuelve un string con el trozo de cadena comprendido entre las posisciones dadas
		System.out.println(mail.substring(7 , 12)); //Nos muestra un trozo del String
		System.out.println(mail.substring(0 , mail.indexOf("@"))); //Nos devuelve todo hasta que encuentra la @


		System.out.println("-----------------------------");
		//.split (String cadena) - Nos devuelve un array con los trozos de cadenas resultantes de usar la cadena String como separador
		String[] arr = cadena2.split(" ");
		//cada palabra esta en una posicion. Ha encontrado el espacio como separador
		for (String s: arr){
			System.out.println(s);
		}
		
		
		System.out.println("-----------------------------");
		//.trim() - Eliminar los espacios en blanco en una cadena de caracteres al inicio y al final
		//Util para formularios
		String nuevaCadena = ("             Esto es una cadena con espacios en blanco               ");
		System.out.println(nuevaCadena);
		System.out.println(nuevaCadena.trim());
		
		
		System.out.println("-----------------------------");
		//.replaceString (String cad1, Sring cad2) - Sustituir un trozo de cadena por otro
		System.out.println(nuevaCadena.replace("a", "o")); //donde hay una a la sustituye una o
		
		
		System.out.println("-----------------------------");
		//.valueOf(tipo primitivo) - Nos devuelve un String
		String valor = String.valueOf(12345);
		System.out.println("valor = " +valor);
		
		
		System.out.println("-----------------------------");
		//PARSEOS
		int numero = Integer.parseInt(valor);
		double decimal = Double.parseDouble("123.32");
		System.out.println(numero);
		System.out.println(decimal);

		 

		


	
	}

}
