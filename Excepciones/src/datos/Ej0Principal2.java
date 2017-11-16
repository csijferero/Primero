package datos;

public class Ej0Principal2 {

	public static void main(String[] args) {
		for (int i = 0; i < 15; i++) {
			try {
				imprimeNumero(i);
			} catch (Ej0 e) {
				System.out.println(e);
			}
		}
	}

	private static void imprimeNumero(int i) throws Ej0, NullPointerException {
		if (i < 10)
			System.out.println(i);
		else
			throw new Ej0("Imposible imprimir ", i);
	}
}