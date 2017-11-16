package datos;

public class Practica5c {

	public static void main(String[] args) {
		
		Garaje g = new Garaje();
		
		Coche c1 = new Coche("Seat", "Ibiza");
		
		Coche c2 = new Coche("Mercedes", "A45");
		
		g.aceptarCoche(c1, "aceite");
		
		c1.acumulaAveria(Math.random());
		
		
		
		
		
		
		
	}

}
