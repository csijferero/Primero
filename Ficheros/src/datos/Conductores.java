package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Conductores {

	// Dado el siguiente fichero de conductores de camiones de la empresa Altair
	// S.A.:
	// id01234; Antonio Perez Pozo; 1234ASD; 654321321; español; 200,2; 113,3;
	// 98,4; 546,5
	// Genere un fichero por cada uno de los conductores, de nombre el
	// identificador del conductor
	// sin el id, que muestre su información de la siguiente forma:
	// Nombre: Antonio Perez Pozo
	// Matrícula: 1234ASD
	// Teléfono: 654321321
	// Nacionalidad: español
	// Media Kilómetros: 239,6 km

	public static void main(String[] args) {
		File fichero = new File("ConductorLect.txt");
		File ficheroSal = new File("ConductorEsc.txt");

		if (fichero.exists()) {
			FileReader fr = null;
			BufferedReader br = null;

			FileWriter fw = null;
			BufferedWriter bw = null;

			try {
				fr = new FileReader(fichero);
				br = new BufferedReader(fr);

				fw = new FileWriter(ficheroSal);
				bw = new BufferedWriter(fw);

				String linea;
				while ((linea = br.readLine()) != null) {
					String[] partes = linea.split(";");
					int media = 0;
					bw.write("Nombre:" + partes[1]);
					bw.newLine();
					bw.write("Matrícula:" + partes[2]);
					bw.newLine();
					bw.write("Teléfono:" + partes[3]);
					bw.newLine();
					bw.write("Nacionalidad:" + partes[4]);
					bw.newLine();
					media += Integer.parseInt(partes[5]);
					media += Integer.parseInt(partes[6]);
					media += Integer.parseInt(partes[7]);
					media += Integer.parseInt(partes[8]);
					bw.write("Media Kilómetros:" + media / 4);
					bw.newLine();
					bw.flush();
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} finally {
				try {
					br.close();
					fr.close();

					bw.close();
					fw.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		} else {
			System.out.println("Fichero No Encontrado");
		}
	}

}