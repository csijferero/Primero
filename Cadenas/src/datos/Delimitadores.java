package datos;

import java.util.Scanner;

//b) Escriba una aplicación que lea una línea de texto, que divida la línea en tokens
//utilizando caracteres de espacio como delimitadores, y que imprima sólo aquellas palabras
//que comiencen con las letras “ed”. 

public class Delimitadores {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Escribe una frase: ");

		String frase = sc.nextLine();

		String[] tabla = frase.split(" ");

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i].startsWith("ed")) {
				System.out.println(tabla[i]);
			}
		}
	}
}
