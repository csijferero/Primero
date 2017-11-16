package datos;

public class Ej0Principal3 {

	public static void main(String[] args) {
		try {
			metodo1();
		} catch (Ej0 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void metodo1() throws Ej0 {
		metodo2();
	}

	private static void metodo2() throws Ej0 {
		metodo3();
	}

	private static void metodo3() throws Ej0 {
		throw new Ej0("Error Número", 1);
	}

}