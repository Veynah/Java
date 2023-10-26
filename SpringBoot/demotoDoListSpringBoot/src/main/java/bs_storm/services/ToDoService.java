package bs_storm.services;

import bs_storm.models.entities.ToDoItem;

import java.util.List;


public interface ToDoService {
    void create(ToDoItem toDoItem);
    List<ToDoItem> findAll();
}
