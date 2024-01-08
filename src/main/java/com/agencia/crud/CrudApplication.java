package com.agencia.crud;

import com.agencia.crud.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class CrudApplication  {




	@Autowired
	private PersonaService personaService;


	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);


		System.out.println("hola");
	}


/*
	@Override
	public void run(String... args) throws Exception {
     /*personaRepository.save(new Persona(1l,"jose",12,"ingeniero"));
		personaRepository.save(new Persona(2l,"div",14,"admon"));
		personaRepository.save(new Persona(3l,"labra",16,"carnicero"));
		personaRepository.save(new Persona(4l,"angel",18,"doctor"));*/


		//personaService.crearPersona(new Persona(6l,"gabi",23,"ing sofware"));
		//personaService.crearPersona(new Persona(7l,"yan",2,"sofware"));
		//personaService.crearPersona(new Persona(8l,"lali",24,"doctor"));
		//personaService.crearPersona(new Persona(9l,"mondragon",25,"ing electrico"));




		//mostrar el · de personsa
		//System.out.println("numero de personas de la tabla: " + personaRepository.count());

		//System.out.println("numero de personas de la tabla: " + personaService.contarPersonas());

		//mostrar la lista de personas
		//List<Persona> personas = personaRepository.findAll();
		       //List<Persona> personas = personaService.obtenerTodas();
				//personas.forEach(p -> System.out.println("nombre de la persona: " + p.getNombre()));
	//}
}
