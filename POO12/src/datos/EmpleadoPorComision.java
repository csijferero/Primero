package datos;

public class EmpleadoPorComision extends Empleado {

	int comisiones;
	int ventas;

	public EmpleadoPorComision(String nombre, String apellidos, int numero, int comisiones, int ventas) {
		super(nombre, apellidos, numero);
		this.comisiones = comisiones;
		this.ventas = ventas;
		// TODO Auto-generated constructor stub
	}

	public int getComisiones() {
		return comisiones;
	}

	public void setComisiones(int comisiones) {
		this.comisiones = comisiones;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "EmpleadoPorComision [comisiones=" + comisiones + ", ventas=" + ventas + ", getNombre()=" + getNombre()
				+ ", getApellidos()=" + getApellidos() + ", getNumero()=" + getNumero() + "]";
	}
	
}
