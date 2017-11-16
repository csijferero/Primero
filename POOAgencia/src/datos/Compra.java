package datos;

public class Compra extends Visitas {
	
	private double prestamo;
	private boolean aval;
	private double interes;
	private int ayosHipoteca;
	
	
	public Compra(String dni, String nombre, String fecha_hora, String impresion, ProteccionOficial proteccionOficial,
			double prestamo, boolean aval, double interes, int ayosHipoteca) {
		super(dni, nombre, fecha_hora, impresion, proteccionOficial);
		this.prestamo = prestamo;
		this.aval = aval;
		this.interes = interes;
		this.ayosHipoteca = ayosHipoteca;
	}


	public Compra(String dni, String nombre, String fecha_hora, String impresion, PisosLibres pisoLibre,
			double prestamo, boolean aval, double interes, int ayosHipoteca) {
		super(dni, nombre, fecha_hora, impresion, pisoLibre);
		this.prestamo = prestamo;
		this.aval = aval;
		this.interes = interes;
		this.ayosHipoteca = ayosHipoteca;
	}


	public double getPrestamo() {
		return prestamo;
	}


	public void setPrestamo(double prestamo) {
		this.prestamo = prestamo;
	}


	public boolean isAval() {
		return aval;
	}


	public void setAval(boolean aval) {
		this.aval = aval;
	}


	public double getInteres() {
		return interes;
	}


	public void setInteres(double interes) {
		this.interes = interes;
	}


	public int getAyosHipoteca() {
		return ayosHipoteca;
	}


	public void setAyosHipoteca(int ayosHipoteca) {
		this.ayosHipoteca = ayosHipoteca;
	}


	@Override
	public String toString() {
		return "Compra [prestamo=" + prestamo + ", aval=" + aval + ", interes=" + interes + ", ayosHipoteca="
				+ ayosHipoteca + "]";
	}
	

}
