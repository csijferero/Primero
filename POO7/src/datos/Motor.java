package datos;

public class Motor {

	private int aceite;
	private int cv;

	public Motor(int cv) {
		this.cv = cv;
		this.aceite = 0;
	}

	public int getAceite() {
		return aceite;
	}

	public int getCv() {
		return cv;
	}

	public void setAceite(int aceite) {
		this.aceite = aceite;
	}

}
