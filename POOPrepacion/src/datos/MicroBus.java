package datos;

public class MicroBus extends Vehiculo {

	public MicroBus(String alquiler, int dias_alquiler, int num_plazas) {
		super(alquiler, dias_alquiler, num_plazas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularAlquiler() {
		// TODO Auto-generated method stub
		return 50*getDias_alquiler() + (1.5*getNum_plazas()*getDias_alquiler()) + (2*getNum_plazas());
	}

}
