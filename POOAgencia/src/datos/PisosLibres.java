package datos;

public class PisosLibres extends ProteccionOficial {
	
	private double beneficio;

	public PisosLibres(String direccion, double metros, String descripcion, double precio, double beneficio) {
		super(direccion, metros, descripcion, precio);
		this.beneficio = beneficio;
	}

	public double getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(double beneficio) {
		this.beneficio = beneficio;
	}

	@Override
	public String toString() {
		return "PisosLibres [beneficio=" + beneficio + "]";
	}
	
	
	
	

}
