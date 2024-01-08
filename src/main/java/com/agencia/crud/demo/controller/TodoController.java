package com.agencia.crud.demo.controller;


import com.agencia.crud.demo.repository.TodoRepository;
import com.agencia.crud.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired //inyecta el repo a la clase
    private TodoRepository todoRepository;

    @GetMapping(value = "/todo")
    public String HolaMundo(){
        return "PERRa";
    }

    @GetMapping(value = "/tasks")
    public List<Task> getTasks(){
        return todoRepository.findAll();
    }


    @PostMapping(value = "/savetask")//crear tareas
    public String saveTask(@RequestBody Task task){
        todoRepository.save(task);
        return "saved task";
    }

  @PutMapping(value = "/update/{id}")
    public String updateTask(@PathVariable long id, @RequestBody Task task){
        Task updatedTask = todoRepository.findById(id).get();
        updatedTask.setTitle(task.getTitle());
        updatedTask.setDescriptions(task.getDescriptions());
        todoRepository.save(updatedTask);
        return  "Update tasks";
  }

  @DeleteMapping(value = "delete/{id}")
    public String deleteTask(@PathVariable long id){
        Task deletedTask = todoRepository.findById(id).get();
        todoRepository.delete(deletedTask);
        return "delete tasks";
  }





}
