package datos;

import java.util.Scanner;

public class _08 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2;

		do {
			System.out.println("Nº 1: ");
			num1 = sc.nextInt();
		} while (num1 <= 0);

		do {
			System.out.println("Nº 2: ");
			num2 = sc.nextInt();
		} while (num2 <= 0);

		int mcd = maximoComunDivisor(num1, num2);

		System.out.println("El MCD de " + num1 + " y " + num2 + " es " + mcd);

		sc.close();
	}

	private static int maximoComunDivisor(int num1, int num2) {
		int mcd = 0;

		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);

		int resto = 0;
		while (min != 0) {
			resto = max % min;
			max = min;
			min = resto;
		}

		mcd = max;

		return mcd;
	}
}
