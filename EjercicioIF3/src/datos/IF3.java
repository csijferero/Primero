package datos;

import java.util.Scanner;

public class IF3 {
	
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// Pedir dos n�meros y mostrarlos ordenados de mayor a menor.
		
		System.out.print("Escriba el primer n�mero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Escriba el segundo n�mero: ");
		int numero2 = sc.nextInt();
		
		if (numero1 == numero2){
		System.out.println("El n�mero " + numero1 + " es igual que " + numero2);
	}	else if (numero1 > numero2) {
		System.out.println("El n�mero " + numero1 + " es mayor que el n�mero " + numero2);
	}	else {
		System.out.println("El n�mero " + numero2 + " es mayor que el n�mero " + numero1);
	}	
		sc.close();
	}

}
