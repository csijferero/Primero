package datos;

public class Discos extends Materiales {
	
	private String discografia;

	public Discos(int codigo, String titulo, String autor, String discografia) {
		super(codigo, titulo, autor);
		this.discografia = discografia;
	}

	public String getDiscografia() {
		return discografia;
	}

	public void setDiscografia(String discografia) {
		this.discografia = discografia;
	}

	@Override
	public String toString() {
		return "Discos [discografia=" + discografia + "]";
	}

}
