package datos;

import java.util.Random;
import java.util.Scanner;

public class Primero {

	private static Scanner sc = new Scanner(System.in);

	private static int[] tabla = new int[5];

	public static void main(String[] args) {
		String respuesta;
		do {
			System.out.print("Quieres Repetir? [s/n]");
			respuesta = sc.nextLine();
		} while (respuesta == "s");
	}

	private static void ordenarTabla() {
		// M�todo de ordenaci�n por intercambio
		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = i + 1; j < tabla.length; j++) {
				if (tabla[i] > tabla[j]) {
					// Intercambiamos los valores
					int aux = tabla[i];
					tabla[i] = tabla[j];
					tabla[j] = aux;
				}
			}
		}
	}

	private static void mostrarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
		System.out.println();
	}

	private static void rellenarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50);
		}
	}
}