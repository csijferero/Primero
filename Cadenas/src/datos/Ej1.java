package datos;

import java.util.Scanner;

public class Ej1 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("CADENA: ");
		String cadena = sc.next();

		// Mayuscula
		System.out.println(cadena.toUpperCase());

		// Minuscula
		System.out.println(cadena.toLowerCase());

		// 2 primeros caracteres y 2 ultimos
		if (cadena.length() >= 2) {
			System.out.println(cadena.substring(0, 2));
			System.out.println(cadena.substring(cadena.length() - 2));
		}

		// Repeticiones del ultimo caracter
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == cadena.charAt(cadena.length() - 1)) {
				contador++;
			}
		}
		System.out.println("Nº de ocurrencias del carácter " + cadena.charAt(cadena.length() - 1) + ": " + contador);

		// Todas las ocurrencias del primer caracter en mayuscula
		System.out.println(cadena.replaceAll(cadena.substring(0, 1), cadena.substring(0, 1).toUpperCase()));

		StringBuffer cad = new StringBuffer(cadena);

		// ***por delante y por detras
		cad.insert(0, "***");
		cad.append("***");
		System.out.println(cad);

		// Invertida
		System.out.println(cad.reverse());

		sc.close();
	}
}
