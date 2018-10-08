package com.colegio.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.colegio.demo.entity.Materia;
import com.colegio.demo.model.Mmateria;



@Component("convertidorM")
public class ConvertidorM{	
	public List<Mmateria> convertirLista(List<Materia> materia){
		List<Mmateria> mmateria = new ArrayList<>();
		
		for(Materia materias : materia) {
			mmateria.add(new Mmateria(materias));
		}
		return mmateria;
	}
}
