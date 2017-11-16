package datos;

public abstract class Articulos {
	
	private char codigo;
	private double precio;
	private String descripcion;
	
	public Articulos() {
		// TODO Auto-generated constructor stub
	}
	
	public Articulos(char codigo, double precio, String descripcion) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.descripcion = descripcion;
	}



	public char getCodigo() {
		return codigo;
	}



	public void setCodigo(char codigo) {
		this.codigo = codigo;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public abstract double calcularPrecio();

	@Override
	public String toString() {
		return "Articulos [codigo=" + codigo + ", precio=" + precio + ", descripcion=" + descripcion + "]";
	}

}
