package datos;

import java.util.Scanner;

public class _5 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int num = 0;
		System.out.println("Escriba la  cifra: ");
		num = sc.nextInt();
		long producto = 1;

		for (int i = num; i > 0; i--) {

			producto = producto * i;

		}
			System.out.println("El factorial es " + producto);
	}
}
