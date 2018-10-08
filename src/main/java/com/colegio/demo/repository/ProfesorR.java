package com.colegio.demo.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.colegio.demo.entity.Profesor;

@Repository("repositorioR")
public interface ProfesorR extends JpaRepository<Profesor, Serializable> {

	public abstract Profesor findByIdP(long idP);
}
