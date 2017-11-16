package datos;

import java.util.Scanner;

public class EjercicioMedidas {
	
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Diga la medida de la altura del rect�ngulo en cent�metros: ");
		int altura = sc.nextInt();
		System.out.println("Diga la medida de la anchura del rect�ngulo en cent�metros: ");
		int anchura = sc.nextInt();
		System.out.println("La anchura del rect�ngulo es: " + anchura);
		System.out.println("La altura del rect�ngulo es: " + altura);
		System.out.println("El �rea del rect�ngulo es: " + (anchura * altura));
		System.out.println("El per�metro del rect�ngulo es: " + ((anchura*2)+(altura*2)));
		
		sc.close();
	}

}
