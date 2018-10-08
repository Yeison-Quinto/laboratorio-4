package com.colegio.demo.model;

import com.colegio.demo.entity.Curso;
import com.colegio.demo.entity.Materia;
import com.colegio.demo.entity.MateriasPorProfesor;

public class Mmateria {
	
	public Mmateria() {
		
	}
	
	public Mmateria(Materia materia) {
		this.idM = materia.getIdM();
		this.nombreM = materia.getNombreM();
		this.curso = materia.getCurso();
		this.materiaP = (MateriasPorProfesor) materia.getMateriaP();
	}
	
	public Mmateria(long idM, String nombreM, Curso curso, MateriasPorProfesor materiaP) {
		
		this.idM = idM;
		this.nombreM = nombreM;
		this.curso = curso;
		this.materiaP = materiaP;
	}
		
	private long idM;
	private String nombreM;
	private Curso curso;
	private MateriasPorProfesor materiaP;
	
	public long getIdM() {
		return idM;
	}
	public void setIdM(long idM) {
		this.idM = idM;
	}
	public String getNombreM() {
		return nombreM;
	}
	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public MateriasPorProfesor getMateriaP() {
		return materiaP;
	}
	public void setMateriaP(MateriasPorProfesor materiaP) {
		this.materiaP = materiaP;
	}
	
	
	
}
