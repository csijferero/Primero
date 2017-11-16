package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class _07 {

	// 7) Leer N números enteros. Debemos mostrarlos en el siguiente orden: el
	// primero, el último, el segundo, el penúltimo, el tercero, etc.

	public static int[] tabla = new int[10];

	public static void main(String[] args) {
		inicializarTabla();
		mostrarTabla();
		ordenarTabla();
		mostrarTabla();
	}

	private static void ordenarTabla() {
		int j = tabla.length - 1;
		int aux = 0;
		for (int i = 0; i < tabla.length / 2; i++) {
			aux = tabla[j];
			tabla[j] = tabla[i];
			tabla[i] = aux;
			j--;
		}
	}

	private static void mostrarTabla() {
		System.out.println("--TABLA--" + Arrays.toString(tabla));
	}

	private static void inicializarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50);
		}
	}
}
