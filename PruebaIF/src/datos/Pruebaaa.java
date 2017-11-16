package datos;

import java.util.Scanner;

public class Pruebaaa {
	
	private static Scanner sc = new Scanner (System.in);
		
			public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir dos números y decir si son iguales o no
		System.out.println("Numero 1: ");
		int numero1 = sc.nextInt();
				
		System.out.println("Numero 2: ");
		int numero2 = sc.nextInt();
				
					if (numero1==numero2) {
					System.out.println("SON IGUALES");
				} 	else {
					System.out.println("SON DIFERENTES");
				}	if (numero1 > 0) {
					System.out.println("ES POSITIVO");
				}	else if (numero1 < 0) {
					System.out.println("ES NEGATIVO");
				}	else {
					System.out.println("ES CERO");
				}
					if (numero1 % numero2 == 0) {
					System.out.println("Son multiplos");
				}	else {
					System.out.println("no son multiplos");
				}
					sc.close();
		}
			
	}