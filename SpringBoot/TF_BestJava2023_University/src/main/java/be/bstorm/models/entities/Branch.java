package be.bstorm.models.entities;

import be.bstorm.models.entities.BaseEntity;
import be.bstorm.models.entities.persons.Teacher;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@ToString(of = {"name"}) @EqualsAndHashCode(of = {"name"})
public class Branch extends BaseEntity<String> {

    @Column(length = 50, nullable = false, unique = true)
    @Getter @Setter
    private String name;

    // cette annotation cree bel et bien une table intermediaire en DB
    @ManyToMany(fetch = FetchType.LAZY)
    //@JoinTable(name = "toto",
    //joinColumns = @JoinColumn(name = "jc"),
    //inverseJoinColumns = @JoinColumn(name = "ijc"))
    private Set<Course> courses;

    public Branch(){
        this.courses = new HashSet<>();
    }

    public Set<Course> getCourses() {
        return Set.copyOf(this.courses);
    }

    @OneToOne(fetch = FetchType.EAGER)
    @Getter @Setter
    private Teacher teacher;

    public void addCourse(Course course){
        this.courses.add(course);
        // dans le cas d'une bidirectionnalité
           // course.addBranch(this);
    }

    public void removeCourse(Course course){
        this.courses.remove(course);
        // dans le cas d'une bidirectionnalité
        // course.removeBranch(this);
    }

}
