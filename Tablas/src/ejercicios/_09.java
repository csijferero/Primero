package ejercicios;

import java.util.Arrays;
import java.util.Random;
public class _09 {

	private static int[] tabla1 = new int[10];

	private static int[] tabla2 = new int[10];

	private static int[] tabla3 = new int[20];

	private static int aux = -255;

	public static void main(String[] args) {
		// Leer dos series de 10 enteros, que estarán ordenados crecientemente.
		// Copiar (fusionar) las dos tablas en una tercera, de forma que sigan
		// ordenados.

		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = new Random().nextInt(50) + 1;
		}
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = new Random().nextInt(50) + 1;
		}
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla2));

		for (int i = 1; i < tabla1.length; i++) {
			for (int j = 0; j < tabla1.length - 1; j++) {
				if (tabla1[j] > tabla1[i]) {
					aux = tabla1[j];
					tabla1[j] = tabla1[i];
					tabla1[i] = aux;
				}
			}
		}
		for (int i = 1; i < tabla2.length; i++) {
			for (int j = 0; j < tabla2.length - 1; j++) {
				if (tabla2[j] > tabla2[i]) {
					aux = tabla2[i];
					tabla2[i] = tabla2[j];
					tabla2[j] = aux;
				}
			}
		}
		for (int i = 0; i < tabla1.length; i++) {
			tabla3[i] = tabla1[i];
			for (int j = 10; j < tabla3.length; j++) {
				tabla3[j] = tabla2[j - 10];
			}
		}
		System.out.println(Arrays.toString(tabla3)); // tabla3 : primera
														// ordenada y luego
														// segunda ordenada

		for (int i = 1; i < tabla3.length; i++) {
			for (int j = 0; j < tabla3.length - 1; j++) {
				if (tabla3[j] > tabla3[i]) {
					aux = tabla3[j];
					tabla3[j] = tabla3[i];
					tabla3[i] = aux;
				}
			}
		}
		System.out.println(Arrays.toString(tabla3));
	}
}