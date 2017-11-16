package datos;

public class Main {

	public static void main(String[] args) {
		
		Encriptador e = new Encriptador();
		
		int codigo = 123;
		
		Algoritmo aM = new AlgoritmoMultiplicacion(10);
		int aux = e.encriptarDeEncriptador(codigo, aM);
		System.out.println("Encripado: " + aux);
		System.out.println("Desencripado: " + e.desencriptarDeEncriptador(aux, aM));
		
		
	}

}
