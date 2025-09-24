package az.example.book.service;

import az.example.book.entity.Book;
import az.example.book.entity.Buyer;
import az.example.book.exception.MyException;


import az.example.book.repository.BookRepository;
import az.example.book.repository.BuyerRepository;
import az.example.book.response.BookSearchResponse;
import az.example.book.response.ByBookResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;



@Service

public class BuyerService {

    private final BookRepository bookRepository;
    private final BuyerRepository buyerRepository;

    public BuyerService(BookRepository bookRepository, BuyerRepository buyerRepository){
        this.bookRepository = bookRepository;
        this.buyerRepository = buyerRepository;
    }



    public ByBookResponse giveBook(Long buyerId, Long bookId){
        Buyer buyer = buyerRepository.findById(buyerId)
                .orElseThrow(() -> new MyException("Buyer not found"));
        Book book =  bookRepository.findById(bookId)
                .orElseThrow(()->  new MyException("Book not found"));

        return new ByBookResponse(
               book.getId(),
                "Book given successfully",
                book.getName());

    }



    public ByBookResponse returnBook(Long buyerId, Long bookId){
        Buyer buyer = buyerRepository.findById(buyerId)
                .orElseThrow(() -> new MyException("Buyer not found"));
                Book book = bookRepository.findById(bookId)
        .orElseThrow(() -> new MyException("Book not found"));
        return new ByBookResponse(book.getId(), "Book returned successfully", book.getName());

    }


    public List<BookSearchResponse> search(String name) {
        return bookRepository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(book -> new BookSearchResponse(book.getName()))
                .collect(Collectors.toList());
    }




}


