package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ordenacion {

	// Dado un fichero de texto, constituido únicamente por cadenas que
	// representen valores enteros, elaborar
	// un algoritmo que escriba en otro fichero los valores ordenados del
	// fichero de partida.

	public static void main(String[] args) {

		File ficheroEnt = new File("FicheroEnt.txt");

		File ficheroSal = new File("FicheroSal.txt");

		if (ficheroEnt.exists()) {
			if (!ficheroSal.exists()) {
				try {
					ficheroSal.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
			String linea;
			int contador = 0;

			FileWriter fw = null;
			BufferedWriter bw = null;

			FileReader fr = null;
			BufferedReader br = null;

			try { // Averiguamos el numero de lineas del fichero
				fr = new FileReader(ficheroEnt);
				br = new BufferedReader(fr);

				while ((linea = br.readLine()) != null) {
					contador++;
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}

			int[] tabla = new int[contador]; // Creo la tabla con el tamaño
												// igual al numero de lineas
			contador = 0;

			try { // añadimos valores a la tabla
				fr = new FileReader(ficheroEnt);
				br = new BufferedReader(fr);

				while ((linea = br.readLine()) != null) {
					tabla[contador] = Integer.parseInt(linea);
					contador++;
				}

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
				System.out.println(e1.getMessage());
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}

			int aux; // Parte de ordenacion
			for (int i = 1; i < tabla.length; i++) {
				for (int j = 0; j < tabla.length - 1; j++) {
					if (tabla[i] < tabla[j]) {
						aux = tabla[i];
						tabla[i] = tabla[j];
						tabla[j] = aux;
					}
				}
			}

			try { // Pasamos la tabla al fichero
				fw = new FileWriter(ficheroSal);
				bw = new BufferedWriter(fw);
				for (int i = 0; i < tabla.length; i++) {
					bw.write(+tabla[i]);
					bw.newLine();
					bw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			} finally {

				try {
					fr.close();
					bw.close();

					fw.close();
					br.close();

				} catch (IOException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
		} else {
			System.out.println("No se ha encontrado el fichero");
		}
	}
}
