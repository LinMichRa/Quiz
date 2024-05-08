package com.linda.quizPrueba.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.linda.quizPrueba.Entidades.Elemento;

@Repository
public interface RepositorioElemento extends JpaRepository<Elemento,Integer>{
    
}
