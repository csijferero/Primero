package casa;

import java.util.Scanner;

public class Division {
	
//	Crear una clase llamada NumberDivision. Esta clase contendr� un m�todo que aceptar� dos Strings, y
//	realizar� la divisi�n entre estos. Usar el m�todo parseInt() de la clase Integer para transformar de String a
//	int. Si los Strings no son n�meros v�lidos se genera un NumberFormatException. Esta excepci�n debe
//	ser capturada y debe ser mostrado un mensaje de error. El segundo n�mero es usado para dividir el primer
//	n�mero. Si el segunda n�mero es cero, una excepci�n ArithmeticException es lanzada. Esta excepci�n
//	debe ser atrapada y un mensaje de error debe ser mostrado
	
	private	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Escriba el primer n�mero: ");
		String numero1 = sc.nextLine();
		System.out.println("Escriba el segundo n�mero: ");
		String numero2 = sc.nextLine();
		
		try {
			int numero3 = Integer.parseInt(numero1);
			int numero4 = Integer.parseInt(numero2);
			try {
				System.out.println(numero3/numero4);
			} catch (ArithmeticException e) {
				System.out.println("Segundo n�mero es 0");
				System.out.println("Excepcion: " + e);
			}
		} catch (NumberFormatException e) {
			System.out.println("Formato Incorrecto");
			System.out.println("Excepcion: " + e);
		}
		
		
		sc.close();
	}
}
