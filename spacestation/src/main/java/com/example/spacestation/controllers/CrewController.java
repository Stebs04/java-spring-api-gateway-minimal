package com.example.spacestation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.spacestation.models.Astronauta;

@RestController
public class CrewController{
    // Le parentesi graffe {nome} indicano che questa parte cambia dinamicamente
    @GetMapping("/equipaggio/{nome}")
    public Astronauta getAstronauta(@PathVariable String nome){
        //Logica di simulazione di un db
        //Confronto la stringa con equals
        if(nome.equals("armstrong"))
        {
            return new Astronauta("Neil Armstrong", "Astronauta");
        } else if (nome.equals("aldrin")) {
            return new Astronauta("Buzz Aldrin", "Pilota");
        }
        //Caso di default
        else {
            return new Astronauta(nome, "Cadetto semplice");
        }
    }
}