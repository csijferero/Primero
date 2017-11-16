package casa;

import java.util.Scanner;

public class Division {
	
//	Crear una clase llamada NumberDivision. Esta clase contendrá un método que aceptará dos Strings, y
//	realizará la división entre estos. Usar el método parseInt() de la clase Integer para transformar de String a
//	int. Si los Strings no son números válidos se genera un NumberFormatException. Esta excepción debe
//	ser capturada y debe ser mostrado un mensaje de error. El segundo número es usado para dividir el primer
//	número. Si el segunda número es cero, una excepción ArithmeticException es lanzada. Esta excepción
//	debe ser atrapada y un mensaje de error debe ser mostrado
	
	private	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Escriba el primer número: ");
		String numero1 = sc.nextLine();
		System.out.println("Escriba el segundo número: ");
		String numero2 = sc.nextLine();
		
		try {
			int numero3 = Integer.parseInt(numero1);
			int numero4 = Integer.parseInt(numero2);
			try {
				System.out.println(numero3/numero4);
			} catch (ArithmeticException e) {
				System.out.println("Segundo número es 0");
				System.out.println("Excepcion: " + e);
			}
		} catch (NumberFormatException e) {
			System.out.println("Formato Incorrecto");
			System.out.println("Excepcion: " + e);
		}
		
		
		sc.close();
	}
}
