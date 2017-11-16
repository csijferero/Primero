package datos;

public class Main {

	public static void main(String[] args) {
		Centralita c = new Centralita();
		
		Llamadas local = new LlamadaLocal("123", "456", 45);
		c.registrarLlamada(local);
		
		Llamadas provincial = new LlamadaProvincial("789", "963", 178, 2);
		c.registrarLlamada(provincial);
		
		System.out.println("Llamadas: " + c.getContador());
		System.out.println("Factura: " + c.getFacturado());
	}

}
