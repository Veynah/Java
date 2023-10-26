package be_bstorm.services;

import be_bstorm.models.entities.Book;
import org.hibernate.mapping.List;

public interface BookService {

    void create(Book book);

    List findAll();
}
