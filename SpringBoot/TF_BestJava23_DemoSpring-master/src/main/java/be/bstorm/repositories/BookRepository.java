package be.bstorm.repositories;

import be.bstorm.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository sert rendre cette class injectable(injection de dependance)
@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    //Extends JpaRepository permet d'avoir acces a toutes ces methodes.
    //CRUD classic et plus encore
    //C'est une interface generique qui prend en 1er argument
    //Le type de l'entity qu'il doit gerer
    //Et en deuxieme le type de la colonne PK de cette entity

}
