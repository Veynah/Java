package be_bstorm.controllers;

import be_bstorm.models.entities.Book;
import be_bstorm.services.impl.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    /*
    L'atttribut qui permettra de stocker l'instance réserver en BookServiceImpl
    Possible grace à l'annotation @Service
     */
    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    /*
    Injection par constructeur du BookSerficeImpl (Injection de dépendance)
     */

    @GetMapping("/book/create")
    public String getCreate(Model model){
        model.addAttribute("book", new Book());

        return "book/create";
    }

    @PostMapping("/book/crate")
    public String postCreate(@ModelAttribute Book book){
        bookService.create(book);
        return "redirect:/";
    }

    @GetMapping
    public String findAll() {
        List<Book> books = bookService.findAll();
        model.addAttribute("book", books);
        return "book/index";
    }
}
