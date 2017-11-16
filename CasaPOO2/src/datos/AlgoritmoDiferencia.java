package datos;

public class AlgoritmoDiferencia implements Algoritmo {
	
	public int num;

	@Override
	public int encriptar(int parametro) {
		// TODO Auto-generated method stub
		return num-parametro;
	}

	@Override
	public int desencriptar(int parametro) {
		// TODO Auto-generated method stub
		return num+parametro;
	}

}
