package com.xinda.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
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
        return  todos.stream().filter(todo -> todo.getUsername().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    public void addTodo(String name, String description, LocalDate date, boolean isDone) {
        int id = (int)todos.stream().count() + 1;
        Todo todo = new Todo(id, name, description, date, isDone);
        todos.add(todo);
    }

    public void deleteById(int id) {
//        todos.stream().dropWhile(todo -> todo.getId() == id).collect(Collectors.toList());
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Todo todo = todos.stream().filter(t -> t.getId() == id).findFirst().get();
        return todo;
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}

