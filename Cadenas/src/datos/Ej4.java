package datos;

import java.util.Scanner;

public class Ej4 {

//	Un pal�ndromo es una secuencia de caracteres que se lee igual al derecho y al rev�s. Por ejemplo, cada
//	uno de los siguientes enteros de cinco d�gitos es un pal�ndromo: 12321, 55555, 45554. Escriba una
//	aplicaci�n que lea un entero de cinco d�gitos y determine si es un pal�ndromo. Si el n�mero no es de cinco
//	d�gitos, debe saltar una excepci�n creada. 
	
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
