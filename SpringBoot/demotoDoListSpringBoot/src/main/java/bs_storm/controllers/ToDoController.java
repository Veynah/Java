package bs_storm.controllers;

import bs_storm.models.entities.ToDoItem;
import bs_storm.services.impl.ToDoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/todo")
public class ToDoController {
    private final ToDoServiceImpl toDoService;

    public ToDoController(ToDoServiceImpl toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping
    public String listTodos(Model model) {
        model.addAttribute("todos", toDoService.findAll());
        return "todo/list";
    }

    @GetMapping("/create")
    public String getCreate(Model model) {
        model.addAttribute("todoItem", new ToDoItem());
        return "todo/create";
    }

    @PostMapping("/create")
    public String postCreate(@ModelAttribute ToDoItem todoItem) {
        toDoService.create(todoItem);
        return "redirect:/todo";
    }

    @GetMapping("/edit/{id}")
    public String getEdit(@PathVariable Long id, Model model) {
        Optional<ToDoItem> todoItem = toDoService.findById(id);
        if (((Optional<?>) todoItem).isPresent()) {
            model.addAttribute("todoItem", todoItem.get());
            return "todo/edit";
        } else {
            // Gérer le cas où la tâche n'est pas trouvée
            return "redirect:/todo";
        }
    }


    @PostMapping("/edit/{id}")
    public String postEdit(@PathVariable Long id, @ModelAttribute ToDoItem todoItem) {
        toDoService.update(id, todoItem);
        return "redirect:/todo";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        toDoService.delete(id);
        return "redirect:/todo";
    }

    @GetMapping("/complete/{id}")
    public String complete(@PathVariable Long id) {
        toDoService.complete(id);
        return "redirect:/todo";
    }
}
