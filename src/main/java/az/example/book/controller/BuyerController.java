package az.example.book.controller;

import az.example.book.response.BookSearchResponse;
import az.example.book.response.ByBookResponse;
import az.example.book.service.BuyerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/Buyers")
@RestController
public class BuyerController {

    private final BuyerService buyerService;

    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @GetMapping("/giveBook/{buyerId}/{bookId}")
    public ByBookResponse giveBook(@PathVariable Long buyerId, @PathVariable Long bookId) {
        return buyerService.giveBook(buyerId, bookId);
    }


    @DeleteMapping("/return/{buyerId}/{bookId}")
public ByBookResponse returnBook(@PathVariable Long buyerId, @PathVariable Long bookId){
        return buyerService.returnBook(buyerId, bookId);
    }

@GetMapping("/search")
    public List<BookSearchResponse> search(@RequestParam(required = false) String name){
return buyerService.search(name);
}


}
