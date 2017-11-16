package datos;

import java.util.Scanner;

public class Ejercicio1 {

	// Solicita numero positivo al usuario
	// Muestra todos los numeros desde el solicitado hasta el 0

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero;
		do {
			System.out.println("Nº: ");
			numero = sc.nextInt();
		} while (numero < 0);

		while (numero >= 0) {
			System.out.println(numero);
			numero--;
		}

		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
		sc.close();
	}

}
