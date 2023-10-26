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

    @Override
    public void update(Long id, ToDoItem toDoItem) {
        ToDoItem existingItem = toDoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid todo ID: " + id));
        existingItem.setDescription(toDoItem.getDescription());
        existingItem.setComplete(toDoItem.isComplete());
        toDoRepository.save(existingItem);
    }

    @Override
    public void delete(Long id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public void complete(Long id) {
        ToDoItem toDoItem = toDoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid todo ID: " + id));
        toDoItem.setComplete(true);
        toDoRepository.save(toDoItem);
    }

}
