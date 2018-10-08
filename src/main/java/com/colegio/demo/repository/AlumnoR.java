package com.colegio.demo.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.colegio.demo.entity.Alumno;

@Repository("repositorioA")
public interface AlumnoR extends JpaRepository<Alumno, Serializable> {

	public abstract Alumno findByIdA(long IdA);

}
