package com.agencia.crud.controller;

import com.agencia.crud.model.Reunion;
import com.agencia.crud.service.ReunionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reuniones")
public class ReunionRestController {
    private ReunionService reunionService;//para conseguir los datos

    public ReunionRestController(ReunionService reunionService) {
        this.reunionService = reunionService;
    }

    @GetMapping
    public List<Reunion> getAllReuniones(){
        return reunionService.getAllReuniones();
    }
//la lista la sacamos del servicio
}
