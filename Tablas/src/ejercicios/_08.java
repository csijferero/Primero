package ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _08 {

	// 8) Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la
	// tabla.
	// Se debe mostrar la posición en que se encuentra. Si no está, indicarlo
	// con un mensaje.

	private static Scanner sc = new Scanner(System.in);

	public static int[] tabla = new int[10];

	public static void main(String[] args) {
		inicializarTabla();
		mostrarTabla();
		System.out.print("Escribe el número a buscar: ");
		int n = sc.nextInt();
		buscar(n);
	}

	private static void buscar(int n) {
		boolean respuesta = false;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == n) {
				respuesta = true;
				System.out.println("El numero se encuentra en la posición " + i);
			}
		}
		if (respuesta == false) {
			System.out.println("El numero no se encuentra en la tabla");
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
