package datos;

public class Ej0Principal {

	public static void main(String[] args) {

		try {
			metodo();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("SIEMPRE");
		}

	}

	private static void metodo() throws NullPointerException {
		throw new NullPointerException("mensaje");
	}

}