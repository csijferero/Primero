package datos;

import java.util.Scanner;

public class Ejercicio3 {

	// Diseñar un programa que muestre el producto de los 10 primeros numeros
	// impares

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int cont = 1;
		int total = 1;

		for (int num = 1; cont <= 10; num += 2) {
			cont++;
			total = total * num;
		}
		System.out.println("El producto es " + total);
	}
}