package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Dada una palabra, diremos que está “escondida” en un texto si está contenida en éste, no necesariamente
//de forma continua. Por ejemplo, la palabra “ana” está escondida en la frase “Juan estaba mirando por la
//ventana”. El algoritmo tal que, dada una palabra leída por teclado, la busque en un texto almacenado en un
//fichero de texto. Como resultado el algoritmo deberá presentar el mensaje:
//Palabra <palabra> no encontrada en el texto.
//O bien
//Palabra <palabra> encontrada escondida entre los <p> primeros caracteres del texto.
//En el ejemplo el resultado debería ser:
//Palabra ana encontrada escondida entre los 34 primeros caracteres del texto. 

public class Tratamiento {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Palabra: ");
		String palabra = sc.next();

		File fichero = new File("ficheroEnt.txt");
		if (fichero.exists()) {
			FileReader fr = null;
			BufferedReader br = null;

			try {
				fr = new FileReader(fichero);
				br = new BufferedReader(fr);

				String linea;
				int pos = 0, numCarac = 0;
				while ((linea = br.readLine()) != null) {
					pos = linea.indexOf(palabra);
					System.out.println(linea);
					if (pos != -1) {
						numCarac += pos + palabra.length();
						break;
					} else {
						numCarac += linea.length();
					}
				}
				System.out.println("Palabra '" + palabra + "' encontrada escondida entre los " + numCarac
						+ " primeros caracteres del texto");
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					br.close();
					fr.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		} else {
			System.out.println("Fichero No Existe");
		}

		sc.close();
	}
}