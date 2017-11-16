package datos;

public class Segunda extends Primera {

	public int i;
	public int k;
	
	public Segunda(){
		
	}
	
	public Segunda(int valor1, int valor2){
		super.i = valor1;
		this.i = valor2;
	}

	public void mostrark() {
		System.out.println(k);
	}

	public void suma() {
		System.out.println("Suma: " + (i + j + k));
	}

}
