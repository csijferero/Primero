package datos;

public abstract class Comercial extends Empleados {

	private static final double PORCENTAJE_POR_CLIENTE_CONSEGUIDO = 0.05;
	
	int numClientesConseguidos;
	
	public Comercial(String dni, double sueldoBase) {
		super(dni, sueldoBase);
		numClientesConseguidos = 0;
	}
	
	public void añadirClienteConseguido(){
		numClientesConseguidos++;
	}
	
	protected double calculaExtras() {
		return numClientesConseguidos*getSueldoBase()*0.05;
	}
	
	public void comienzaMes(){
		numClientesConseguidos = 0;
	}
	
	

}
