package com.example.spacestations.controllers

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// Importo la classe delle coordinate
import com.example.spacestation.models.Coordinate;

/**
 * Questo controller gestisce le richieste relative alla navigazione
 */

//Questa classe gestisce richieste web
@RestController
public class NavigationController{
    //Questo metodo risponderà a una richiesta GET sull'indirizzo "/navigazione"
    @GetMapping("/navigazione");
    public Coordinate ottieniPosizione()
    {
        return new Coordinate(45.0, 90.0);
    }
}