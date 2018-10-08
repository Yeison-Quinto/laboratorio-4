package com.colegio.demo.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.colegio.demo.entity.Profesor;
import com.colegio.demo.model.Mprofesor;

@Component("convertidorP")
public class ConvertidorP{	
	public List<Mprofesor> convertirLista(List<Profesor>  profesor){
		List<Mprofesor> mprofesor = new ArrayList<>();
		
		for(Profesor profesors : profesor) {
			mprofesor.add(new Mprofesor(profesors));
		}
		return mprofesor;
	}
}