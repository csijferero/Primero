package datos;

import java.util.Scanner;

public class Casa {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Introduzca un número: ");
		
		int numero = sc.nextInt();
		
		String resultado = String.valueOf(numero);
		
		System.out.println(numero);
	}
}