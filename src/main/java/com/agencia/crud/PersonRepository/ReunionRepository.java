package com.agencia.crud.PersonRepository;

import com.agencia.crud.model.Reunion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReunionRepository extends JpaRepository <Reunion, Long> {

}
