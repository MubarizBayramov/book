package az.example.book.entity;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String author;
    private double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SELLER_ID")
    private Seller seller;

    public Book() {}

    public Book(Long id, String name, String author, double price, Seller seller) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.seller = seller;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public Seller getSeller() { return seller; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }
    public void setSeller(Seller seller) { this.seller = seller; }
}
