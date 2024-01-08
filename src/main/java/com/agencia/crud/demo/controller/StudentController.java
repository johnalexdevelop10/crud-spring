package com.agencia.crud.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saludo")
public class StudentController {

    public String getHello(){
        return "hello world";
    }

}
