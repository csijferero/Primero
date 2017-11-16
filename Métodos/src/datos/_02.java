package datos;

public class _02 {

	static void metodo(int numero1, int numero2) {

		if (numero1 > numero2) {

			System.out.println("El maximo es " + numero1);
		} else {
			System.out.println("El maximo es " + numero2);
		}
	}

	public static void main(String[] args) {
		int primero = 54;
		int segundo = 84;

		metodo(primero, segundo);

	}
}
