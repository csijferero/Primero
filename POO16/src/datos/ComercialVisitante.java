package datos;

public class ComercialVisitante extends Comercial {

	private static final double PORCENTAJE_POR_VISITA = 0.01;
	
	int numVisitasRealizadas;
	
	public ComercialVisitante(String dni, double sueldoBase) {
		super(dni, sueldoBase);
		numVisitasRealizadas = 0;
	}
	
	public void añadirVisitaRealizada(){
		numVisitasRealizadas++;
	}
	
	protected double calculaExtras(){
		return numClientesConseguidos*getSueldoBase()*0.05+numVisitasRealizadas*getSueldoBase()*0.01;
	}

	@Override
	public String toString() {
		return "ComercialVisitante [numVisitasRealizadas=" + numVisitasRealizadas + ", numClientesConseguidos="
				+ numClientesConseguidos + "]";
	}
	
	
}
