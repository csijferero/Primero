package datos;

public abstract class VehiculoMotorizado {

	private String fabricante;
	private int anyoFabricacion;
	private String modelo;
	private long kilometraje;
	private int numPasajeros;
	
	public VehiculoMotorizado(String fabricante, int anyoFabricacion, String modelo, long kilometraje,
			int numPasajeros) {
		super();
		this.fabricante = fabricante;
		this.anyoFabricacion = anyoFabricacion;
		this.modelo = modelo;
		this.kilometraje = kilometraje;
		this.numPasajeros = numPasajeros;
	}


	public VehiculoMotorizado(){};
	
	
	public int getNumPasajeros() {
		return numPasajeros;
	}


	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}


	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getAnyoFabricacion() {
		return anyoFabricacion;
	}
	public void setAnyoFabricacion(int anyoFabricacion) {
		this.anyoFabricacion = anyoFabricacion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public long getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(long kilometraje) {
		this.kilometraje = kilometraje;
	}
	@Override
	public String toString() {
		return "VehiculoMotorizado [fabricante=" + fabricante + ", anyoFabricacion=" + anyoFabricacion + ", modelo="
				+ modelo + ", kilometraje=" + kilometraje + "]";
	}
	
	
}
