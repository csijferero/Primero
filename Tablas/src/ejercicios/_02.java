package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class _02 {

	// 2) Leer por teclado dos tablas de 10 numeros enteros y mezclarlos en una
	// tercera de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc

	private static int[] tabla = new int[20];
	private static int[] tabla1 = new int[10];
	private static int[] tabla2 = new int[10];

	public static void main(String[] args) {
		rellenarTablas();
		mostrarTablas();
		mezclarTablas();
		mostrarTablas();
	}

	private static void mezclarTablas() {
		int j = 0;
		for (int i = 0; i < tabla1.length; i++) {
			tabla[j] = tabla1[i];
			j++;
			tabla[j] = tabla2[i];
			j++;
		}
	}

	private static void mostrarTablas() {
		System.out.println("TABLA: " + Arrays.toString(tabla));
		System.out.println("TABLA1: " + Arrays.toString(tabla1));
		System.out.println("TABLA2: " + Arrays.toString(tabla2));

	}

	private static void rellenarTablas() {
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = new Random().nextInt(50);
			tabla2[i] = new Random().nextInt(50);
		}
	}
}
