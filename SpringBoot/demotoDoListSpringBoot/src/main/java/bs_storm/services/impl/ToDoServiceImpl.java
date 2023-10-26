package bs_storm.services.impl;

import bs_storm.models.entities.ToDoItem;
import bs_storm.repositories.ToDoRepository;
import bs_storm.services.ToDoService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ToDoServiceImpl implements ToDoService {
    private final ToDoRepository toDoRepository;

    public ToDoServiceImpl(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    @Override
    public void create(ToDoItem toDoItem) {
        toDoRepository.save(toDoItem);
    }

    @Override
    public List<ToDoItem> findAll() {
        return toDoRepository.findAll();
    }

    @Override
    public Optional<ToDoItem> findById(Long id) {
        return toDoRepository.findById(id);
    }

    // Autres méthodes...
}
