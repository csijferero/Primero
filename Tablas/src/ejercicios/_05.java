package ejercicios;

import java.util.Random;

public class _05 {

	// 5) Crear un programa que lea por teclado una tabla de 10 enteros y
	// la desplace una posicion hacia abajo: el primero pasa a ser el segundo,
	// El segundo pasa a ser el tercero y asi sucesivamente. El ultimo pasas
	// a ser el primero
	
	private static int [] tabla = new int[10];

	public static void main(String[] args) {
		inicializarTabla();
		mostrarTabla();
		moverTabla();
		mostrarTabla();
	}

	private static void moverTabla() {
		int ultimo = tabla[tabla.length - 1];
		for (int i = tabla.length - 1; i > 0; i--) {
			tabla[i] = tabla[i-1];
		}
		tabla[0] = ultimo;
	}

	private static void mostrarTabla() {
		System.out.println("-- TABLA --");
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
		System.out.println("\n-----------");
	}

	private static void inicializarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50);
		}
	}

}