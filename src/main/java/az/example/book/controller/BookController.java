package az.example.book.controller;

import az.example.book.response.BookResponse;
import az.example.book.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<BookResponse> getAllBooks() {
        return bookService.getAllBooks();
    }


}
