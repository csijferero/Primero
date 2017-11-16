package ejercicios;

import java.util.Scanner;

public class Ejemplo {
	
	private	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] tabla = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor: ");
			tabla[i]=sc.nextInt();
		}
		int aux = 0;
		
		for (int i = 0; i < tabla.length-1; i++) {
		if (tabla[i]>tabla[i+1]) {
			aux = tabla[i];
			tabla[i] = tabla[i+1];
			tabla[i+1] = aux;
		}
		}
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i] + "\t");
		}

	}

}
