package datos;

import java.util.Scanner;

public class IF4 {

	private static Scanner sc = new Scanner (System.in); 
	
	public static void main(String[] args) {
		// Pedir tres números y mostrarlos ordenados de mayor a menor
		
		System.out.println("Escriba el primer número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Escriba el segundo número: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Escriba el tercer número: ");
		int numero3 = sc.nextInt();
		
		if (numero1 > numero2 && numero2 > numero3){
			System.out.println("El número " + numero1 + " es mayor que el número " + numero2 + " y el numero " + numero3);
		}
		else if (numero1 < numero2 && numero2 < numero3){
			System.out.println("El número " + numero3 + " es mayor que el número " + numero2 + " y el numero " + numero1);
		}
		else if (numero3 > numero1 && numero1 > numero2 )
			System.out.println("El número " + numero3 + " es mayor que el numero " + numero1 + " y el numero " + numero2);
		else
			System.out.println("El número " + numero1 + " es mayor que el numero " + numero3 + " y el numero " + numero2);

		

	}

}
