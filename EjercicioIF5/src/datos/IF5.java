package datos;

import java.util.Scanner;

public class IF5 {

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		/* Pedir el dia, mes y a�o de una fecha e indicar si la fecha es correcta.
		 Con meses de 28, 30 y 31 dias. sin a�os bisiestos.*/
		
		System.out.println("Escriba el d�a: ");
		int dia = sc.nextInt();
				
		System.out.println("Escriba el mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Escriba el a�o: ");
		int a�o = sc.nextInt();
		
		if ((dia >=1 && dia<=31) && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (a�o>0)) {
			System.out.println("La fecha es correcta");
	}	else if ((dia >=1 && dia<=30) && (mes==4 || mes==6 || mes==9 || mes==11) && (a�o>0)) {
			System.out.println("La fecha es correcta");
	}	else if ((dia >=1 && dia<=28) && (mes==2) && (a�o>0)) {
		System.out.println("La fecha es correcta");
	}	else {
			System.out.println("La fecha es incorrecta");
	}
			sc.close();
	}

}
