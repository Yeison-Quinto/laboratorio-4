package com.colegio.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.io.Serializable;


@Table(name="Curso")
@Entity
public class Curso implements Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	
	public Curso() {
		
	}
	
	public Curso(long idC, String nombreC, List<Alumno> alumno, List<Materia> materia, Profesor profesor) {
		IdC = idC;
		this.nombreC = nombreC;
		this.alumno = alumno;
		this.materia = materia;
		this.profesor = profesor;
	}

	@GeneratedValue
	@Id
	@Column(name="ID_C")	
	private long IdC;
	
	@Column(name="NOMBRE_C")
	private String nombreC;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy	= "curso")
	private List<Alumno> alumno;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy	= "curso")
	private List<Materia> materia;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdP", nullable = false)
	private Profesor profesor;

	public long getIdC() {
		return IdC;
	}

	public void setIdC(long idC) {
		IdC = idC;
	}

	public String getNombreC() {
		return nombreC;
	}

	public void setNombreC(String nombreC) {
		this.nombreC = nombreC;
	}

	public List<Alumno> getAlumno() {
		return alumno;
	}

	public void setAlumno(List<Alumno> alumno) {
		this.alumno = alumno;
	}

	public List<Materia> getMateria() {
		return materia;
	}

	public void setMateria(List<Materia> materia) {
		this.materia = materia;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	
			
}
