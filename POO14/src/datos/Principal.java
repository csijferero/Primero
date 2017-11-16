package datos;

public class Principal {

	public static void main(String[] args) {
		
		Camion camion1= new Camion("Mercedes", 2010, "grande", 120000, 10, 1);
		if (camion1.comprobarSeguridad())
			System.out.println("Todo ok");
		else
			System.out.println("Falta Seguridad");

	}

}