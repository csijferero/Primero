package datos;

public class Circulo {
	
	private Punto c1;
	private double c2;
	
	
	public Circulo() {
		super();
	}
	
	
	public Circulo(Punto c1, double c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public Circulo(Punto c1, double c2, double c) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}


	public Punto getC1() {
		return c1;
	}


	public double getC2() {
		return c2;
	}
	
	public double calcularDistanciaDesde(Punto y){
		if (y.getP1()>c2) {
			return (y.getP1()-c2);
		}
		else
			return (c2-y.getP1());
	}
	
	public double calcularArea(){
		return double;
	}
	
	public double calcularPerimetro(){
		return double;
	}

	
	
	

}
