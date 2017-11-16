package datos;

import java.util.Scanner;

public class _8 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean  creciente = false, decreciente = false;
		int aux = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Nº: ");
			int numero = sc.nextInt();
			if (i == 0) {
				// Primer valor de los 10
				aux = numero;
			} else {
				// Resto de los casos
				if (numero > aux)
					creciente = true;
				else
					decreciente = true;
				aux = numero;
			}
		}
		
		if (creciente && decreciente)
			System.out.println("Desordenados");
		else if (creciente)
			System.out.println("Creciente");
		else
			System.out.println("Decreciente");

	}

}