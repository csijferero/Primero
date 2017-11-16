package casa;

public class ExcepcionModificada extends Exception {
	
	private String mensaje;
	private int numero;
	
	public ExcepcionModificada(String mensaje, int numero) {
		super();
		this.mensaje = mensaje;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return mensaje + " " + numero;
	}
	
	

}
