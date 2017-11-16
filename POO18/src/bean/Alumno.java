package bean;

public class Alumno {

	private String nombre;
	private String direccion;
	private String dni;
	private long telefono;
	
	
	
	public Alumno() {
		super();
	}
	public Alumno(String nombre, String direccion, String dni, long telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", direccion=" + direccion + ", dni=" + dni + ", telefono=" + telefono
				+ "]";
	}
	
	
}
