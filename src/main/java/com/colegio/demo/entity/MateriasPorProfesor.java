package com.colegio.demo.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="MateriasPorProfesor")
@Entity
public class MateriasPorProfesor implements Serializable { 
		
	
	private static final long serialVersionUID = 1;
		
	public MateriasPorProfesor() {
			
	}			
		
	public MateriasPorProfesor(long idMP, Materia mateira, com.colegio.demo.entity.Profesor profesor) {
		
		IdMP = idMP;
		this.materia = mateira;
		this.Profesor = profesor;
	}

	@GeneratedValue
	@Id
	@Column(name="ID_MateriaP")	
	private long IdMP;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdM", nullable = false)
	private Materia materia;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdP", nullable = false)
	private Profesor Profesor;

	public long getIdMP() {
		return IdMP;
	}

	public void setIdMP(long idMP) {
		IdMP = idMP;
	}

	public Materia getMateira() {
		return materia;
	}

	public void setMateira(Materia mateira) {
		this.materia = mateira;
	}

	public Profesor getProfesor() {
		return Profesor;
	}

	public void setProfesor(Profesor profesor) {
		Profesor = profesor;
	}
	
	
}
