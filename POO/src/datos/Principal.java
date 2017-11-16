package datos;

public class Principal {

	public static void main(String[] args) {

		Caja c = new Caja(2, 3, 5);
		Caja c1 = new Caja(2, 3, 6);
		if (c.equals(c1)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son distintos");
		}
//		System.out.println(c);
//		System.out.println("El volumen de la caja es: " + c.obtenerVolumen());
//		c.setAncho(20);
//		System.out.println(c);
//		System.out.println("El volumen de la caja es: " + c.obtenerVolumen());
		
	}

}