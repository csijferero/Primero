package ejercicios;

import java.util.Scanner;

public class _12 {

	// 12) Se pretende realizar un programa para gestionar la lista de
	// participaciones en una competición de salto de longitud. El número de
	// plazas disponible es 10. Sus datos se irán introduciendo en el mismo
	// orden que vayan inscribiéndose los atletas. Diseñar el programa que
	// muestre las siguientes opciones:
	//
	// 1- Inscribir un participante.
	//
	// 2- Mostrar listado de datos.
	//
	// 3- Mostrar atleta con mejor marca.
	//
	// 4- Finalizar el programa.
	//
	// Si se selecciona 1, se introducirán los datos de uno de los
	// participantes: Nombre, dorsal, mejor marca del 2002, mejor marca del 2001
	// y mejor marca del 2000.
	//
	// Si se elige la opción 2, se debe mostrar un listado por número de dorsal.
	//
	// La opción 3 mostrará el atleta con mejor marca para un año pedido al
	// usuario.
	//
	// Tras procesar cada opción, se debe mostrar de nuevo el menú inicial,
	// hasta que se seleccione la opción 4, que terminará el programa.

private static Scanner sc = new Scanner(System.in);
	
	private static Object[][] atletas = new Object[10][5];
	
	private static int plazas_ocupadas = 0;
	
	public static void main(String[] args) {
		int opcion = 0;
		do {
			opcion = menu();
			switch (opcion) {
			case 1: // Inscribir un participante
				if (plazas_ocupadas < 10) {
					anadirAtleta();
					
					plazas_ocupadas++;
				} else {
					System.out.println("Plazas Completas");
				}
				break;
			case 2:
				listadoAtletas();
				break;
			case 3:
				System.out.println("Año: ");
				int anyo = sc.nextInt();
				int columna = comprobarColumna(anyo);				
				double mejorMarca = buscarMejorMarcaAnyo(columna);
				System.out.println("La mejor marca del " + anyo + " ha sido: " + mejorMarca);				
				break;
			default:
				break;
			}
		} while (opcion != 4);

	}

	private static double buscarMejorMarcaAnyo(int columna) {
		double mejor = Double.MIN_VALUE;
		for (int i = 0; i < plazas_ocupadas; i++) {
			if ((double)atletas[i][columna] > mejor)
				mejor = (double)atletas[i][columna];
		}
		return mejor;
	}

	private static int comprobarColumna(int anyo) {
		int columna = 0;
		switch (anyo) {
		case 2002:
			columna = 2;
			break;
		case 2001:
			columna = 3;
			break;
		case 2000:
			columna = 4;
			break;
		default:
			break;
		}
		return columna;
	}

	private static void listadoAtletas() {
		System.out.println("-- ATLETAS --");
		for (int i = 0; i < plazas_ocupadas; i++) {
			for (int j = 0; j < atletas[i].length; j++) {
				System.out.print(atletas[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void anadirAtleta() {
		System.out.println("Nombre: ");
		atletas[plazas_ocupadas][0] = sc.next();
		System.out.println("Dorsal: ");
		atletas[plazas_ocupadas][1] = sc.nextInt();
		System.out.println("Marca 2002: ");
		atletas[plazas_ocupadas][2] = sc.nextDouble();
		System.out.println("Marca 2001: ");
		atletas[plazas_ocupadas][3] = sc.nextDouble();
		System.out.println("Marca 2000: ");
		atletas[plazas_ocupadas][4] = sc.nextDouble();
	}
	
	private static int menu() {
		int opcion = 0;
		System.out.println("-- MENÚ --");
		System.out.println("1- Inscribir un participante");
		System.out.println("2- Mostrar listado de datos");
		System.out.println("3- Mostrar atleta con mejor marca");
		System.out.println("4- Finalizar el programa");
		opcion = sc.nextInt();
		return opcion;
	}

}