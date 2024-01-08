package com.agencia.crud.service;

import com.agencia.crud.PersonRepository.PersonaRepository;
import com.agencia.crud.entities.Persona;
import com.agencia.crud.model.Personas;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonasService {

 private final PersonaRepository personaRepository;//la interface

    public PersonasService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona>getAllPersonas(){
        return personaRepository.findAll();
    }
}
