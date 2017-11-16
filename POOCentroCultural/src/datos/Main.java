package datos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libros libro1 = new Libros(15, "Cuento", "pepapi", 50);
		
		Discos disco1 = new Discos(54, "Depeche", "Mode", "Propia");
		
		Clientes cliente1 = new Clientes("25458455E", "José Antonio");
		Clientes cliente2 = new Clientes("25458455E", "José Antonio");

		
		cliente1.realizarPeticion("15/5/1998", "12/8/1999", disco1);
		cliente1.realizarPeticion("15/5/1998", "12/8/1999", disco1);
		cliente1.realizarPeticion("15/5/1998", "12/8/1999", disco1);
		cliente1.realizarPeticion("15/5/1998", "12/8/1999", disco1);
		cliente1.realizarPeticion("15/5/1998", "12/8/1999", disco1);
		cliente1.realizarPeticion("15/5/1998", "12/8/1999", disco1);
		cliente1.realizarPeticion("15/5/1998", "12/8/1999", disco1);
		cliente2.realizarPeticion("15/5/1998", "12/8/1999", disco1);

		}
}
