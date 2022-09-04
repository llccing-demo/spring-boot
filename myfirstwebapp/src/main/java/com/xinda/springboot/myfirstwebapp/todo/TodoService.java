package com.xinda.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "llccing", "learn springboot", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "llccing", "learn k8s", LocalDate.now().plusYears(2), true));
        todos.add(new Todo(3, "llccing", "learn docker", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findAllTodos(String name) {
        return  todos.stream().filter(todo -> todo.username.equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    public void addTodo(String name, String description, LocalDate date, boolean isDone) {
        Todo todo = new Todo((int)todos.stream().count(), name, description, date, isDone);
        todos.add(todo);
    }
}

