package datos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Casa2 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Escriba el nombre del archivo: ");

		String nombre = sc.nextLine();

		System.out.println("Escriba el contenido del archivo: ");

		String contenido = sc.nextLine();

		String respuesta = "";

		File ficheroEnt = new File(nombre);

		FileWriter fw = null;
		BufferedWriter bw = null;

		if (ficheroEnt.exists()) {
			System.out.println("El archivo ya existe. Sobreescribir?");
			respuesta = sc.nextLine();
		}
		if (respuesta.equalsIgnoreCase("S") || !ficheroEnt.exists()) {
			if (!ficheroEnt.exists()) {
				try {
					ficheroEnt.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			try {
				fw = new FileWriter(ficheroEnt);
				bw = new BufferedWriter(fw);

				bw.write(contenido);
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			} finally {
				try {
					fw.close();
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
