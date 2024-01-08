package com.agencia.crud.service;

import com.agencia.crud.entities.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> obtenerTodas();

    Persona obtenerPersonaId(Long id);

    Persona crearPersona(Persona persona);//identida

    Persona actualizarPersona(Long id,Persona persona);

   public void eliminarPersona(Long id);

   long contarPersonas();
}
