package dao;

import java.util.ArrayList;

import bean.Alumno;

public class AlumnoDAOImploArrayList implements AlumnoDAO {
	
	private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

	@Override
	public void anadir(Alumno a) throws AlumnoYaMatriculadoException, CursoCompletoException {
		if (buscar(a.getDni())!=null){
			if (alumnos.size()<40){
				alumnos.add(a);
			}
			else {
				throw new CursoCompletoException("40 alumnos ya matriculados");
			}
			
		} else{
			throw new AlumnoYaMatriculadoException("Alumno Ya Matriculado");
		}

	}

	@Override
	public Alumno buscar(String dni) {
		Alumno a = null;
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumnos.get(i).getDni().equalsIgnoreCase(dni)){
				a=alumnos.get(i);
			}
		}
		
		return a;
	}

	@Override
	public ArrayList<Alumno> ver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void imprimir(String nombrefichero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cargarDatos(String nombrefichero) {
		// TODO Auto-generated method stub

	}

}
