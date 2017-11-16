package datos;

public class Main {

	public static void main(String[] args) {
		
		Producto p1 = new Producto("C1", 24);
		Producto p2 = new Producto("H23", 234);
		Producto p3 = new Producto("M30", 109);
		
		Factura f1 = new Factura(1, p2);
		
		System.out.println(f1);
		
		p2.cambiarCodigo("K123");
		p2.cambiarPrecio(247);
		
		System.out.println(f1);
	}

}
