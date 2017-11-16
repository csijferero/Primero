package datos;

public class Camion extends VehiculoMotorizado implements CapacidadLimite {

	private int remolques;

	public Camion() {
		// TODO Auto-generated constructor stub
	}

	public Camion(String fabricante, int anyoFabricacion, String modelo, long kilometraje, int numPasajeros,
			int remolques) {
		super(fabricante, anyoFabricacion, modelo, kilometraje, numPasajeros);
		this.remolques = remolques;
	}

	public int getRemolques() {
		return remolques;
	}

	public void setRemolques(int remolques) {
		this.remolques = remolques;
	}

	@Override
	public String toString() {
		return "Camion [remolques=" + remolques + ", getNumPasajeros()=" + getNumPasajeros() + ", getFabricante()="
				+ getFabricante() + ", getAnyoFabricacion()=" + getAnyoFabricacion() + ", getModelo()=" + getModelo()
				+ ", getKilometraje()=" + getKilometraje() + "]";
	}

	@Override
	public boolean comprobarSeguridad() {
		if (getNumPasajeros() < LIMCAMION)
			return true;
		else
			return false;
	}

}