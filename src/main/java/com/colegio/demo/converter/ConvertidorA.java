package com.colegio.demo.converter;

import org.springframework.stereotype.Component;
import com.colegio.demo.entity.Alumno;
import com.colegio.demo.model.Malumno;
import java.util.ArrayList;
import java.util.List;


@Component("convertidorA")
public class ConvertidorA{	
	public List<Malumno> convertirLista(List<Alumno> alumno){
		List<Malumno> malumno = new ArrayList<>();
		
		for(Alumno alumnos : alumno) {
			malumno.add(new Malumno(alumnos));
		}
		return malumno;
	}
}
