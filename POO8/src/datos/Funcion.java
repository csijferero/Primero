package datos;

public class Funcion {

	private String nombreF;
	private int precio;

	public Funcion(String nombreF, int precio) {
		this.nombreF = nombreF;
		this.precio = precio;
	}

	public void cambiarNombreF(String nuevo) {
		nombreF = nuevo;
	}

	public void cambiarPrecio(int nuevo) {
		precio = nuevo;
	}

	@Override
	public String toString() {
		return "Funcion [nombreF=" + nombreF + ", precio=" + precio + "]";
	}
}
