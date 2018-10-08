package com.colegio.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.colegio.demo.entity.Curso;

@Repository("repositorioC")
public interface CursoR extends JpaRepository<Curso, Serializable> {

	public abstract Curso findByIdC(long IdC);

}


