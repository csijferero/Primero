package empresa;

public class Conversion {

	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;
		long l;
		
		System.out.println("Conversion de int a byte");
		b = (byte) i; //casting o conversion expl�cita
		//convierto el entero en tipo byte
		System.out.println("B: " + b + " I: " + i);
		
		System.out.println("Conversion de double a int");
		i=(int) d;
		System.out.println("D: " + d + " I: " + i);
		
		System.out.println("Conversion de int a long");
		l=i; //Casting o conversi�n impl�cita
		//En este caso el tipo de destino es m�s amplio que el tipo de origen. No hay problema
		//Adem�s los dos tipos son compatibles
		System.out.println("L: " + l + " I: " + i);

	}

}
