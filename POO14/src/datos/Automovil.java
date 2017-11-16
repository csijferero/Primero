package datos;

public class Automovil extends VehiculoMotorizado implements CapacidadLimite{

	private String estilo;
	
	
	public Automovil() {
		// TODO Auto-generated constructor stub
	}


	public Automovil(String fabricante, int anyoFabricacion, String modelo, long kilometraje, int numPasajeros, String estilo) {
		super(fabricante, anyoFabricacion, modelo, kilometraje, numPasajeros);
		this.estilo=estilo;
	}


	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	

	@Override
	public String toString() {
		return "Automovil [estilo=" + estilo + ", getNumPasajeros()=" + getNumPasajeros() + ", getFabricante()="
				+ getFabricante() + ", getAnyoFabricacion()=" + getAnyoFabricacion() + ", getModelo()=" + getModelo()
				+ ", getKilometraje()=" + getKilometraje() + "]";
	}


	@Override
	public boolean comprobarSeguridad() {
		if (estilo.equalsIgnoreCase("VAN") && getNumPasajeros()<LIMVAN)
		return true;
		else if( !estilo.equalsIgnoreCase("VAN") && getNumPasajeros()<LIMAUTOMOVIL )
			return true;
		else
			return false;
	}

}