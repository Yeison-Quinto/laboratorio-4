package com.colegio.demo.model;



import com.colegio.demo.entity.Alumno;
import com.colegio.demo.entity.Curso;
import com.colegio.demo.entity.Materia;
import com.colegio.demo.entity.Profesor;

public class Mcurso {
		
	public Mcurso() {
		
	}
	
	public Mcurso(Curso curso) {
		this.idC = curso.getIdC();
		this.nombreC = curso.getNombreC();
		this.alumno = (Alumno) curso.getAlumno();
		this.materia = (Materia) curso.getMateria();
		this.profesor = curso.getProfesor();		
	}
	
	public Mcurso(long idC, String nombreC, Alumno alumno, Materia materia, Profesor profesor) {
		this.idC = idC;
		this.nombreC = nombreC;
		this.alumno = alumno;
		this.materia = materia;
		this.profesor = profesor;
	}
	
	private long idC;
	private String nombreC;
	private Alumno alumno;
	private Materia materia;
	private Profesor profesor;
	
	public long getIdC() {
		return idC;
	}
	public void setIdC(long idC) {
		this.idC = idC;
	}
	public String getNombreC() {
		return nombreC;
	}
	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
}
