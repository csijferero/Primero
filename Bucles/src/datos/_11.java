package datos;

import java.util.Scanner;

public class _11 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Nº: ");
		int numero = sc.nextInt();
		
		if (numero == sumaDivisores(numero))
			System.out.println(numero + " es perfecto");
		else
			System.out.println(numero + " no es perfecto");
		
		
		sc.close();
	}

	private static int sumaDivisores(int numero) {
		int suma = 0;
		
		for (int i = 1; i <= numero/2; i++) {
			if (numero%i==0)
				suma = suma + i;
		}
		
		return suma;
	}

}