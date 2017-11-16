package datos;

public class Principal {

	public static void main(String[] args) {
		
		Jardineros j1 = new Jardineros("28594884R", 750);
		ComercialVisitante c1 = new ComercialVisitante("25958472Y", 1500);
		ComercialTelefonico c2 = new ComercialTelefonico("59847521V", 1200);
		
		j1.comienzaMes();
		c1.comienzaMes();
		c2.comienzaMes();
		
		j1.añadirDiaTrabajadoLejos();
		
		c1.añadirClienteConseguido();
		c2.añadirClienteConseguido();
		
		c1.añadirVisitaRealizada();
		
		System.out.println("Jardinero: " + j1.calculaSueldoMensual() + "€");
		System.out.println("Comercial Visitante: " + c1.calculaSueldoMensual() + "€");
		System.out.println("Comercial Telefónico: " + c2.calculaSueldoMensual() + "€");
		
		
	}

}
