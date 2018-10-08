package com.colegio.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.colegio.demo.converter.ConvertidorC;
import com.colegio.demo.entity.Curso;
import com.colegio.demo.model.Mcurso;
import com.colegio.demo.repository.CursoR;

public class ServiciosM {

	@Service("servicioM")
	public class ServiceM {
		
		@Autowired
		@Qualifier("repositorioM")
		private MateriaR repositorioM;
		
		@Autowired
		@Qualifier("convertidorC")
		private ConvertidorC convertidorC;
		
		public boolean crear(Curso curso) {
			try {
				repositorioC.save(curso);
				return true;
			}catch(Exception e) {
				return false;
			}
		}
		
		public boolean actualizar(Curso curso) {
			try {
				repositorioC.save(curso);
				return true;
			}catch(Exception e) {
				return false;
			}
		}
		
		public boolean borrar(long IdC) {
			try {
				Curso curso = repositorioC.findByIdC(IdC);
				repositorioC.delete(curso);
				return true;
			}catch(Exception e) {
				return false;
			}
		}
		
		public List<Mcurso> obterner(){
					return convertidorC.convertirLista(repositorioC.findAll());
		}
		
	}
}