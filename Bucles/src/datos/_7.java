package datos;

import java.util.Scanner;

public class _7 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Escriba el número: ");
		int num = sc.nextInt();
		int contador = 0;
		int primo = 2;
		for (int i = 1; i < num; i++) {
			
			if (primo % i!=0) {
				
				primo++;
			}
				else{
					
					contador ++;
					primo++;
				
			}

		}

		System.out.println("Hay " + contador + " primos entre 1 y " + num);

	}
}
