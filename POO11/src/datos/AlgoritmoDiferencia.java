package datos;

public class AlgoritmoDiferencia implements Algoritmo {
	
	private int num;

	public AlgoritmoDiferencia(int num) {
		super();
		this.num = num;
	}

	@Override
	public int encriptar(int param) {
		// TODO Auto-generated method stub
		return num-param;
	}

	@Override
	public int desencriptar(int param) {
		// TODO Auto-generated method stub
		return num+param;
	}

}
