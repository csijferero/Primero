package datos;

import java.util.Scanner;

public class EjercicioTemperatura {
	
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Diga el número de grados Celsius que desea pasar a Fahrenheits: ");
		double grados = sc.nextDouble();
		double fahrenheits = (grados*1.8) + 32;
		System.out.println("El numero de grados Fahrenheits es: " + fahrenheits);
		
		sc.close();
	}

}
