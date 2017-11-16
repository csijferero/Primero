package datos;

public class LlamadaProvincial extends Llamadas {
	
	private double precio1 =20;
	private double precio2 = 25;
	private double precio3 = 30;
	private int franja;
	
	
	public LlamadaProvincial(String numOrigen, String numDestino, double duracion, int franja) {
		super(numOrigen, numDestino, duracion);
		// TODO Auto-generated constructor stub
		this.franja = franja;
	}
	
	
	@Override
	public double calcularPrecio() {
		switch (franja) {
		case 0:
			return getDuracion()*precio1;
		case 1: 
			return getDuracion()*precio2;
		case 2:
			return getDuracion()*precio3;
		default:
			break;
		}
		return 0;
	}


	@Override
	public String toString() {
		return "LlamadaProvincial [franja=" + franja + ", getNumDestino()=" + getNumDestino() + ", getDuracion()="
				+ getDuracion() + "]";
	}
	
	
	
	
	
	
}
