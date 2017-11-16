package datos3;

public class Rectangulo extends Figura {

	public Rectangulo(double dim2, double dim1) {
		super(dim2, dim1);
	}
	
	public double area(){
		return getDim1() * getDim2();
	}
	
	

}
