package datos;

public class Circulo {

	private Punto centro;
	private double radio;

	public Circulo() {
		centro = new Punto();
		radio = 3.1;
	}

	public Circulo(Punto centro, double radio) {
		super();
		this.centro = centro;
		this.radio = radio;
	}

	public Circulo(double x, double y, double radio) {
		this.centro = new Punto(x, y);
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public double getRadio() {
		return radio;
	}

	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double calcularDistanciaDesde(Punto aux) {
		return centro.calcularDistanciaDesde(aux);
		
	}

}
