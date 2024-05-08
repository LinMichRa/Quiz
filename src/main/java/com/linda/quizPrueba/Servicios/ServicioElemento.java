package com.linda.quizPrueba.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linda.quizPrueba.Entidades.Gato;
import com.linda.quizPrueba.Operaciones.OperacionesGato;
import com.linda.quizPrueba.Repositorios.RepositorioGato;

@Service
public class ServicioElemento implements OperacionesElemento{

    @Autowired
    private RepositorioElemento repositorioElemento;

    @Override
    public List<Elemento> listarElementos() {
        return repositorioElemento.findAll();
    }

    @Override
    public Elemento guardarElemento(Elemento elemento) {
        return repositorioElemento.save(elemento);
    }
    
}
