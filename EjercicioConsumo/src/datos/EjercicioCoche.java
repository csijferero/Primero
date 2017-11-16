package datos;

import java.util.Scanner;

public class EjercicioCoche {
	
	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		System.out.println("Introduzca el precio del litro de combustible durante su primer repostaje: ");
		double precio = sc.nextDouble();
		System.out.println("Introduzca la cantidad total que ha pagado en su gasolinera la primera vez que repostó: ");
		double euros = sc.nextDouble();
		System.out.println("Introduzca el numero de kilómetros que marcaba su cientakilometros en ese momento: ");
		double kilometros = sc.nextDouble();
		
		
		System.out.println("Introduzca el precio del litro de combustible durante su segundo repostaje: ");
		double precio2 = sc.nextDouble();
		System.out.println("Introduzca la cantidad total que ha pagado en su gasolinera la segunda vez que repostó: ");
		double euros2 = sc.nextDouble();
		
		
		System.out.println("Introduzca el numero de kilómetros que marcaba su cientakilometros en ese momento: ");
		double kilometros3 = sc.nextDouble();
		
		
		double recorrido13 = (kilometros3 - kilometros);
		double introducido = (euros / precio);
		double introducido2 = (euros2 / precio2);
		double introducidototal = introducido + introducido2;
		double litrosPorKilometro = (introducidototal / recorrido13);
		double consumo = litrosPorKilometro * 100;

		
		System.out.println("El consumo cada 100 kilómetros es: " + consumo);
		
		sc.close();
	}

}
