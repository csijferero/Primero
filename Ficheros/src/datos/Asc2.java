package datos;

public class Asc2 {

	public static void main(String[] args) {

		char[] tabla = new char[26];

		int contador = 97;
		for (int i = 0; i < tabla.length; i++) { // crea la tabla
			tabla[i] = (char) (contador);
			contador++;
		}

		for (int i = 0; i < tabla.length; i++) { // presenta la tabla
			System.out.println(tabla[i]);
		}

		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == 'a' || tabla[i] == 'e' || tabla[i] == 'i' || tabla[i] == 'o' || tabla[i] == 'u') {
				tabla[i] = '*';
			}
		}

		for (int i = 0; i < tabla.length; i++) { // presenta la tabla
			System.out.println(tabla[i]);
		}
	}
}
