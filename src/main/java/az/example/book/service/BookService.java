package az.example.book.service;

import az.example.book.entity.Book;
import az.example.book.response.BookResponse;
import az.example.book.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookResponse> getAllBooks() {
        List<BookResponse> responseList = new ArrayList<>();
        List<Book> books = bookRepository.findAll();

        for (Book book : books) {
            BookResponse response = new BookResponse();
            response.setId(book.getId());
            response.setName(book.getName());
            response.setAuthor(book.getAuthor());
            response.setPrice(book.getPrice());

            responseList.add(response);
        }

        return responseList;
    }
}
