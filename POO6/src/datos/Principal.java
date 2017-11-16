package datos;

public class Principal {

	public static void main(String[] args) {
		
		Titular t = new Titular("Yo", "APE1 APE2", 37);
		
		CuentaCorriente cc = new CuentaCorriente(t, "123456789", 2000);
		CuentaAhorro ca = new CuentaAhorro(new Titular("Tu", "APE11 APE22", 38), "987654321", 5000, 2.5);
		
		System.out.println(cc);
		System.out.println(ca);
		
		cc.reintegro(1000);
		ca.ingresar(4000);
		
		System.out.println(cc);
		System.out.println(ca);
		
		ca.calvularInteres();
		System.out.println(ca);
		
		System.out.println("Iguales?" + cc.equals(ca));
	}
}
