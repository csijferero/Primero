package datos;

public class PrincipalUno {

	public static void main(String[] args) {
		Primera p = new Primera();
		Segunda s = new Segunda();

		p.i = 10;
		p.j = 20;
		p.mostrar();

		s.i = 2;
		s.j = 3;
		s.k = 4;
		
		s.mostrar();
		s.mostrark();
		s.suma();

	}

}
