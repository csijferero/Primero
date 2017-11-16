package datos;

public abstract class Materiales {
	
	private int codigo;
	private String titulo;
	private String autor;
	
	
	public Materiales(int codigo, String titulo, String autor) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "Materiales [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + "]";
	}
	
	
	
	

}
