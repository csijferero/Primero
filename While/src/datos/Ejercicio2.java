package datos;

import java.util.Scanner;

public class Ejercicio2 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double sumaPositivos = 0, sumaNegativos = 0;
		int numPositivos = 0, numNegativos = 0, numCeros = 0;

		int contador = 0;
		while (contador < 10) {
			System.out.println("Nº " + contador + ": ");
			double numero = sc.nextDouble();

			if (numero > 0) {
				sumaPositivos += numero;
				numPositivos++;
			} else if (numero < 0) {
				sumaNegativos += numero;
				numNegativos++;
			} else {
				numCeros++;
			}

			contador++;
		}

		//MOSTRAR RESULTADOS
		System.out.println("MEDIA POSITIVOS: " + (sumaPositivos/numPositivos));
		System.out.println("MEDIA NEGATIVOS: " + (sumaNegativos/numNegativos));
		System.out.println("NUMERO DE CEROS:  " + numCeros);

		sc.close();
	}

}
