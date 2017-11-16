package ejercicios;

import java.util.Scanner;

public class _03 {

	private static Scanner sc = new Scanner(System.in);

	private static int[] tabla = new int[10];

	private static boolean creciente = false;
	private static boolean decreciente = false;
	public static void main(String[] args) {

		// 03) Leer por teclado una serie de 10 n�meros enteros. La aplicaci�n
		// debe
		// indicarnos si los n�meros est�n ordenados de forma creciente,
		// decreciente, o si est�n desordenados.

		for (int i = 0; i < 10; i++) {
			System.out.println("Escriba el numero que ocupar� la posici�n numero " + i);
			tabla[i] = sc.nextInt();
		}

		for (int i = 1; i < 10; i++) {
				if (tabla[i] > tabla[i-1]) {
					creciente = true;
				} else if (tabla[i] < tabla[i-1]) {
					decreciente = true;
				}

			}

		if (creciente == true && decreciente == false) {
			System.out.println("Los numeros est�n ordenador crecientemente");
		} else if (decreciente == true && creciente == false) {
			System.out.println("Los numeros est�n ordenador decrecientemente");
		} else {
			System.out.println("Los numeros est�n desordenados");
		}
	}
}
