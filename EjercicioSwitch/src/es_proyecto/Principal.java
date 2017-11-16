package es_proyecto;

import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner (System.in);

	//Pedir dia mes y año
	//Indicar si la fecha es correcta con meses de 20 30 31.
	//Comprobar si es Bisisesto.

	public static void main(String[] args) {
		System.out.println("Año: ");
		int anyo =sc.nextInt();

		//Compruebo si el año es bisiesto
		boolean esBisiesto = false;
		if (anyo %4 ==0 && (anyo % 100 !=100 || anyo %400 ==0)) { 
			esBisiesto = true;
		}
		System.out.println("Mes: ");
		int mes= sc.nextInt();

		//Variable para comprobar la fecha
		boolean fechacorrecta = false;

		if (mes>=1 && mes <=12){
			System.out.println("Día: ");
			int dia = sc.nextInt();
			switch (mes) {
			case 2:
				if (dia>=1 && dia <=29 && esBisiesto){
					fechacorrecta = true;
				} else if (dia>=1 && dia<=28 && !esBisiesto){
					fechacorrecta = true;
				}
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if (dia >= 1 && dia <= 31) {
					fechacorrecta=true;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (dia>=1 && dia<=30){
					fechacorrecta=true;
				}
				break;
			default:
				break;
			}
			if (fechacorrecta){
				System.out.println("Fecha Correcta: " + dia + "/" + mes + "/" + anyo);
			} else {
				System.out.println("Fecha Incorrecta: " + dia + "/" + mes + "/" + anyo);			
			}
		} else {System.out.println("Error Mes");
		}
	}
}
