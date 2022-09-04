package com.xinda.springboot.myfirstwebapp.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    private TodoService todoService;

    @RequestMapping("list-todos")
    public String ListAllTodos(ModelMap model) {
        String name = (String) model.get("name");
        logger.error(name);
        List<Todo> todos = this.todoService.findAllTodos(name);
        model.addAttribute("todos", todos);
        return "listTodos";
    }


    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showNewTodoPage() {
        return "todo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo(@RequestParam String description, ModelMap model) {
        String useranme = (String)model.get("name");
        todoService.addTodo(useranme, description, LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }
}
