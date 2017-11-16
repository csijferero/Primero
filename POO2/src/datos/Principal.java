package datos;

public class Principal {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta("Mi nombre", "1234567890", 40000, 3.5);

		c1.setNombre("Otro nombre");
		c1.setCcc("789456123");
		c1.setSaldo(30000);
		c1.setTipoDeInteres(2.3);

		c1.ingresar(100000);
		c2.reintegro(3000);

		System.out.println(c1);
		System.out.println(c2);
	}

}
