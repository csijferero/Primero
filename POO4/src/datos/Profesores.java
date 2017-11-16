package datos;

public class Profesores {
	
	public static void ponerNotas(Alumno a){
//		Asignatura as1 = a.getAsig1();
//		as1.setClasificacion(Math.random()*10);
		
		a.getAsig1().setCalificacion(Math.random()*10);
		a.getAsig2().setCalificacion(Math.random()*10);
		a.getAsig3().setCalificacion(Math.random()*10);
	}
	
	public static double calcularMedia(Alumno a){
		double nota1 = a.getAsig1().getCalificacion();
		double nota2 = a.getAsig1().getCalificacion();
		double nota3 = a.getAsig1().getCalificacion();
		
		return ((nota1 +nota2 +nota3)/3);
		
	}

}