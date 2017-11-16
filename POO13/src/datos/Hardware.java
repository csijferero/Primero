package datos;

public class Hardware extends Articulos {
	
	private Boolean periferico;

	public Hardware() {
		// TODO Auto-generated constructor stub
	}

	public Hardware(char codigo, double precio, String descripcion, Boolean periferico) {
		super(codigo, precio, descripcion);
		this.periferico = periferico;
	}

	@Override
	public double calcularPrecio() {
		double precioFinal = 0;
		
		if (getCodigo() == 'A')
			precioFinal = getPrecio()*1.1;

			
		else if (getCodigo() == 'B')
			precioFinal = getPrecio()*1.15;
		
		if (periferico)
			precioFinal = precioFinal * 1.30;

			
		return precioFinal;
	}

	public Boolean getPeriferico() {
		return periferico;
	}

	public void setPeriferico(Boolean periferico) {
		this.periferico = periferico;
	}

	@Override
	public String toString() {
		return "Hardware [periferico=" + periferico + ", getCodigo()=" + getCodigo() + ", getPrecio()="
				+ getPrecio() + ", getDescripcion()=" + getDescripcion() + "]";
	}
	
	

}
