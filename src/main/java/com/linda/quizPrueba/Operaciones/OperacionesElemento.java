package com.linda.quizPrueba.Operaciones;

import java.util.List;

import com.linda.quizPrueba.Entidades.Elemento;

public interface OperacionesElemento {
    public List<Elemento> listarElementos();
    
    public Elemento guardarElementos(Elemento elemento);
}
