package datos;

import java.util.Scanner;

public class If {
	
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// Pedir dos números y decir cual es el mayor o si son iguales
		
		System.out.println("Escriba el primer número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Escriba el segundo número: ");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("El número " + numero1 + " es mayor que el número " + numero2);
		}
		else if (numero1 < numero2) {
			System.out.println("El número " + numero2 + " es mayor que el número " + numero1);
		}
		else {
			System.out.println("Los dos números son iguales.");
		}
		sc.close();

	}

}
