package datos;

public class ProteccionOficial {
	
	private String direccion;
	private double metros;
	private String descripcion;
	private double precio;
	
	public ProteccionOficial(String direccion, double metros, String descripcion, double precio) {
		super();
		this.direccion = direccion;
		this.metros = metros;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getMetros() {
		return metros;
	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "ProteccionOficial [direccion=" + direccion + ", metros=" + metros + ", descripcion=" + descripcion
				+ ", precio=" + precio + "]";
	}
	
	
	
	
	

}
