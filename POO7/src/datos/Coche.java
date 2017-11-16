package datos;

public class Coche {

	private Motor motor;
	private String marca;
	private String modelo;
	private double importeAveria;

	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public double getImporteAveria() {
		return importeAveria;
	}

	public void acumulaAveria(double precio) {
		this.importeAveria += precio;
	}
}
