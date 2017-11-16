package data;

import java.util.Scanner;

public class If {

	private static Scanner sc = new Scanner(System.in);

	// Construir un programa que calcule el índice de masa corporal de una
	// persona
	// (IMC = peso [Kg] / altura2 [m] e indique el estado en el que se encuentra
	// esa persona en función del valor de IMC:
	// <16 Criterio de Ingreso en el hospital
	// de 16 a 17 infrapeso
	// de 17 a 18 bajo peso
	// de 18 a 25 peso normal (saludable)
	// de 25 a 30 sobrepeso (Obesidad de grado I)
	// de 30 a 35 sobrepeso cronico (obesidad de grado II)
	// de 35 a 40 obesidad premórbida (obesidad de grado III)
	// <40 obesidad mórbida (obesidad de grado IV)

	public static void main(String[] args) {
		double peso, altura, IMC, IMCfinal;

		do {System.out.println("Introduzca su peso en kilogramos: ");
		peso = sc.nextDouble();
			if (peso<=0)
			System.out.println("**Ha introducido un valor negativo en el peso**");				
		} while (peso<=0);
		do {System.out.println("Introduzca su altura en metros: ");
		altura = sc.nextDouble();
			if (altura<=0)
			System.out.println("**Ha introducido un valor negativo en la altura**");				
		} while (altura<=0);
		IMC = peso / Math.pow(altura, 2);
		if (IMC < 16)
			System.out.println("Criterio de ingreso en el hospital");
		else if (IMC >= 16 && IMC < 17)
			System.out.println("Infrapeso");
		else if (IMC >= 17 && IMC < 18)
			System.out.println("Bajo peso");
		else if (IMC >= 18 && IMC < 25)
			System.out.println("Peso normal (Saludable)");
		else if (IMC >= 25 && IMC < 30)
			System.out.println("Sobrepeso (Obesidad grado I)");
		else if (IMC >= 30 && IMC < 35)
			System.out.println("Sobrepeso crónico (Obesidad grado II)");
		else if (IMC >= 35 && IMC < 40)
			System.out.println("Sobrepeso premórbido (Obesidad grado III)");
		else{
			System.out.println("Obesidad mórbida (Obesidad grado IV)");}
		
		IMCfinal = Math.round(IMC * 100.0) / 100.0;
		
		System.out.println("Su IMC es de: " + IMCfinal);
	}

}
