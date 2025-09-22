package az.example.book.response;

public class ByBookResponse {

    private Long id;
    private String message;
    private String bookName;

    // Default constructor
    public ByBookResponse() {
    }

    // Parametrli constructor
    public ByBookResponse(Long id, String message, String bookName) {
        this.id = id;
        this.message = message;
        this.bookName = bookName;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getBookName() {
        return bookName;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
