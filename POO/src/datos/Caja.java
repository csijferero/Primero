package datos;

public class Caja {

	// ATB
	private double ancho;
	private double alto;
	private double largo;

	// CONSTR
	public Caja() {
		super();
	}

	public Caja(double ancho, double alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}

	public Caja(double ancho, double alto, double largo) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.largo = largo;
	}

	// GET/SET
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	// METODOS
	public double obtenerVolumen() {
		return ancho * alto * largo;
	}

	public double obtenerVolumen(double ancho) {
		return ancho * 2;
	}

	public void obtenerVolumen(int ancho) {
		System.out.println(ancho);
	}

	// ToString
	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "]";
	}

	public boolean equals(Caja aux) {
		if (this.ancho == aux.ancho && this.alto == aux.alto && this.largo == aux.largo) {
			return true;
		} else {
			return false;
		}
	}

}
