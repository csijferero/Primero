package datos;

public class Jardineros extends Empleados {

	private static final double PORCENTAJE_POR_DIA_LEJOS = 0.03;
	
	int numDiasTrabajadosLejos;
	
	
	public Jardineros(String dni, double sueldoBase) {
		super(dni, sueldoBase);
		numDiasTrabajadosLejos = 0;
	}
	
	public void añadirDiaTrabajadoLejos(){
		numDiasTrabajadosLejos++;
	}


	@Override
	protected double calculaExtras() {
		return numDiasTrabajadosLejos*getSueldoBase()*0.03;
	}


	@Override
	public void comienzaMes() {
		numDiasTrabajadosLejos = 0;
	}

	@Override
	public String toString() {
		return "Jardineros [numDiasTrabajadosLejos=" + numDiasTrabajadosLejos + "]";
	}
	
	
}
