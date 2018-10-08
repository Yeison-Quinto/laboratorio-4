package com.colegio.demo.model;


import com.colegio.demo.entity.Curso;
import com.colegio.demo.entity.MateriasPorProfesor;
import com.colegio.demo.entity.Profesor;

public class Mprofesor {
	
	public Mprofesor() {
		
	}

	public Mprofesor(Profesor profesor) {
		this.idP = profesor.getIdP();
		this.apellidoP = profesor.getApellidoP();
		this.nombreP = profesor.getNombreP();
		this.telefonoP = profesor.getTelefonoP();
		this.curso = (Curso) profesor.getCurso();
		this.materiaP = (MateriasPorProfesor) profesor.getMateriaP();
	}
	
	public Mprofesor(long idP, String apellidoP, String nombreP, String telefonoP, Curso curso,
			MateriasPorProfesor materiaP) {
		this.idP = idP;
		this.apellidoP = apellidoP;
		this.nombreP = nombreP;
		this.telefonoP = telefonoP;
		this.curso = curso;
		this.materiaP = materiaP;
	}
	
	private long idP;
	private String apellidoP;
	private String nombreP;
	private String telefonoP;
	private Curso curso;
	private MateriasPorProfesor materiaP;
	
	public long getIdP() {
		return idP;
	}
	public void setIdP(long idP) {
		this.idP = idP;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	public String getTelefonoP() {
		return telefonoP;
	}
	public void setTelefonoP(String telefonoP) {
		this.telefonoP = telefonoP;
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


