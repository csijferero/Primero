package datos;

public class Encriptador {
	
	public int encriptarDeEncriptador(int param, Algoritmo a){
		return a.encriptar(param);
	}
	
	public int desencriptarDeEncriptador(int param, Algoritmo a){
		return a.desencriptar(param);
	}
	

}
