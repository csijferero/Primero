package datos;

import java.util.Scanner;

public class If {

	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// Un club de baloncesto saca a la venta las entradas para el pr�ximo
		// partido. El precio de las entradas var�a dependiendo de la zona del
		// pabell�n que el espectador quiere ocupar. El precio de una entrada para
		// la zona de los fondos es de 5 euros. Si un aficionado adquiere m�s de 7
		// entradas para esta zona obtiene un descuento total del 6%. El precio de
		// una entrada para la zona central es de 12 euros. Si un aficionado
		// adquiere m�s de 5 entradas para esta zona obtiene un descuento total del
		// 5%. El precio de una entrada para la zona VIP es de 20 euros. Si un
		// aficionado adquiere m�s de 9 entradas para esta zona obtiene un descuento
		// total del 4%. Dise�e una aplicaci�n que muestre un men� con las tres
		// zonas del pabell�n, el usuario deber�a escoger la zona del pabell�n para
		// la que desea adquirir entradas. A continuaci�n la aplicaci�n pedir� al
		// usuario que introduzca el n�mero de entradas que quiere adquirir.
		// Posteriormente el programa mostrar� por pantalla el importe en euros que
		// el aficionado debe abonar. Utilice la clase Scanner para leer los datos
		// por teclado y el m�todo printf para mostrar la salida del programa por
		// pantalla
		//M�todo para mostrar el menu
		/*private static int menu() {
					int opcion = 0; //almacena la opcion del menu seleccionada
					System.out.println("Introduzca el n�mero de la zona para la que quiere comprar las entradas:\n0: Fondos\n1:Central\n2: VIP");
					opcion =sc.nextInt();

					return opcion;*/
		double precioentrada = 0, descuento = 0, preciototal = 0;
		int grada=0, entradas=0;
		do {
			System.out.println("-- MEN� --");
			System.out.println("1. Fondo");
			System.out.println("2. Central");
			System.out.println("3. VIP");
			System.out.println("Opci�n: ");
			grada = sc.nextInt();
		} while (grada < 1 || grada > 3);

		do {
			System.out.println("N� Entradas: ");
			entradas = sc.nextInt();
		} while (entradas <=0);

		switch (grada) {
		case 1: //fondo
			precioentrada = 5;
			if (entradas>7)
				descuento=0.06;
			break;
		case 2: //central
			precioentrada = 12;
			if (entradas>5)
				descuento=0.05;
			break;
		case 3: //VIP
			if (entradas>4)
				descuento=0.04;
			break;
		}
		preciototal = (entradas * precioentrada) - (entradas * precioentrada * descuento);

		System.out.println("Grada: " + grada + "\t" + "Entradas: " + entradas + "\t" + "PrecioFinal:" + preciototal);
	}
}
