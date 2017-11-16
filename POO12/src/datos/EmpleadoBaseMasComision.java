package datos;

public class EmpleadoBaseMasComision extends Empleado {

	int salarioBase;

	public EmpleadoBaseMasComision(String nombre, String apellidos, int numero, int salarioBase) {
		super(nombre, apellidos, numero);
		this.salarioBase = salarioBase;
		// TODO Auto-generated constructor stub
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "EmpleadoBaseMasComision [salarioBase=" + salarioBase + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getNumero()=" + getNumero() + "]";
	}

}
