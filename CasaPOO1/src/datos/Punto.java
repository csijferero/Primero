package datos;

public class Punto {
	private double p1;
	private double p2;


	
	public double getP1() {
		return p1;
	}





	public double getP2() {
		return p2;
	}



	public Punto() {
		super();
	}





	public Punto(double p1, double p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}





	public double calcularDistanciaDesde(Punto x){
		if (x.p2 > x.p1) {
			return (x.p2 - x.p1);
		}
		else {
			return (x.p1 - x.p2);
		}
	}
	
	

}
