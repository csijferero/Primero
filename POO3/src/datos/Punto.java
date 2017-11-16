package datos;

public class Punto {

	private double x;
	private double y;

	public Punto() {
		y = 0.0;
		x = 2.2;
	}

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double calcularDistanciaDesde(Punto p) {
		double c1 = this.x - p.getX();
		double c2 = this.y - p.getY();
		return Math.sqrt(Math.pow(c1, c2) + Math.pow(c2, 2));
	}
}
