package dao;

import java.util.ArrayList;

import bean.Alumno;

public interface AlumnoDAO {
	
	public void anadir(Alumno a) throws AlumnoYaMatriculadoException, CursoCompletoException;
	public Alumno buscar (String dni);
	public ArrayList<Alumno> ver();
	public void imprimir(String nombrefichero);
	public void cargarDatos (String nombrefichero);

}