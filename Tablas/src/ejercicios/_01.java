package ejercicios;

import java.util.Scanner;

public class _01 {

	private static Scanner sc = new Scanner(System.in);

	private static int[] tabla = new int[10];

	public static void main(String[] args) {
		// Leer 10 números por teclado y a continuación realizar la media de los
		// números positivos, la media de los negativos y contar el número de
		// ceros.

		for (int i = 0; i < 10; i++) {
			System.out.println("Escriba el numero que ocupará la posición numero " + i);
			tabla[i] = sc.nextInt();
		}

		int pos = 0;
		int contpos = 0;
		int neg = 0;
		int contneg = 0;
		int contcero = 0;
		for (int i = 0; i < 10; i++) {
			if (tabla[i] > 0) {
				pos += tabla[i];
				contpos++;
			} else if (tabla[i] < 0) {
				neg += tabla[i];
				contneg++;
			} else {
				contcero++;
			}
		}
		if (contpos > 0) {
			System.out.println("La media de positivos es: " + pos / contpos);
		}
		if (contneg > 0) {
			System.out.println("La media de negativos es: " + neg / contneg);
		}
		if (contcero > 0) {
			System.out.println("Se han escrito " + contcero + " ceros");
		}
	}
}
