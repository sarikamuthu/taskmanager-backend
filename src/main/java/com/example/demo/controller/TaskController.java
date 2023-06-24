package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;

@Controller
@RestController
public class TaskController {
    @Autowired
    private TaskService service;

    @PostMapping("/addTask")
    public String addTask(@RequestBody Task task){
        service.saveTask(task);
        return "Task added successfully !!";
    }

    @PostMapping("/addTasks")
    public List<Task> addTasks(@RequestBody List<Task> tasks){
        return service.saveTask(tasks);
    }

    @GetMapping("/tasks")
    public List<Task> findAllTask(){
        return service.getTask();
    }

    @GetMapping("/task/{id}")
    public Task findTaskById(@PathVariable int id){
        return service.getTaskById(id);
    }

    @GetMapping("/task/{title}")
    public Task findTaskByTitle(@PathVariable String title){
        return service.getTaskByTitle(title);
    }

    @PutMapping("/update")
    public Task updateTask(@RequestBody Task task){
        return service.updateTask(task);
    }

    @DeleteMapping("/delete/{id}")
    public List<Task> deleteTask(@PathVariable int id){
        service.deleteTask(id);
         return service.getTask();
    }
}
