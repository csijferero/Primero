package datos;

import java.util.Scanner;

public class If {
	
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// Pedir dos n�meros y decir cual es el mayor o si son iguales
		
		System.out.println("Escriba el primer n�mero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Escriba el segundo n�mero: ");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("El n�mero " + numero1 + " es mayor que el n�mero " + numero2);
		}
		else if (numero1 < numero2) {
			System.out.println("El n�mero " + numero2 + " es mayor que el n�mero " + numero1);
		}
		else {
			System.out.println("Los dos n�meros son iguales.");
		}
		sc.close();

	}

}
