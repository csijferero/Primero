package datos;

public class Urbanos extends Autobus {
	
	private String ruta;
	
	public Urbanos() {
		// TODO Auto-generated constructor stub
	}

	public Urbanos(int idAutobus, Conductor chofer, double precioBase, String ruta) {
		super(idAutobus, chofer, precioBase);
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Urbanos [ruta=" + ruta + "]";
	}

	@Override
	public double precioBillete() {
		if (ruta.equalsIgnoreCase("A"))
			return getPrecioBase()*1.1;
		else
			return getPrecioBase()*1.2;
	}
	
	
	
	

}
