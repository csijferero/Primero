package ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _11 {
	
	private static Scanner sc = new Scanner(System.in);

	// Construir un programa que declare 2 tablas unidimensionales, una en la
	// que se almacenen nombres de alumnos y en la otra sus notas. Ambas
	// matrices serán de 10 elementos. El propio programa debe inicializar las
	// tablas de nombres y de notas. El programa debe imprimir la lista de
	// nombres con su nota al lado. Después se debe introducir en una nueva
	// tabla llamada alumnosAprobados los alumnos que hayan aprobado e imprimir
	// esta tabla. Además se debe permitir modificar la nota de un alumno
	// solicitado al usuario. Añadir método que devuelva los alumnos que hayan
	// sacado más nota que una nota introducida por teclado.

	private static String[] tablaAlumnos = { "ALonso", "Hamilton", "Rosberg", "Vetel", "Raikkonen", "Massa",
			"Verstappen", "Button", "Bottas", "Grosjean" };
	private static int[] tablaNotas = new int[10];

	public static void main(String[] args) {

		inicializarTablaNotas();
		presentaTablas();
		AlumnosAprobados();
		cambiaNota();
		AlumnosAprobados();
		masNota();
		sc.close();

	}

	private static void masNota() {
		System.out.println("¿Qué nota mínima quiere ver? ");
		int notaMinima = sc.nextInt();
		for (int i = 0; i < tablaAlumnos.length; i++) {
			if (tablaNotas[i] >= notaMinima) {
				System.out.println(tablaAlumnos[i]);
			}
			
		}
	}

	private static void cambiaNota() {
		System.out.println("Introduzca el número del alumno a cambiar la nota: ");
		int alumno = sc.nextInt();
		System.out.println("Introduzca la nueva nota: ");
		tablaNotas[alumno] = sc.nextInt();
		for (int i = 0; i < tablaAlumnos.length; i++) {
			System.out.println(i + " " + tablaAlumnos[i] + "   \t" + tablaNotas[i]);
		}
	}

	private static void AlumnosAprobados() {
		int contador = 0;
		for (int i = 0; i < tablaAlumnos.length; i++) {
			if (tablaNotas[i] >= 5) {
				contador++;
			}
		}
		String[] tablaAprobados = new String[contador];
		contador = 0;
		for (int i = 0; i < tablaNotas.length; i++) {
			if (tablaNotas[i] >= 5) {
				tablaAprobados[contador] = tablaAlumnos[i];
				contador++;
			}
		}
		System.out.println("Han aprobado: " + Arrays.toString(tablaAprobados));
	}

	private static void presentaTablas() {
		for (int i = 0; i < tablaAlumnos.length; i++) {
			System.out.println(i + " " + tablaAlumnos[i] + "   \t" + tablaNotas[i]);
		}
	}

	private static void inicializarTablaNotas() {
		for (int i = 0; i < tablaNotas.length; i++) {
			tablaNotas[i] = new Random().nextInt(11);
		}
	}

}
