package com.example.respo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.respo4.model.Persona;

@Repository
public class PersonaRepository {
    List<Persona> personas = new ArrayList<>(); 
    public Persona create(Persona persona){
        personas.add(persona);
        return persona;
    }
    public List<Persona> readAll(){         //es un crud
        return personas;
    } 
}
