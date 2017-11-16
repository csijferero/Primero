package datos;

public class Libros extends Materiales {
	
	private int numeroPaginas;

	public Libros(int codigo, String titulo, String autor, int numeroPaginas) {
		super(codigo, titulo, autor);
		this.numeroPaginas = numeroPaginas;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Libros [numeroPaginas=" + numeroPaginas + "]";
	}

}
