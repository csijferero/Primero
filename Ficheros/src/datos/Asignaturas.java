package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Asignaturas {

	public static void main(String[] args) {
		
		File ficheroEnt = new File("copia1.txt");
		File ficheroSal = new File("copia2.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String linea;
		int contador = 0;

		if (ficheroEnt.exists()) {
			if (!ficheroSal.exists()) {
				try {
					ficheroSal.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}
			
			try { //Averiguamos el numero de lineas
				fr = new FileReader(ficheroEnt);
				br = new BufferedReader(fr);
				while ((linea = br.readLine()) != null) {
					contador++;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			int[] entero = new int[contador];
			String[] nombre = new String[contador];
			Float[] nota = new Float[contador];
			
			try {
				fr = new FileReader(ficheroEnt);
				br = new BufferedReader(fr);
				contador=0;
				while ((linea = br.readLine()) != null) {
					String[] tabla = linea.split("\\|");
					entero[contador] = Integer.parseInt(tabla[0]);
					nombre[contador] = tabla[1];
					nota[contador] = Float.parseFloat(tabla[2]);
					contador++;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			try {
				fw = new FileWriter(ficheroSal);
				bw = new BufferedWriter(fw);
				for (int i = 0; i < nota.length; i++) {
					bw.write("ID: " + entero[i]);
					bw.newLine();
					bw.write("Nombre: " + nombre[i]);
					bw.newLine();
					bw.write("Nota: " + nota[i]);
					bw.newLine();
					bw.newLine();
					bw.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			} finally {
				try {
					bw.close();
					fw.close();
					
					fr.close();
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}

			}
			
			
			
		} else {
			System.out.println("No existe el archivo");

		}
		
		
		
		
	}

}
