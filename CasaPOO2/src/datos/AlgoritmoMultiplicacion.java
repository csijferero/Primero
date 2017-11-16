package datos;

public class AlgoritmoMultiplicacion implements Algoritmo {
	
	private int num;
	
	

	public AlgoritmoMultiplicacion(int num) {
		super();
		this.num = num;
	}

	@Override
	public int encriptar(int parametro) {
		// TODO Auto-generated method stub
		return parametro*num;
	}

	@Override
	public int desencriptar(int parametro) {
		// TODO Auto-generated method stub
		return parametro/num;
	}

}
