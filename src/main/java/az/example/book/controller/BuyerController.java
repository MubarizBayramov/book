package az.example.book.controller;

import az.example.book.response.ByBookResponse;
import az.example.book.service.BuyerService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyerController {

    private final BuyerService buyerService;

    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @GetMapping("/buyers/giveBook/{bookId}")
    public ByBookResponse giveBook(@PathVariable Long bookId) {
        return buyerService.giveBook(bookId);
    }


    @DeleteMapping
public ByBookResponse returnBook(@PathVariable Long bookId){
        return buyerService.returnBook(bookId);
    }
}
