package datos;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Objetos o1 = new Objetos("Mascotazo");
		
		int menu = 0;
		
		do {
			
		
		
		do {
			System.out.println("Menu:");
			System.out.println("1) Comer");
			System.out.println("2) Dormir");
			System.out.println("3) Jugar");
			System.out.println("4) Asear");
			System.out.println("5) Estudiar");
			System.out.println("6) Salir");
			System.out.println("Elija una opción: ");
			menu = sc.nextInt();
		} while (menu<=0 && menu>=7);
		
		switch (menu) {
		case 1:
			o1.comer();
			break;

		case 2:
			o1.dormir();
			break;
			
		case 3:
			o1.jugar();
			break;
	
		case 4:
			o1.asear();
			break;
	
		case 5:
			o1.estudiar();
			break;
		default:
			break;
		}
		
		System.out.println(o1);
		
		} while (menu!=6);

	}

}
