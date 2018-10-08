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
import java.io.Serializable;
import java.util.List;


@Table(name="Materia")
@Entity
public class Materia implements Serializable { 
	
	private static final long serialVersionUID = 1;
	
	public Materia() {
		
	}
	
	public Materia(long idM, String nombreM, Curso curso, List<MateriasPorProfesor> materiaP) {
		IdM = idM;
		this.nombreM = nombreM;
		this.curso = curso;
		this.materiaP = materiaP;
	}

	@GeneratedValue
	@Id
	@Column(name="ID_M")
	private long IdM;
	
	@Column(name="NOMBRE_M")
	private String nombreM;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdC", nullable = false)
	private Curso curso;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy	= "materia")
	private List<MateriasPorProfesor> materiaP;

	public long getIdM() {
		return IdM;
	}

	public void setIdM(long idM) {
		IdM = idM;
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

	public List<MateriasPorProfesor> getMateriaP() {
		return materiaP;
	}

	public void setMateriaP(List<MateriasPorProfesor> materiaP) {
		this.materiaP = materiaP;
	}
	
	
	

}
