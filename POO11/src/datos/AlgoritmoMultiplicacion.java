package datos;

public class AlgoritmoMultiplicacion implements Algoritmo {
	
	private int num;

	public AlgoritmoMultiplicacion(int num) {
		super();
		this.num = num;
	}

	@Override
	public int encriptar(int param) {
		// TODO Auto-generated method stub
		return param*num;
	}

	@Override
	public int desencriptar(int param) {
		// TODO Auto-generated method stub
		return param/num;
	}

}
