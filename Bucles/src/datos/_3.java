package datos;

import java.util.Scanner;

public class _3 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int i = 0;
		int contN = 0;
		for (int cont = 0; cont < 10; cont++) {
			System.out.println("Escriba la  cifra: ");
			i = sc.nextInt();
			if (i < 0)
				contN++;
			if (cont == 9) {
				System.out.println("Se han introducido " + contN + " números negativos.");
			}
		}
	}
}
