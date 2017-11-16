package datos;

import java.util.Scanner;

public class EjercicioMedidas {
	
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Diga la medida de la altura del rectángulo en centímetros: ");
		int altura = sc.nextInt();
		System.out.println("Diga la medida de la anchura del rectángulo en centímetros: ");
		int anchura = sc.nextInt();
		System.out.println("La anchura del rectángulo es: " + anchura);
		System.out.println("La altura del rectángulo es: " + altura);
		System.out.println("El área del rectángulo es: " + (anchura * altura));
		System.out.println("El perímetro del rectángulo es: " + ((anchura*2)+(altura*2)));
		
		sc.close();
	}

}
