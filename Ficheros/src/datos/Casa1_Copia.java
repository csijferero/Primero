package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Casa1_Copia {

	private static Scanner sc = new Scanner(System.in);

	private static void CreaFichero(String nombre) {

		File fichero = new File(nombre);

		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.print(e.getMessage());
			}

			FileWriter fw = null;
			BufferedWriter bw = null;

			try {
				fw = new FileWriter(fichero);
				bw = new BufferedWriter(fw);

				System.out.print("Escriba el contenido del fichero: ");
				String linea = sc.nextLine();

				bw.write(linea);
				bw.flush();

			} catch (IOException e) {
				e.printStackTrace();
				System.out.print(e.getMessage());
			} finally {
				try {
					fw.close();
					bw.close();

				} catch (IOException e) {
					e.printStackTrace();
					System.out.print(e.getMessage());
				}
			}
		} else {
			System.out.println("El fichero ya existe");
		}

	}

	private static void LectorFichero(String nombre) {

		File fichero = new File(nombre);

		if (fichero.exists()) {

			FileReader fr = null;
			BufferedReader br = null;

			try {

				fr = new FileReader(fichero);
				br = new BufferedReader(fr);

				String linea;
				int contador = 0;
				while ((linea = br.readLine()) != null) {
					contador++;
					System.out.println("Linea " + contador + linea);
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.print(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
				System.out.print(e.getMessage());
			} finally {
				try {
					br.close();
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.print(e.getMessage());
				}
			}

		} else {
			System.out.println("El fichero no existe");
		}

	}

	private static void Copiar(String nombre, String nombre2) {

		File ficheroEnt = new File(nombre);
		File ficheroSal = new File(nombre2);

		if (ficheroEnt.exists()) {
			if (!ficheroSal.exists()) {
				try {
					ficheroSal.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.print(e.getMessage());
				}
			}

			FileWriter fw = null;
			BufferedWriter bw = null;

			FileReader fr = null;
			BufferedReader br = null;

			try {
				fr = new FileReader(ficheroEnt);
				br = new BufferedReader(fr);

				fw = new FileWriter(ficheroSal);
				bw = new BufferedWriter(fw);

				String linea;
				int contador = 0;
				while ((linea = br.readLine()) != null) {
					contador++;

					if (contador != 1) {
						bw.newLine();
					}

					bw.write("Linea " + contador + ": " + linea);

					bw.flush();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.print(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
				System.out.print(e.getMessage());
			} finally {
				try {
					fr.close();
					br.close();
					fw.close();
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.print(e.getMessage());
				}
			}
		} else {
			System.out.println("El fichero no existe");
		}
	}

	public static void main(String[] args) {

		System.out.print("Escriba el nombre del fichero a copiar: ");
		String nombre = sc.nextLine();

		System.out.print("Escriba el nombre del fichero al que vamos a copiar: ");
		String nombre2 = sc.nextLine();

		Copiar(nombre, nombre2);

		sc.close();

	}
}
