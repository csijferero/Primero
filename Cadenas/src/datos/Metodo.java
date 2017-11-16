package datos;

import java.util.Scanner;

public class Metodo {

	// Haciendo uso de la clase String hacer los siguientes ejercicios:
	// 1. Escribir un programa que emplee el método regionMatches() de la clase
	// String para comparar dos
	// cadenas introducidas por el usuario. El programa deberá solicitar el
	// número de caracteres que se
	// van a comparar y el índice inicial de la comparación. El programa deberá
	// indicar si la primera
	// cadena es mayor, igual o menor que la segunda. No se tienen en cuenta
	// mayúsculas y minúsculas.
	// 2. Escribir un programa que solicite una cadena y una letra y nos
	// devuelva las posiciones que ocupa
	// esa letra en la cadena.
	// 3. Escribir un programa que nos diga cuantas veces se repiten las vocales
	// dentro de una cadena que
	// el usuario introduce por teclado.
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Escibre la primera cadena: ");
		
		String cadena1 = sc.nextLine();
		
		cadena1 = cadena1.toLowerCase();
		
		System.out.println("Escibre la segunda cadena: ");
		
		String cadena2 = sc.nextLine();
		
		cadena2 = cadena2.toLowerCase();
//		
//		System.out.println("Número de caracteres a comparar: ");
//		
//		int num = sc.nextInt();
//		
//		System.out.println("Indice inicial de la comparacion de la primera cadena: ");
//		
//		int indice1 = sc.nextInt();
//		
//		System.out.println("Indice inicial de la comparacion de la segunda cadena: ");
//		
//		int indice2 = sc.nextInt();
//
//		
//		System.out.println(cadena1.regionMatches(indice1, cadena2, indice2, num));
		
		if (cadena1.length()>cadena2.length()) {
			System.out.println("Cadena1 es mayor que Cadena2");
		} else if (cadena1.length()<cadena2.length()) {
			System.out.println("Cadena1 es menor que Cadena2");

		} else {
			System.out.println("Las dos cadenas son iguales");
		}
		
		System.out.println(cadena1.indexOf("a"));
		
		
		
		

		
	}

}
