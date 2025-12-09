package com.example.spacestation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.spacestation.models.Coordinate;

@RestController
public class NavigationController {


    @GetMapping("/navigazione")
    public Coordinate ottieniPosizione() {
        return new Coordinate(45.0, 90.0);
    }
}