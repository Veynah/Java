package be.bstorm.models.entities;

import be.bstorm.models.entities.persons.Student;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Entity
@ToString @EqualsAndHashCode
// Extend BaseRelation car on a ici une @EmbeddedId plutot qu'un @Id
// le type de cet @EmbeddedId et le type de la classe imbriquée (StudentCourseId)
// Nous faisons ceci dans le cas d'une many to mnay que l'on doit gérer manuellement
public class StudentCourse extends BaseRelation<StudentCourse.StudentCourseid> {

    // le many to many de base devient une double @ManyToOne
    @ManyToOne
    //MapId sert à mapper l'id composite
    // on dit que l'id du student devra etre stocké dans StudentCourseId(studentid)
    @Getter @Setter
    @MapsId("studentId")
    private Student student;

    // tout pareil que Student mais avec course
    @ManyToOne
    @Getter @Setter
    @MapsId("courseId")
    private Course course;

    @Getter @Setter
    @Column(nullable = false)
    private int year;

    @Embeddable
    public static class StudentCourseid implements Serializable {

        @Getter @Setter
        private String studentId;

        @Getter @Setter
        private String courseId;

    }
}
