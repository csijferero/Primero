package dao;

public class CursoCompletoException extends Exception {
	
	private String mensaje;
	
	public CursoCompletoException() {
		super();
	}



	public CursoCompletoException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}



	public String getMensaje() {
		return mensaje;
	}



	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	


	@Override
	public String toString() {
		return "AlumnoYaMatriculadoException [mensaje=" + mensaje + "]";
	}

}
