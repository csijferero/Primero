package datos;

public class Producto {
	
	private String codigo;
	private int precio;	
	
	public Producto(String codigo, int precio) {
		this.codigo = codigo;
		this.precio = precio;
	}

	public void cambiarCodigo(String nuevo){
		codigo= nuevo;
	}
	
	public void cambiarPrecio(int nuevo){
		precio= nuevo;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", precio=" + precio + "]";
	}

}
