package com.linda.quizPrueba.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linda.quizPrueba.Entidades.Elemento;
import com.linda.quizPrueba.Operaciones.OperacionesElemento;
import com.linda.quizPrueba.Repositorios.RepositorioElemento;

@Service
public class ServicioElemento implements OperacionesElemento{

    @Autowired
    private RepositorioElemento repositorioElemento;

    @Override
    public List<Elemento> listarElementos() {
        return repositorioElemento.findAll();
    }

    @Override
    public Elemento guardarElementos(Elemento elemento) {
        return repositorioElemento.save(elemento);
    }
    
}
