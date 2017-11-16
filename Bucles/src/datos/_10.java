package datos;

import java.util.Scanner;

public class _10 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nº 1:");
		int num1 = sc.nextInt();
		
		System.out.println("Nº 2:");
		int num2 = sc.nextInt();
		
		if (sonAmigos(num1, num2))
			System.out.println(num1 + " es amigo de " + num2);
		else
			System.out.println(num1 + " no es amigo de " + num2);
		
		sc.close();
	}

	private static boolean sonAmigos(int num1, int num2) {
		if (sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1)
			return true;
		else
			return false;
	}

	private static int sumaDivisores(int num) {
		int suma = 0; 
		
		for (int i = 1; i < num; i++) {
			if (num%i==0)
				suma += i;
		}
		
		return suma;
	}

}