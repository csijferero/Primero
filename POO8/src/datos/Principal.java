package datos;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		Funcion f1 = new Funcion("FinCurso", 20);
		
		Funcion f2 = new Funcion("Inicio Curso", 10);
		
		List<Funcion> lista = new ArrayList<Funcion>();
		
		lista.add(f1);
		
		lista.add(f2);
		
		Teatro t1 = new Teatro("Altair", "Sevilla", lista);

		System.out.println(t1);

		System.out.println(f1);
		
		System.out.println(f2);

		t1.cambiarNombreT("Alameda");

		f1.cambiarNombreF("InicioCurso");

		f1.cambiarPrecio(120);

		System.out.println(t1);

		System.out.println(f1);
		
		System.out.println(f2);
	}

}
