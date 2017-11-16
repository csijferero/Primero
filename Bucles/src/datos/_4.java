package datos;

import java.util.Scanner;

public class _4 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numero = 0, total = 0;

		System.out.println("Escriba la  cifra: ");
		numero = sc.nextInt();

		for (int i = 0; i < 100; i++) {
			numero++;
			total = total + numero;

		}
		System.out.println("El resultado de la suma de los 100 numeros siguientes es " + total);

	}

}
