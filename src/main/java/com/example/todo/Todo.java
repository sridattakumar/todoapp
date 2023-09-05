// Write your code here
package com.example.todo;

// import java.util.*;

public class Todo{
    private int todoId;
    private String todo;
    private String priority;
    private String status; 

    public Todo(int id, String todo, String priority, String status){
        this.todoId = id;
        this.todo = todo;
        this.priority = priority;
        this.status = status;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getToDo(){
        return todo;
    }

    public void setToDo(String todo){
        this.todo = todo;
    }

    public String getPriority(){
        return priority;
    }

    public void setPriority(String priority){
        this.priority = priority;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}