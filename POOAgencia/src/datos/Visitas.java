package datos;

public class Visitas extends Clientes {
	
	
	private String fecha_hora;
	private String impresion;
	private PisosLibres pisoLibre;
	private ProteccionOficial proteccionOficial;


	public Visitas(String dni, String nombre, String fecha_hora, String impresion,
			ProteccionOficial proteccionOficial) {
		super(dni, nombre);
		this.fecha_hora = fecha_hora;
		this.impresion = impresion;
		this.proteccionOficial = proteccionOficial;
	}


	public Visitas(String dni, String nombre, String fecha_hora, String impresion, PisosLibres pisoLibre) {
		super(dni, nombre);
		this.fecha_hora = fecha_hora;
		this.impresion = impresion;
		this.pisoLibre = pisoLibre;
	}


	public String getFecha_hora() {
		return fecha_hora;
	}


	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}


	public String getImpresion() {
		return impresion;
	}


	public void setImpresion(String impresion) {
		this.impresion = impresion;
	}


	public PisosLibres getPisoLibre() {
		return pisoLibre;
	}


	public void setPisoLibre(PisosLibres pisoLibre) {
		this.pisoLibre = pisoLibre;
	}


	public ProteccionOficial getProteccionOficial() {
		return proteccionOficial;
	}


	public void setProteccionOficial(ProteccionOficial proteccionOficial) {
		this.proteccionOficial = proteccionOficial;
	}


	@Override
	public String toString() {
		return "Visitas [fecha_hora=" + fecha_hora + ", impresion=" + impresion + ", pisoLibre=" + pisoLibre
				+ ", proteccionOficial=" + proteccionOficial + "]";
	}
	
}
