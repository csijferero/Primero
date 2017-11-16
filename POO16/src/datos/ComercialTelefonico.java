package datos;

public class ComercialTelefonico extends Comercial {

	public ComercialTelefonico(String dni, double sueldoBase) {
		super(dni, sueldoBase);
	}

	@Override
	public String toString() {
		return "ComercialTelefonico [numClientesConseguidos=" + numClientesConseguidos + "]";
	}
	
	
}
