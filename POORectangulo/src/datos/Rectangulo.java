package datos;

public class Rectangulo {

	private double longitud = 1;
	private double altura = 1;

	public Rectangulo() {
		super();
	}

	public Rectangulo(double longitud, double altura) {
		super();
		this.longitud = longitud;
		this.altura = altura;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		if (longitud >= 0 && longitud <= 20)
			this.longitud = longitud;
		else
			this.longitud = 0;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura >= 0 && altura <= 20)
			this.altura = altura;
		else
			this.altura = 0;
	}
	
	public double calcularPerimetro(){
		return longitud*2 + altura*2;
	}
	
	public double calcularArea(){
		return longitud*altura;
	}

}
