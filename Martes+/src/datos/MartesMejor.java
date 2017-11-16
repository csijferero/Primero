package datos;

import java.util.Scanner;

public class MartesMejor {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Escriba el día: ");
		int dia = sc.nextInt();

		System.out.println("Escriba el mes: ");
		int mes = sc.nextInt();

		System.out.println("Escriba el año: ");
		int anno = sc.nextInt();

		if (anno >= 0
				&& ((dia <= 31 && dia >= 1)
						&& (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
				|| ((dia <= 30 && dia >= 1) && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
				|| ((dia <= 28 && dia >= 1) && (mes == 2))) {
			System.out.println("La fecha es correcta, siendo mañana:");
			if ((dia <= 30) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
					|| ((dia <= 29) && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
					|| ((dia <= 27) && (mes == 2))) {
				System.out.println("dia " + (dia + 1));
				System.out.println("mes " + mes);
				System.out.println("año " + anno);
			} else if ((dia == 31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)
					|| ((dia == 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
					|| ((dia == 28) && (mes == 2))) {
				System.out.println("día 1");
				System.out.println("mes " + (mes + 1));
				System.out.println("año " + (anno));
			} else {
				System.out.println("día 1");
				System.out.println("mes 1");
				System.out.println("año " + (anno + 1));
			}
		} else
			System.out.println("La fecha es erronea");
	}
}