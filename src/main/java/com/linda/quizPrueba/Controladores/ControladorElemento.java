package com.linda.quizPrueba.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.linda.quizPrueba.Entidades.Elemento;
import com.linda.quizPrueba.Operaciones.OperacionesElemento;

@Controller
public class ControladorElemento {

    @Autowired
    private OperacionesElemento operacionesElemento;

    @GetMapping("/ListarElemento")
    public String listarElemento(Model modelo) {
        modelo.addAttribute("elemento", operacionesElemento.listarElementos());
        return "listaElemento";
    }
    
    @GetMapping("/nuevoElemento")
    public String mostrarFormularioElemento(Model modelo) {
        Elemento Elemento = new Elemento();
        modelo.addAttribute("Elementos", Elemento);
        return "registroElemento";
    }

    @PostMapping("/nuevoElemento")
    public String guardarElemento(@ModelAttribute("Elemento")Elemento Elemento) {
        operacionesElemento.guardarElementos(Elemento);
        return "redirect:/ListarGato";
    }
}
