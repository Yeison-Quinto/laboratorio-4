package com.colegio.demo.model;

import com.colegio.demo.entity.Materia;
import com.colegio.demo.entity.MateriasPorProfesor;
import com.colegio.demo.entity.Profesor;

public class MMateriasPorProfesor {

	public MMateriasPorProfesor() {
		
	}
	
public MMateriasPorProfesor(MateriasPorProfesor materiap) {
		this.IdMP = materiap.getIdMP();
		this.materia = materiap.getMateira();
		this.Profesor = materiap.getProfesor();
	}
	
	public MMateriasPorProfesor(long idMP, Materia materia, com.colegio.demo.entity.Profesor profesor) {
		this.IdMP = idMP;
		this.materia = materia;
		this.Profesor = profesor;
	}
	
	private long IdMP;
	private Materia materia;
	private Profesor Profesor;
	
	public long getIdMP() {
		return IdMP;
	}

	public void setIdMP(long idMP) {
		IdMP = idMP;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Profesor getProfesor() {
		return Profesor;
	}

	public void setProfesor(Profesor profesor) {
		Profesor = profesor;
	}
	
	
	
}
