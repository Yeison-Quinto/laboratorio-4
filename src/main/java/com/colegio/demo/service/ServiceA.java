package com.colegio.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.colegio.demo.converter.ConvertidorA;
import com.colegio.demo.entity.Alumno;
import com.colegio.demo.repository.AlumnoR;
import java.util.List;
import com.colegio.demo.model.Malumno;

@Service("servicioA")
public class ServiceA {
	
	@Autowired
	@Qualifier("repositorioA")
	private AlumnoR repositorioA;
	
	@Autowired
	@Qualifier("convertidorA")
	private ConvertidorA convertidorA;
	
	public boolean crear(Alumno alumno) {
		try {
			repositorioA.save(alumno);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean actualizar(Alumno alumno) {
		try {
			repositorioA.save(alumno);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean borrar(long IdA) {
		try {
			Alumno alumno = repositorioA.findByIdA(IdA);
			repositorioA.delete(alumno);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<Malumno> obterner(){
				return convertidorA.convertirLista(repositorioA.findAll());
	}
}
