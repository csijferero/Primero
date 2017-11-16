package datos;

public class Main {

	public static void main(String[] args) {
		
		Articulos soft1 = new Software('B', 130, "Windows", "SO");
		Articulos soft2 = new Software('B', 230, "Tetris", "PJ");
		
		Articulos hard1 = new Hardware('A', 400, "Tarjeta Video", false);
		Articulos hard2 = new Hardware('B', 100, "Impresora", true);
		
		System.out.println("Soft1: " + soft1);
		System.out.println("Soft2: " + soft2);
		System.out.println("Hard2: " + hard1);
		System.out.println("Hard2: " + hard2);
		
		
		System.out.println("Precio Soft1: " + soft1.calcularPrecio() + "€");
		System.out.println("Precio Soft2: " + soft2.calcularPrecio() + "€");
		System.out.println("Precio Hard2: " + hard1.calcularPrecio() + "€");
		System.out.println("Precio Hard2: " + hard2.calcularPrecio() + "€");
		
		
	}

}
