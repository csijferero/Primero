package datos;

import java.util.Scanner;

public class If {

	private static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// Un club de baloncesto saca a la venta las entradas para el próximo
		// partido. El precio de las entradas varía dependiendo de la zona del
		// pabellón que el espectador quiere ocupar. El precio de una entrada para
		// la zona de los fondos es de 5 euros. Si un aficionado adquiere más de 7
		// entradas para esta zona obtiene un descuento total del 6%. El precio de
		// una entrada para la zona central es de 12 euros. Si un aficionado
		// adquiere más de 5 entradas para esta zona obtiene un descuento total del
		// 5%. El precio de una entrada para la zona VIP es de 20 euros. Si un
		// aficionado adquiere más de 9 entradas para esta zona obtiene un descuento
		// total del 4%. Diseñe una aplicación que muestre un menú con las tres
		// zonas del pabellón, el usuario debería escoger la zona del pabellón para
		// la que desea adquirir entradas. A continuación la aplicación pedirá al
		// usuario que introduzca el número de entradas que quiere adquirir.
		// Posteriormente el programa mostrará por pantalla el importe en euros que
		// el aficionado debe abonar. Utilice la clase Scanner para leer los datos
		// por teclado y el método printf para mostrar la salida del programa por
		// pantalla
		//Método para mostrar el menu
		/*private static int menu() {
					int opcion = 0; //almacena la opcion del menu seleccionada
					System.out.println("Introduzca el número de la zona para la que quiere comprar las entradas:\n0: Fondos\n1:Central\n2: VIP");
					opcion =sc.nextInt();

					return opcion;*/
		double precioentrada = 0, descuento = 0, preciototal = 0;
		int grada=0, entradas=0;
		do {
			System.out.println("-- MENÚ --");
			System.out.println("1. Fondo");
			System.out.println("2. Central");
			System.out.println("3. VIP");
			System.out.println("Opción: ");
			grada = sc.nextInt();
		} while (grada < 1 || grada > 3);

		do {
			System.out.println("Nº Entradas: ");
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
