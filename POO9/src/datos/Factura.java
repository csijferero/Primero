package datos;

public class Factura {
	
	private int numero;
	private Producto producto;
	
	public Factura(int numero, Producto producto) {
		this.numero = numero;
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", producto=" + producto + "]";
	}
}
