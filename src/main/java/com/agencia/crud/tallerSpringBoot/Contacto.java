package com.agencia.crud.tallerSpringBoot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String nombre;
private LocalDate fechaNaciemiento;
private LocalDateTime  fechaRegistro;
}
//entity = viene de una tabla de la BD