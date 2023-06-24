package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.TaskRepo;
import com.example.demo.entity.Task;
@Service
public class TaskService {
    @Autowired
    private TaskRepo repository;

    public Task saveTask(Task task){
       return repository.save(task);
    }

     public List<Task> saveTask(List<Task> tasks){
       return repository.saveAll(tasks);
    }

    public List<Task> getTask(){
        return repository.findAll();
    }
 
     public Task getTaskById(int id){
        return repository.findById(id).orElse(null);
    }

    public Task getTaskByTitle(String title){
        return repository.findByTitle(title);
    }

    public String deleteTask(int id){
        repository.deleteById(id);
        return "Task removed";
    }

    public Task updateTask(Task task){
  
        Task existingTask=repository.findById(task.getId()).orElse(null);
        existingTask.setTitle(task.getTitle());
        existingTask.setDescription(task.getDescription());
       // existingTask.setStatus(task.getStatus());
        return repository.save(existingTask);
    }

}
