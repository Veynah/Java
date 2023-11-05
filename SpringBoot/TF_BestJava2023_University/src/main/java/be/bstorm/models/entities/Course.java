package be.bstorm.models.entities;

import be.bstorm.models.entities.BaseEntity;
import be.bstorm.models.entities.persons.Teacher;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@ToString(of = {"name", "summary"}) @EqualsAndHashCode(of = {"name", "summary"})
@NoArgsConstructor @AllArgsConstructor
public class Course extends BaseEntity<String> {

    @Column(length = 50, nullable = false, unique = true)
    @Getter @Setter
    private String name;

    @Getter @Setter
    private String summary;

    // Si on voulait gérer la bidirectionnalité
    // @ManyToMany(mappedBy = "courses")
   // private Set<Branch>

    @ManyToOne(fetch = FetchType.EAGER)
    @Getter @Setter
    private Teacher teacher;
}
