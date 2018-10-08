package com.colegio.demo.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.colegio.demo.entity.MateriasPorProfesor;

@Repository("repositorioMP")
public interface MateriasPorProfesorR extends JpaRepository<MateriasPorProfesor, Serializable> {

	public abstract MateriasPorProfesor findByIdMP(long IdMP);

}
