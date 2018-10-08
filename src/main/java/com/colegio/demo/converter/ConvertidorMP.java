package com.colegio.demo.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.colegio.demo.entity.MateriasPorProfesor;
import com.colegio.demo.model.MMateriasPorProfesor;

@Component("convertidorMP")
public class ConvertidorMP{	
	public List<MMateriasPorProfesor> convertirLista(List<MateriasPorProfesor> MateriasPorProfesor){
		List<MMateriasPorProfesor> mMateriasPorProfesor = new ArrayList<>();
		
		for(MateriasPorProfesor MateriasPorProfesors : MateriasPorProfesor) {
			mMateriasPorProfesor.add(new MMateriasPorProfesor(MateriasPorProfesors));
		}
		return mMateriasPorProfesor;
	}
}