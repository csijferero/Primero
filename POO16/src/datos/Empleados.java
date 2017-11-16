package datos;

public abstract class Empleados {
	
	private String dni;
	private double sueldoBase;
	static double productividad;
	private double extras;
	
	
	public Empleados(String dni, double sueldoBase) {
		super();
		this.dni = dni;
		this.sueldoBase = sueldoBase;
	}
	
	double calculaSueldoMensual(){
		extras = calculaExtras();
		return (getSueldoBase() + getProductividad() + getExtras());
	}
	
	protected abstract double calculaExtras();
	
	public abstract void comienzaMes();


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public double getSueldoBase() {
		return sueldoBase;
	}


	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}


	public static double getProductividad() {
		return productividad;
	}


	public static void setProductividad(double productividad) {
		Empleados.productividad = productividad;
	}

	public double getExtras() {
		return extras;
	}

	public void setExtras(double extras) {
		this.extras = extras;
	}

	@Override
	public String toString() {
		return "Empleados [dni=" + dni + ", sueldoBase=" + sueldoBase + ", extras=" + extras + "]";
	}
	
	
}
