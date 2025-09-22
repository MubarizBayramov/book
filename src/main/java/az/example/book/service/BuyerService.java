package az.example.book.service;

import az.example.book.entity.Book;
import az.example.book.exception.MyException;
import az.example.book.repository.BookRepository;

import az.example.book.response.ByBookResponse;
import org.springframework.stereotype.Service;


@Service
public class BuyerService {

    private final BookRepository bookRepository;

    public BuyerService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }



    public ByBookResponse giveBook(Long bookId){
        Book book =  bookRepository.findById(bookId)
                .orElseThrow(()->  new MyException("Book not found"));

        return new ByBookResponse(
               book.getId(),
                "Book given successfully",
                book.getName());

    }



    public ByBookResponse returnBook(Long bookId){
        Book book = bookRepository.findById(bookId)
        .orElseThrow(() -> new MyException("Book not found"));
        return new ByBookResponse(book.getId(), "Book returned successfully", book.getName());

    }
}


