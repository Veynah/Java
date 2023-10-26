package bs_storm.services;

import bs_storm.models.entities.ToDoItem;

import java.util.List;
import java.util.Optional;


public interface ToDoService {
    void create(ToDoItem toDoItem);
    List<ToDoItem> findAll();
    Optional<ToDoItem> findById(Long id);

    void update(Long id, ToDoItem toDoItem);
    void delete(Long id);
    void complete(Long id);
}
