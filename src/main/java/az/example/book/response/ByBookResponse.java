package az.example.book.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ByBookResponse {

    private Long id;
    private String message;
    private String bookName;


    public ByBookResponse() {
    }

    public ByBookResponse(Long id, String message, String bookName) {
        this.id = id;
        this.message = message;
        this.bookName = bookName;
    }

}
