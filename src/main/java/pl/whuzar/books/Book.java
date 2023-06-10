package pl.whuzar.books;

import jakarta.persistence.*;
import pl.whuzar.member.User;

import java.sql.Timestamp;

@Entity(name = "Book")
@Table(name = "book", uniqueConstraints = {@UniqueConstraint(name = "isbn_unique", columnNames = "isbn")})
public class Book {

    @Id
    @SequenceGenerator(name = "book_sequence", sequenceName = "book_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "name", nullable = false, columnDefinition = "VARCHAR")
    private String name;

    @Column(name = "author", nullable = false, columnDefinition = "VARCHAR")
    private String author;

    @Column(name = "description", nullable = false, length = 1000, columnDefinition = "VARCHAR")
    private String description;

    @Column(name = "release_date", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Timestamp releaseDate;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Column(name = "isbn", nullable = false, columnDefinition = "VARCHAR")
    private String isbn;

    @Column(name = "category", nullable = false, columnDefinition = "VARCHAR")
    private String category;

    @ManyToOne
    @JoinColumn(name = "user_bookshelf_id", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "user_bookshelf_fk"))
    private User user;

    public Book(String name, String author, String description, Timestamp releaseDate, Integer amount, String isbn, String category) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.releaseDate = releaseDate;
        this.amount = amount;
        this.isbn = isbn;
        this.category = category;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Timestamp releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", releaseDate=" + releaseDate +
                ", amount=" + amount +
                ", isbn='" + isbn + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
