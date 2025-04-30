package com.example.respo4.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.respo4.model.Persona;
import com.example.respo4.service.PersonaService;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;





@RequestMapping("/api/personas")
@RestController //devuelve datos :D por eso el Rest

public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping 
    public Persona postPersona(@RequestBody Persona persona){
        return personaService.guardarPersona(persona);
    }
    @GetMapping
    public List<Persona>getPersonas(){
        return personaService.listarPersonas();
    }
    @GetMapping("/{id}")
    public Persona getPersonaId(@PathVariable int id){
        return personaService.buscarxId(id);
    }
}
