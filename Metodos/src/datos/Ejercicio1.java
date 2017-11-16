package datos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	// Dise�ar un m�todo que tenga como par�metros dos n�meros, y que calcule el
	// m�ximo.
	
	private static Scanner sc = new Scanner(System.in);
	
	private static int num1;

	private static int num2;
	
	private static int [] tabla = new int[5];

	public static void main(String[] args) {
//		System.out.println("N� 1: ");
//		num1 = sc.nextInt();
//		
//		System.out.println("N� 2: ");
//		num2 = sc.nextInt();
//		
//		maximoEntreDosNumeros();
		
		// Demostrar como un m�todo puede devolver una tabla
		rellenarTabla();
		mostrarTabla();

		sc.close();
	}
	
	private static void mostrarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i]);
		}
		
	}

	private static void rellenarTabla() {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(50);
		}
	}

	private static void maximoEntreDosNumeros() {
		//int mayor;
		if (num1 >= num2)
			mostrarMayor(num1);
		else
			mostrarMayor(num2);
	}

	private static void mostrarMayor(int numero) {
		System.out.println("El Mayor es: " + numero);		
	}

}