package datos;

import java.util.Scanner;

public class Ejercicio01 {

	public static Scanner sc = new Scanner (System.in);
	
	public static void main (String[] args) {
		// Pedir dos números y decir si son iguales o no
		System.out.println("Numero 1: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Numero 2: ");
		int numero2 = sc.nextInt();
		
		if (numero1==numero2) {
			System.out.println("SON IGUALES");
			
		}	else {
			System.out.println("NO SON IGUALES");
		}
		
		if (numero1 > 0) {
			System.out.println("Es Positivo");
		} else if (numero1 < 0) {
			System.out.println("Es negativo");
		} else {
			System.out.println("Es 0");
		}
		
		// Pedir dos numeros y decir si uno es multiplo de otro.
		
		if (numero1%numero2 == 0) {
			System.out.println(numero2 + " es multiplo de " + numero1);
		} else
			System.out.println(numero2 + " no es multiplo de " + numero1);
		
		sc.close();
	}
	
}

		