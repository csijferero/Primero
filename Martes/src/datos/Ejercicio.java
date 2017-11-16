package datos;

import java.util.Scanner;

public class Ejercicio {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		/* pedir el dia, mes y año de una fecha correcta y monstrar la fecha del dia siguiente.
		Suponer que todos los meses tienen 30 dias */

		System.out.println("Escriba el día: ");
		int dia = sc.nextInt();
				
		System.out.println("Escriba el mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Escriba el año: ");
		int anno = sc.nextInt();
		
		if ((dia >=1 && dia<=30) && (mes >= 1 && mes <= 12) && (anno >=0)) {
			System.out.println("La fecha es correcta, siendo el siguiente dia el ");
		if ((dia >=1 && dia <=29)) {
			System.out.println("día " + (dia + 1));
	}	else {
			System.out.println("día " + 1);
	}	if ((mes >= 1 && mes <= 11) && (dia == 30)) {
			System.out.println("del mes " + (mes + 1));
	}	else if ((mes == 12) && (dia == 30)) {
			System.out.println("del mes " + (1));
	}	else {
			System.out.println("del mes " + mes);
	}	if (dia == 30 && mes == 12) {
			System.out.println("del anno " + (anno + 1));
	}	else {
			System.out.println("del anno " + anno);
	}
				sc.close();
	}
		else {
			System.out.println("La fecha es incorrecta.");
			sc.close();
	}
	}
}