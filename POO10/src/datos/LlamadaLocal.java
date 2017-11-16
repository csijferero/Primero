package datos;

public class LlamadaLocal extends Llamadas{
	
	private double precio = 15;


	public LlamadaLocal(String numOrigen, String numDestino, double duracion) {
		super(numOrigen, numDestino, duracion);
		// TODO Auto-generated constructor stub
	}



	@Override
	public double calcularPrecio() {
		// TODO Auto-generated method stub
		return getDuracion()*precio;
	}



	@Override
	public String toString() {
		return "LlamadaLocal [precio=" + precio + ", getNumOrigen()=" + getNumOrigen() + ", getNumDestino()="
				+ getNumDestino() + ", getDuracion()=" + getDuracion() + "]";
	}
}
