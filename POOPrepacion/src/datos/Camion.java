package datos;

public class Camion extends Vehiculo {
	
	private double pma;

	public Camion(String alquiler, int dias_alquiler, int num_plazas, double pma) {
		super(alquiler, dias_alquiler, num_plazas);
		// TODO Auto-generated constructor stub
		this.pma = pma;
	}
	
	
	

	public double getPma() {
		return pma;
	}




	public void setPma(double pma) {
		this.pma = pma;
	}

	@Override
	public double calcularAlquiler() {
		// TODO Auto-generated method stub
		return 50*getDias_alquiler() + 40 + 20*pma;
	}

}
