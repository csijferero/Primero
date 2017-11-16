package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _06 {

	// 6) Leer por teclado una tabla de 10 elementos num�ricos enteros y una
	// posici�n (entre 0 y 9). Eliminar el elemento situado en la posici�n dada
	// sin dejar huecos.

	private static int[] tabla = new int[10];

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		inicializarTabla();
		mostrarTabla();
		int posicion = -1;
		do {
			System.out.println("Posici�n: ");
			posicion = sc.nextInt();
		} while (posicion < 0 || posicion > 9);
		eliminarElemento(posicion);
		mostrarTabla();
	}

	private static void eliminarElemento(int posicion) {
		for (int i = posicion; i < tabla.length - 1; i++) {
			tabla[i] = tabla[i + 1];
		}
		tabla[tabla.length - 1] = 0;
	}

	private static void mostrarTabla() {
		System.out.println("TABLA: " + Arrays.toString(tabla));
	}

	private static void inicializarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50) + 1;
		}
	}

}