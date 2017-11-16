package casa;

import java.util.Scanner;

public class Calculadora {

	// Escribir un programa llamada Calculadora que realice las funciones
	// t�picas de una calculadora. Para ello
	// pedir� al usuario tres valores: operaci�n (+,-,*,/), operando1, operando2
	// y a partir de ellos muestre el
	// resultado de la operaci�n. Cuando el usuario introduzca una Z como valor
	// de la operaci�n el programa
	// parar�, si se introduce cualquier otro car�cter se debe producir una
	// excepci�n definida por el usuario
	// imprimiendo un mensaje de error.
	// Se deber�n intentar utilizar todos los mecanismos de tratamiento de
	// excepciones dados en teor�a

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String signo = "";
		String letra1, letra2;
		int numero1 = 0;
		int numero2 = 0;

		do {

			System.out.println("Introduzca el primer numero: ");
			letra1 = sc.nextLine();
			System.out.println("Introduzca el segundo numero: ");
			letra2 = sc.nextLine();
			System.out.println("Introduzca el signo {+  -  *  /}: ");
			signo = sc.nextLine();

			try {
				numero1 = Integer.parseInt(letra1);
				numero2 = Integer.parseInt(letra2);
				try {
					Signo(signo, numero1, numero2);
				} catch (Exception e) {
					System.out.println("Excepcion: " + e);
				}
			} catch (NumberFormatException e1) {
				System.out.println("Excepcion: " + e1);
			}
			
			

		} while (signo.charAt(0) != 90);
		sc.close();
	}

	private static void Signo(String signo, int numero1, int numero2) throws Exception {
		if (signo.charAt(0) == 92) {
			System.out.println(numero1 / numero2);
		} else if (signo.charAt(0) == 42) {
			System.out.println(numero1 * numero2);
		} else if (signo.charAt(0) == 43) {
			System.out.println(numero1 + numero2);
		} else if (signo.charAt(0) == 45) {
			System.out.println(numero1 - numero2);
		} else if (signo.charAt(0) == 90) {
			System.out.println("Saliendo");
		} else {
			throw new ExcepcionModificada("Error N�mero", 1);
		}
		
	} 
}
