package datos;

public class EmpleadoAsalariado extends Empleado {

	int salarioSemanal;

	public EmpleadoAsalariado(String nombre, String apellidos, int numero, int salarioSemanal) {
		super(nombre, apellidos, numero);
		this.salarioSemanal = salarioSemanal;
		// TODO Auto-generated constructor stub
	}

	public int getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(int salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public String toString() {
		return "EmpleadoAsalariado [salarioSemanal=" + salarioSemanal + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getNumero()=" + getNumero() + "]";
	}
	
}
