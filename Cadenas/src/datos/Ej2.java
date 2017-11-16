package datos;

import java.util.Scanner;

public class Ej2 {

	//Realizar un programa que reciba dos cadenas de caracteres y cuente el número de apariciones de la
	//primera en la segunda. 
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Frase principal: ");
		String frase = sc.nextLine();
		
		System.out.println("Cadena a buscar: ");
		String cadena = sc.next();
		
		System.out.println("Numero de ocurrencias de " + cadena + " en " + frase + ": " + ocurrencia(frase, cadena));
		
		sc.close();
	}

	private static int ocurrencia(String frase, String cadena) {
		int contador = 0;
		
		int pos = frase.indexOf(cadena);
		if (pos!= -1) {
			do {
				contador++;
				pos = frase.indexOf(cadena, pos + cadena.length());
			} while (pos !=-1);
		}
		
		return contador;
	}

}
