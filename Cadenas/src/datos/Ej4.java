package datos;

import java.util.Scanner;

public class Ej4 {

//	Un palíndromo es una secuencia de caracteres que se lee igual al derecho y al revés. Por ejemplo, cada
//	uno de los siguientes enteros de cinco dígitos es un palíndromo: 12321, 55555, 45554. Escriba una
//	aplicación que lea un entero de cinco dígitos y determine si es un palíndromo. Si el número no es de cinco
//	dígitos, debe saltar una excepción creada. 
	
	private static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		System.out.println("Numero: ");
		int numero = sc.nextInt();
		
		if (espalindromo(numero)) {
			System.out.println(numero + " es palindromo");
		}
		else {
			System.out.println(numero + " no es palindromo");
		}
		
		
		sc.close();
	}

	private static boolean espalindromo(int numero) {
		boolean palindromo = true;
		
		String numcad = String.valueOf(numero);
		
		//V1
		if (!numcad.equals(new StringBuffer(numcad).reverse().toString())) {
			palindromo = false;
		}
		
		//V2
		for (int i = 0; i < numcad.length()/2; i++) {
			if (numcad.charAt(i) != numcad.charAt(numcad.length()-1 - i)) {
				palindromo = false;
			}
		}
		
		return palindromo;
	}

}
