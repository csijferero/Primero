package datos;

public class EmpleadoPorHoras extends Empleado {

	int sueldo;
	int numHoras;

	public EmpleadoPorHoras(String nombre, String apellidos, int numero, int sueldo, int numHoras) {
		super(nombre, apellidos, numero);
		this.sueldo = sueldo;
		this.numHoras = numHoras;
		// TODO Auto-generated constructor stub
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	@Override
	public String toString() {
		return "EmpleadoPorHoras [sueldo=" + sueldo + ", numHoras=" + numHoras + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getNumero()=" + getNumero() + "]";
	}

}
