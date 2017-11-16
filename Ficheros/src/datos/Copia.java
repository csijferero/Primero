package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copia {

	// Crear un programa que copie el contenido de un archivo en otro utilizando
	// FileReader y FileWriter.

	public static void main(String[] args) {
		File ficheroEnt = new File("ficheroEnt.txt");
		File ficheroSal = new File("ficheroSal.txt");
		
		if (ficheroEnt.exists()) {
			if (!ficheroSal.exists()) {
				try {
					ficheroSal.createNewFile();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			FileReader fr = null;
			BufferedReader br = null;
					
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			try {
				fr = new FileReader(ficheroEnt);
				br = new BufferedReader(fr);
				
				fw = new FileWriter(ficheroSal);
				bw = new BufferedWriter(fw);
				
				String linea;
				int cont = 0;
				while ((linea = br.readLine()) != null) {
					if (cont != 0)
						bw.newLine();
					bw.write(linea);
					bw.flush();
					cont++;
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
			
		}
	}

}