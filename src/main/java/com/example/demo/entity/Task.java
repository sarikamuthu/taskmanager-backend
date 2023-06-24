package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="task")


public class Task {
    @Id
    @GeneratedValue

    // private int id;
    // private String title;
    // private String description;
    // private String status;
    
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    

    public Task(){this.id = 0;}

    public Task(int id, String title, String description, String status)
    {
        this.id = id;
        this.title = title;
        this.description = description;
       
    }

    public int getId(){ return this.id;}
    public String getTitle(){ return this.title;}
    public String getDescription(){ return this.description;}
    //public String getStatus(){ return this.status;}

    public void setId(int id){ this.id = id;}
    public void setTitle(String title){ this.title = title;}
    public void setDescription(String description){ this.description = description;}
   // public void setStatus(String status){ this.status = status;}    
    
}
