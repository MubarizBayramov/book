package az.example.book.response;




public class BookSearchResponse {
    private String name;

    BookSearchResponse(){

    }
    public BookSearchResponse(String name){
        this.name= name;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
