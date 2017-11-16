package main;

import bean.Alumno;
import dao.AlumnoDAO;
import dao.AlumnoDAOImploArrayList;

public class Principal {

	public Principal() {
		AlumnoDAO alumnoDAO = new AlumnoDAOImploArrayList();
		
		Alumno a1 = new Alumno("Yo", "dir", "1R", 15846846);
		Alumno a2 = new Alumno("Yo", "dir", "0T", 56843153);

	}

}
