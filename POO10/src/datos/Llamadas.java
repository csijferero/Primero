package datos;

public abstract class Llamadas {
	
	private String numOrigen;
	private String numDestino;
	private double duracion;
	
	public Llamadas(){
		
	}

	public Llamadas(String numOrigen, String numDestino, double duracion) {
		super();
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
		this.duracion = duracion;
	}
	
	public String getNumOrigen() {
		return numOrigen;
	}
	
	public String getNumDestino() {
		return numDestino;
	}
	
	public double getDuracion() {
		return duracion;
	}
	
	public abstract double calcularPrecio();

}
