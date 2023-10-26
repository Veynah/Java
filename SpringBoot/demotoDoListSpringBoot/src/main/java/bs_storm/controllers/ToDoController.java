package bs_storm.controllers;

import bs_storm.models.entities.ToDoItem;
import bs_storm.services.impl.ToDoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class ToDoController {
    private final ToDoServiceImpl toDoService;

    public ToDoController(ToDoServiceImpl toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping("/create")
    public String getCreate(TodoItem todoItem) {
        return "todo/create";
    }


