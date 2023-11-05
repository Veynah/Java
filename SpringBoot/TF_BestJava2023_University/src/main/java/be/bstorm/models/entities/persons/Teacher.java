package be.bstorm.models.entities.persons;

import be.bstorm.models.entities.Person;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@NoArgsConstructor @AllArgsConstructor
public class Teacher extends Person {

    @Column(nullable = false, length = 50)
    @Getter @Setter
    private String title;

    @Override
    public String toString() {
        return "Teacher{" +
                "title='" + title + '\'' +
                super.toString() +
                "}";
    }

    //@Override
    //public boolean equals(Object o) {
        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        //if (!super.equals(o)) return false;
        //Teacher teacher = (Teacher) o;
        //return Objects.equals(title, teacher.title);
    //}

    //@Override
    //public int hashCode() {
        //return Objects.hash(super.hashCode(), title);
    //}
}
