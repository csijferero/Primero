package datos;

import java.util.Scanner;

public class TablaPro {

	// Cree una clase que tenga un array de 10 enteros que permita inicializar
	// los valores de
	// los elementos mediante un método “cambiaElemento(posición, nuevoValor)” y
	// calcular
	// la suma de los elementos del array mediante un método “calculaSuma()”.

	private static int[] tabla = new int[10];

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String respuesta = "";
		do {
			int posicion;
			do {
				System.out.println("Escriba la posicion a la que asignar el valor (0-9): ");
				posicion = sc.nextInt();
			} while (posicion < 0 || posicion > 9);

			int nuevoValor;
			
				System.out.println("Escriba el valor: ");
				nuevoValor = sc.nextInt();

			CambiaElemento(posicion, nuevoValor);
			System.out.println("Asignar mas valores y posiciones? (S/N)");
			respuesta = sc.next();
		} while (respuesta.equalsIgnoreCase("S"));

		CalculaSuma();
	}

	public static void CambiaElemento(int posicion, int nuevoValor) {
		tabla[posicion] = nuevoValor;
	}

	public static void CalculaSuma() {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}
		System.out.println("La suma total es: " + suma);
	}

}
