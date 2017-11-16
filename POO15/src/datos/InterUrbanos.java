package datos;

public class InterUrbanos extends Autobus {
	
	private double numKilometros;
	
	public InterUrbanos() {
		// TODO Auto-generated constructor stub
	}

	public InterUrbanos(int idAutobus, Conductor chofer, double precioBase, int numKilometros) {
		super(idAutobus, chofer, precioBase);
		this.numKilometros=numKilometros;
	}

	public double getNumKilometros() {
		return numKilometros;
	}

	public void setNumKilometros(double numKilometros) {
		this.numKilometros = numKilometros;
	}

	@Override
	public String toString() {
		return "InterUrbanos [numKilometros=" + numKilometros + "]";
	}

	@Override
	public double precioBillete() {
		// TODO Auto-generated method stub
		return getPrecioBase()*numKilometros;
	}
	
	
	
	

}
