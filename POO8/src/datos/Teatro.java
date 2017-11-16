package datos;

import java.util.List;
import java.util.ArrayList;

public class Teatro {
	
	private String nombreT;
	private String direccion;
	private List<Funcion> funciones = new ArrayList<Funcion>();
	
	public Teatro() {
		
	}

	public Teatro(String nombreT, String direccion, List<Funcion> lista) {
		this.nombreT = nombreT;
		this.direccion = direccion;
		this.funciones = lista;
	}
	
	public void cambiarNombreT(String nuevo) {
		nombreT = nuevo;
	}

	@Override
	public String toString() {
		return "Teatro [nombreT=" + nombreT + ", direccion=" + direccion + ", funciones=" + funciones + "]";
	}
	
	
}
