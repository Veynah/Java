package bs_storm.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ToDoItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    private String description;

    private boolean complete;
}
