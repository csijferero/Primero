package datos;

public class Main {

	public static void main(String[] args) {
		Autobus a1 = new Urbanos(1, new Conductor("José Luis", 1200), 0.4, "B");
		System.out.println("A1: " + a1);
		System.out.println("Precio Billete A1: " + a1.precioBillete() + "€");
		
		Autobus a2 = new InterUrbanos(2, new Conductor("José", 1500), 0.05, 1000);
		System.out.println("A2: " + a2);
		System.out.println("Precio Billete A2: " + a2.precioBillete() + "€");
	}

}
