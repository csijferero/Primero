package datos;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
	
	private String dni;
	private String nombre;
	private List<Materiales> lista = new ArrayList<Materiales>();
	
	public Clientes(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void realizarPeticion(String inicio, String fin, Discos disco){
		if(lista.size()<5){
		lista.add(disco);
		System.out.println("Se ha realizado la solicitud -->" + disco.getTitulo());
		}
		else
			System.out.println("No se pueden realizar mas peticiones");
	}
	
	public void realizarPeticion(String inicio, String fin, Libros libro){
		if(lista.size()<5){
		lista.add(libro);
		System.out.println("Se ha realizado la solicitud -->" + libro.getTitulo());
		}
		else
			System.out.println("No se pueden realizar mas peticiones");
	}
	
	@Override
	public String toString() {
		return "Clientes [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
