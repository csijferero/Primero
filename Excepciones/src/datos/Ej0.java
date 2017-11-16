package datos;

public class Ej0 extends Exception {

	private String mensaje;
	private int numero;

	public Ej0(String mensaje, int numero) {
		super();
		this.mensaje = mensaje;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return mensaje + " " + numero;
	}

}