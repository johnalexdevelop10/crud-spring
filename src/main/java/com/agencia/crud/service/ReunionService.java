package com.agencia.crud.service;

import com.agencia.crud.PersonRepository.ReunionRepository;
import com.agencia.crud.model.Reunion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReunionService {

    private final ReunionRepository reunionRepository;

    public ReunionService(ReunionRepository reunionRepository) {
        this.reunionRepository = reunionRepository;
    }


    //private static final List<Reunion> reuniones = new ArrayList<>();
    //static {
        //for (int i=0; i<9;i++){
            //reuniones.add(new Reunion(i, "Reunion"+i, ZonedDateTime.now().plusDays(i)));
            //Reunion reunion = new Reunion(i,"Reunion" + i, ZonedDateTime.now().plusDays(i));
            //for (int j = 0; j<i;j++){
                //reunion.addAsistente(new Personas(i+j,"nonbre"+ i+j,"apellido"+i+j));
            //}

            //reuniones.add(reunion);

       // }

    public List<Reunion> getAllReuniones(){
        return reunionRepository.findAll();
    }

}
