package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Elaborar un algoritmo que lea un fichero de texto en disco y cuente el n�mero de caracteres, el
//n�mero de palabras y el n�mero de l�neas que contiene el mismo, presentado estos datos
//como resultado en pantalla.
//Para contar las palabras, considerar como una palabra cualquier sucesi�n de caracteres
//separada por uno o m�s blancos, tabuladores, s�mbolos de puntuaci�n o fin de l�nea. 

public class Contar {

	public static void main(String[] args) {
		int numCarac = 0, numLineas = 0, numPalabras = 0;

		File fichero = new File("ficheroEnt.txt");
		if (fichero.exists()) {
			FileReader fr = null;
			BufferedReader br = null;

			try {
				fr = new FileReader(fichero);
				br = new BufferedReader(fr);

				String linea;
				while ((linea = br.readLine()) != null) {
					numLineas++;

					String[] partes = linea.split(" ");
					numPalabras += partes.length;

					for (int i = 0; i < partes.length; i++) {
						numCarac += partes[i].length();
					}
				}
				System.out.println("N� L�NEAS: " + numLineas);
				System.out.println("N� PALABRAS: " + numPalabras);
				System.out.println("N� CARACTERES: " + numCarac);
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
	}

}