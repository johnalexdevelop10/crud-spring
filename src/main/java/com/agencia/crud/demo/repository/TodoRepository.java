package com.agencia.crud.demo.repository;

import com.agencia.crud.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {

}
