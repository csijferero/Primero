package empresa;

import java.util.Scanner;

public class Nuevo {

	// Usted ha sido contratado por FedEx para crear un programa que calcule el
	// costo de env�o de paquetes. El problema reside en que hay m�ltiples
	// opciones de env�o, es por esto que su programa debe preguntar por las
	// opciones escogidas y de acuerdo a esto calcular el costo. A continuaci�n
	// se detallan los costos junto con el m�todo escogido:
	// Se puede enviar el paquete de dos maneras, por avi�n con costo de 2000� o
	// barco con costo 1000�.
	// En caso de enviarse por barco se puede escoger env�o r�pido con costo
	// �500 o normal con costo 250�.
	// Adem�s se puede contratar un seguro contra p�rdidas, en caso de escogerlo
	// esto suma 1000� al costo.
	// Por �ltimo, existe la terrible posibilidad de pagar impuestos en aduana,
	// el impuesto s�lo se paga si es que se escoge ir en avi�n y el costo es
	// mayor que 3000� o si se escoge ir en barco y el costo es mayor a 1250�.
	// En caso de pagar impuesto el costo aumenta en 100�.

	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		int Precio1=0, Precio2=0, Precio3=0, envio=0, opcion1=0, seguro=0;

		do {
			System.out.println("-- MEN� --");
			System.out.println("1. Avion (2000�)");
			System.out.println("2. Barco (1000�)");
			System.out.println("Opci�n: ");

			opcion1 = sc.nextInt();

		} while (opcion1<1 || opcion1>2);

		if (opcion1==2){
			do {
				System.out.println("-- MEN� --");
				System.out.println("1. Envio R�pido(500�)");
				System.out.println("2. Envio Normal(250�)");
				System.out.println("Opci�n: ");

				envio = sc.nextInt();

			} while (envio<1 || envio>2);}
		
		do {
			System.out.println("-- MEN� --");
			System.out.println("1. Con Seguro(1000�)");
			System.out.println("2. Sin Seguro(0�)");
			System.out.println("Opci�n: ");

			seguro = sc.nextInt();

		} while (seguro<1 || seguro>2);


		switch (opcion1) {       //Switch Transporte
		case 1: Precio1=2000;
		break;
		case 2: {Precio1=1000;

		switch (envio) {		//Switch velocidad barco
		case 1: Precio2 = 500;
		break;
		case 2: Precio2 = 250;
		break;
		}
		}
		}
		switch (seguro) {		//Switch seguro
		case 1: Precio3=1000;
		break;
		case 2: Precio3=0;
		break;
		}
		int PrecioFinal=Precio1 + Precio2 + Precio3;

		if (PrecioFinal>3000 && opcion1 == 1 || PrecioFinal>1250 && opcion1==2)
			PrecioFinal=PrecioFinal+100;

		System.out.println("El precio total son: " + PrecioFinal);
	}

}