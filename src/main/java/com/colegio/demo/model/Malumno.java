package com.colegio.demo.model;
import com.colegio.demo.entity.Alumno;
import com.colegio.demo.entity.Curso;

public class Malumno {
	
	public Malumno() {
		
	}
	
	public Malumno(Alumno alumno ) {
		this.idA = alumno.getIdA();
		this.apellidoA = alumno.getApellidoA();
		this.nombreA = alumno.getNombreA();
		this.telefonoA = alumno.getTelefonoA();
		this.curso = alumno.getCurso();
	}
	
	public Malumno(long idA, String apellidoA, String nombreA, String telefonoA, Curso curso) {
		this.idA = idA;
		this.apellidoA = apellidoA;
		this.nombreA = nombreA;
		this.telefonoA = telefonoA;
		this.curso = curso;
	}

	private long idA;
	private String apellidoA;
	private String nombreA;
	private String telefonoA;
	private Curso curso;
	
	
	public long getIdA() {
		return idA;
	}

	public void setIdA(long idA) {
		this.idA = idA;
	}

	public String getApellidoA() {
		return apellidoA;
	}

	public void setApellidoA(String apellidoA) {
		this.apellidoA = apellidoA;
	}

	public String getNombreA() {
		return nombreA;
	}

	public void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}

	public String getTelefonoA() {
		return telefonoA;
	}

	public void setTelefonoA(String telefonoA) {
		this.telefonoA = telefonoA;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	

	
	
	
	
}



	