// Write your code here
package com.example.todo;

import com.example.todo.Todo;
import java.util.*;

public interface TodoRepository{

    public ArrayList<Todo> getToDos();

    public Todo getToDoById(int id);

    public Todo addToDo(Todo todo);

    public Todo updateToDo(int id, Todo todo);

    public void deleteToDo(int id);
    
}