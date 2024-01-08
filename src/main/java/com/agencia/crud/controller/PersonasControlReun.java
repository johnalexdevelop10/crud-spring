package com.agencia.crud.controller;

import com.agencia.crud.model.Personas;
import com.agencia.crud.model.Reunion;
import com.agencia.crud.service.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonasControlReun {

     @Autowired
    PersonasService personasService;


    @GetMapping
    public String getAllPersonas(Model model){
        model.addAttribute("personas", personasService.getAllPersonas());
        return "personas";
    }





}
