package com.colegio.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.colegio.demo.entity.Curso;
import com.colegio.demo.model.Mcurso;


@Component("convertidorC")
public class ConvertidorC{	
	public List<Mcurso> convertirLista(List<Curso> curso){
		List<Mcurso> mcurso = new ArrayList<>();
		
		for(Curso cursos : curso) {
			mcurso.add(new Mcurso(cursos));
		}
		
		return mcurso;
	}

}