package datos;

import java.util.Scanner;

public class _2 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i=0, total=0;
		for (int cont = 0; cont < 15; cont++) {
			System.out.println("Escriba la  cifra: ");
			i = sc.nextInt();
			total=total+i;
		}
		System.out.println(total);
	}
}