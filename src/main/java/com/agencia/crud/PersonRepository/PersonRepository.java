package com.agencia.crud.PersonRepository;

import com.agencia.crud.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Persona, Long> {

}
