package datos;

public class Motocicleta extends VehiculoMotorizado {

	private String usos;
	
	public String getUsos() {
		return usos;
	}

	public void setUsos(String usos) {
		this.usos = usos;
	}

	public Motocicleta() {
		// TODO Auto-generated constructor stub
	}

	

	public Motocicleta(String fabricante, int anyoFabricacion, String modelo, long kilometraje, int numPasajeros,String usos) {
		super(fabricante, anyoFabricacion, modelo, kilometraje, numPasajeros);
		this.usos=usos;
	}

	@Override
	public String toString() {
		return "Motocicletas [usos=" + usos + ", getNumPasajeros()=" + getNumPasajeros() + ", getFabricante()="
				+ getFabricante() + ", getAnyoFabricacion()=" + getAnyoFabricacion() + ", getModelo()=" + getModelo()
				+ ", getKilometraje()=" + getKilometraje() + "]";
	}

	

}