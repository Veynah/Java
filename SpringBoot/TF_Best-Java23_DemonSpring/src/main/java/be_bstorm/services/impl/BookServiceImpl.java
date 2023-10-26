package be_bstorm.services.impl;

import be_bstorm.models.entities.Book;
import be_bstorm.repositories.BookRepository;
import be_bstorm.services.BookService;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    /*
    Attribut dans lequel on va stocker l'ainstance injectable de BookRepository
    Fonctionne grace à l'annotation @Repository
    * */
    private final BookRepository bookRepository; // On va faire une injection de dépendance pour ne pas faire de new
    // Injection via le contructeur de l'ainstance de BookRepository reservé en mémoire

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public void create(Book book) {
        /*
        Appel de la méthode contenu dans notre BookRepository
        Permet de créer l'enrigstrement en db
         */
        bookRepository.save(book);

    }
    @Override
    public List findAll() {
        return (List) bookRepository.findAll();
    }
}
