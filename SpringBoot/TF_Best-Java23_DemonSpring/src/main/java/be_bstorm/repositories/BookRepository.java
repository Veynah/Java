package be_bstorm.repositories;

import be_bstorm.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Il est devenu injectable grâce à ça(injection de dépendance)
public interface BookRepository extends JpaRepository<Book, Long> {
    // Extends JpaRepo permet d'avoir accès à toutes ces méthodes
    // CRUD classic et plus encore
    // C'est une interface générique qui prend en 1er argument
    // Le type de l'entité qu'il doit gérer
    // Et en deuxième le type de la colonne PK de cette entité
}
