package ejercicios;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _10 {

	// Queremos desarrollar una aplicación que nos ayude a gestionar las notas
	// de un centro educativo. Cada grupo (o clase) está compuesto por 5
	// alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de
	// un grupo. Debemos mostrar al final: la nota media del grupo en cada
	// trimestre, y la media del alumno que se encuentra en la posición N (N se
	// lee por teclado).

	private static int[][] grupo = new int[5][3];
	private static int suma1 = 0;
	private static int suma2 = 0;
	private static int suma3 = 0;
	private static Scanner sc = new Scanner(System.in);
	private static int aux = 0;
	private static int media = 0;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			grupo[i][0] = new Random().nextInt(11);
			grupo[i][1] = new Random().nextInt(11);
			grupo[i][2] = new Random().nextInt(11);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Alumno numero " + i + Arrays.toString(grupo[i]));	
		}
		for (int i = 0; i < 5; i++) {
			suma1 += grupo[i][0];
			suma2 += grupo[i][1];
			suma3 += grupo[i][2];
		}
		System.out.println("Medía primer trimestre: " + suma1/5);
		System.out.println("Media segundo trimestre: " + suma2/5);
		System.out.println("Media tercer trimestre: " + suma3/5);
		
		do {
			System.out.print("Escriba el alumno del que quiere obtener la media: ");
			aux = sc.nextInt();
		} while (aux <0 || aux>3);
		for (int i = 0; i < 3; i++) {
			media += grupo[aux][i];
		}
		System.out.print("El alumno número " + aux + " tiene de media " + media/3);
	}
}