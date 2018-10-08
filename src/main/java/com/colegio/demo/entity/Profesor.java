package com.colegio.demo.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="Profesor")
@Entity
public class Profesor implements Serializable { 
	
	private static final long serialVersionUID = 1;

	public Profesor() {
		
	}
	
	public Profesor(long idP, String apellidoP, String nombreP, String telefonoP, List<Curso> curso,
			List<MateriasPorProfesor> materiaP) {
		super();
		IdP = idP;
		this.apellidoP = apellidoP;
		this.nombreP = nombreP;
		this.telefonoP = telefonoP;
		this.curso = curso;
		this.materiaP = materiaP;
	}

	@GeneratedValue
	@Id
	@Column(name="ID_P")
	private long IdP;
	
	@Column(name="APELLIDO_P")
	private String apellidoP;
	
	@Column(name="NOMBRE_P")
	private String nombreP;
	
	@Column(name="TELEFONO_P")
	private String telefonoP;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy	= "profesor")
	private List<Curso> curso;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy	= "profesor")
	private List<MateriasPorProfesor> materiaP;

	public long getIdP() {
		return IdP;
	}

	public void setIdP(long idP) {
		IdP = idP;
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

	public List<Curso> getCurso() {
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}

	public List<MateriasPorProfesor> getMateriaP() {
		return materiaP;
	}

	public void setMateriaP(List<MateriasPorProfesor> materiaP) {
		this.materiaP = materiaP;
	}	
	
	
	
}
