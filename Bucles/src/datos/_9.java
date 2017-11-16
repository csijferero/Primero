package datos;

import java.util.Scanner;

public class _9 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Esciba un número: ");
		int num = sc.nextInt();
		int total = 0;
		int contador = 0;

		for (int i = 1; contador < num; i += 2) {

			total = total + i;

		}

		System.out.println("Su cuadrado es: " + total);

	}

}