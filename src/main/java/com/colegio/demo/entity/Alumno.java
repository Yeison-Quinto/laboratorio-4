package com.colegio.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="Alumno")
@Entity
public class Alumno implements Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;

	public Alumno() {
		
	}
	
	public Alumno(long idA, String apellidoA, String nombreA, String telefonoA, Curso curso) {
		IdA = idA;
		this.apellidoA = apellidoA;
		this.nombreA = nombreA;
		this.telefonoA = telefonoA;
		this.curso = curso;
	}

	@GeneratedValue
	@Id
	@Column(name="ID_A")	
	private long IdA;
	
	@Column(name="APELLIDO_A")
	private String apellidoA;
	
	@Column(name="NOMBRE_A")
	private String nombreA;
	
	@Column(name="TELEFONO_A")
	private String telefonoA;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdC", nullable = false)
	private Curso curso;

	public long getIdA() {
		return IdA;
	}

	public void setIdA(long idA) {
		IdA = idA;
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
	

