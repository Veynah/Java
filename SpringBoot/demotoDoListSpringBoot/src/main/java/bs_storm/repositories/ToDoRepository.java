package bs_storm.repositories;

import bs_storm.models.entities.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoItem, Long> {
    // Zeb
}
