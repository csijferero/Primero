package ejercicios;

import java.util.Scanner;

public class _03 {

	private static Scanner sc = new Scanner(System.in);

	private static int[] tabla = new int[10];

	private static boolean creciente = false;
	private static boolean decreciente = false;
	public static void main(String[] args) {

		// 03) Leer por teclado una serie de 10 números enteros. La aplicación
		// debe
		// indicarnos si los números están ordenados de forma creciente,
		// decreciente, o si están desordenados.

		for (int i = 0; i < 10; i++) {
			System.out.println("Escriba el numero que ocupará la posición numero " + i);
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
			System.out.println("Los numeros están ordenador crecientemente");
		} else if (decreciente == true && creciente == false) {
			System.out.println("Los numeros están ordenador decrecientemente");
		} else {
			System.out.println("Los numeros están desordenados");
		}
	}
}
