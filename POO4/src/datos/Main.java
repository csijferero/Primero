package datos;

public class Main {

	public static void main(String[] args) {
		Alumno yo = new Alumno(11, 12, 13);
		Alumno tu = new Alumno(new Asignatura(21), new Asignatura(22), new Asignatura(23));
		
		Profesores.ponerNotas(yo);
		Profesores.ponerNotas(tu);
		
		System.out.println("Media de Yo: " + Profesores.calcularMedia(yo));
		System.out.println("Media de Tu: " + Profesores.calcularMedia(tu));
	}
}