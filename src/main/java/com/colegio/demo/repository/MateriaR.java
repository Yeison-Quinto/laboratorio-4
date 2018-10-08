package com.colegio.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.colegio.demo.entity.Materia;

@Repository("repositorioM")
public interface MateriaR extends JpaRepository<Materia, Serializable> {

	public abstract Materia findByIdM(long idM);

}
