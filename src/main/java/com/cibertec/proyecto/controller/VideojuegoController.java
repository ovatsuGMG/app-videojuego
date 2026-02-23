package com.cibertec.proyecto.controller;

import com.cibertec.proyecto.repository.VideojuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VideojuegoController {

    @Autowired
    private VideojuegoRepository repository;

    @GetMapping("/")
    public String listar(Model model) {
        // Obtenemos los datos de la tabla y los pasamos a la vista
        model.addAttribute("videojuegos", repository.findAll());
        return "index"; // Esto apunta a index.html
    }
}