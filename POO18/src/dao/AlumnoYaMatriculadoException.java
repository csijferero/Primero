package dao;

public class AlumnoYaMatriculadoException extends Exception {
	
	private String mensaje;
	
	public AlumnoYaMatriculadoException() {
		super();
	}



	public AlumnoYaMatriculadoException(String mensaje) {
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
