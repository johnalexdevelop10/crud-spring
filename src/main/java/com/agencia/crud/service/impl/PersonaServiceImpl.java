package com.agencia.crud.service.impl;

import com.agencia.crud.PersonRepository.PersonaRepository;
import com.agencia.crud.entities.Persona;
import com.agencia.crud.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonaServiceImpl implements PersonaService {


    @Autowired
    private PersonaRepository personaRepository; //utiliza sus metodos para interactuar con BD


    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public Persona obtenerPersonaId(Long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {//persona = identida y Persona = clase
        Persona personaBBDD = personaRepository.findById(id).orElse(null);
        if (personaBBDD !=null){
            personaBBDD.setNombre(persona.getNombre());
            personaBBDD.setEdad(persona.getEdad());
            return personaRepository.save(personaBBDD);
        }
        return null;
    }//IMPORTANTE LOGICA

    @Override
    public void eliminarPersona(Long id) {
     personaRepository.deleteById(id);
    }

    @Override
    public long contarPersonas() {
        return 0;
    }


}
//nota: service depende de repository