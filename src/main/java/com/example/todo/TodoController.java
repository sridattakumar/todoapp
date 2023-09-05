/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.todo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.todo.Todo;
import com.example.todo.TodoService;

@RestController
public class TodoController{
    TodoService todoservice = new TodoService();

    @GetMapping("/todos")
    public ArrayList<Todo> getToDos(){
        return todoservice.getToDos();
    }

    @GetMapping("/todos/{id}")
    public Todo getToDoById(@PathVariable("id") int id){
        return todoservice.getToDoById(id);
    }

    @PostMapping("/todos")
    public Todo addToDo(@RequestBody Todo todo){
        return todoservice.addToDo(todo);
    }

    @PutMapping("/todos/{id}")
    public Todo updateToDo(@PathVariable("id") int id, @RequestBody Todo todo){
        return todoservice.updateToDo(id, todo);
    }

    @DeleteMapping("todos/{id}")
    public void deleteToDo(@PathVariable("id") int id){
        todoservice.deleteToDo(id);
    }
}