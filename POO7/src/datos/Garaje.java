package datos;

public class Garaje {

	private Coche coche;
	private String averia;
	private int numero;

	public Garaje() {
	}

	public Boolean aceptarCoche(Coche c, String a) {
		if (numero == 1)
			return false;
		else {
			numero = 1;
			return true;
		}
	}

	public void devolverCoche() {
		numero = 0;
	}
}
