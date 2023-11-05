package be.bstorm.models.entities.persons;

import be.bstorm.models.entities.Branch;
import be.bstorm.models.entities.Person;
import be.bstorm.models.entities.StudentCourse;
import be.bstorm.models.entities.embedded.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Student extends Person {

    @Override
    public String toString() {
        return "Student{ " + super.toString() + " }";
    }

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private Set<StudentCourse> studentCourseSet;

    @ManyToOne(fetch = FetchType.LAZY)
    //(cascade = CascadeType.PERSIST)
    @Getter @Setter
    private Branch branch;

    public Student() {
        super();
        this.studentCourseSet = new HashSet<>();
    }

    public Student(String firstname, String lastname, Address address, Set<StudentCourse> studentCourseSet, Branch branch) {
        // this() fait appel au constructeur vide de Student
        this();
        this.setAddress(address);
        this.studentCourseSet = studentCourseSet;
        this.branch = branch;
    }

    // principe de copie defensive, on prefere renvoyer une copie de la iste pour des raisons de securite
    public Set<StudentCourse> getStudentCoursesSet(){
        return Set.copyOf(this.studentCourseSet);
    }

    // etant donne quel e get renvoie une copie, on doit quand meme etre capable d'ajouter une lemenet o la liste
    public void addStudentCourse (StudentCourse studentCourse){
        this.studentCourseSet.add(studentCourse);
        studentCourse.setStudent(this);
    }

    // pareil pour la suppression
    public void removeStudentCourse(StudentCourse studentCourse){
        this.studentCourseSet.remove(studentCourse);
        // Quand on rajout l'inscription a l'étudiant on en profite pour rajouter l'étudiant à l'inscription
        studentCourse.setStudent(this);
    }
}
