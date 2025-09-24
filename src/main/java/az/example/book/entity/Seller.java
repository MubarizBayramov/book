package az.example.book.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Book> books;

    public Seller() {}

    public Seller(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public List<Book> getBooks() { return books; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setBooks(List<Book> books) { this.books = books; }
}
