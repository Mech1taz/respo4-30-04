package com.example.respo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.respo4.model.Persona;

@Repository
public class PersonaRepository {
    List<Persona> personas = new ArrayList<>(); 

    PersonaRepository(){
        //Agregar las personas a la lista
        personas.add(new Persona(1, "21370593-8", "MechitaZ", "Poto", 21));
    }
    public Persona create(Persona persona){
        personas.add(persona);
        System.out.println(personas.toString());
        return persona;
    }
    public List<Persona> readAll(){         //es un crud
        return personas;
    } 
    public Persona read(int id){
        for(Persona persona: personas){
            if(persona.getId()==id){
                return persona;
            }
        }
        return null; //no retornará nada si no encuentra a la persona
    }
}
