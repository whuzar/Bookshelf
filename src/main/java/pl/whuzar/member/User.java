package pl.whuzar.member;

import jakarta.persistence.*;
import pl.whuzar.books.Book;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "User")
@Table(name = "user_bookshelf", uniqueConstraints = {@UniqueConstraint(name = "user_email_unique", columnNames = "email")})
public class User {

    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50, columnDefinition = "VARCHAR")
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50, columnDefinition = "VARCHAR")
    private String lastName;

    @Column(name = "age", nullable = false, length = 3)
    private Integer age;

    @Column(name = "email", nullable = false, length = 100, columnDefinition = "VARCHAR")
    private String email;

    @Column(name = "phone_number", nullable = false, length = 9)
    private Integer phoneNumber;

    @Column(name = "password", nullable = false, length = 100, columnDefinition = "VARCHAR")
    private String password;

    @Column(name = "user_name", nullable = false, length = 100, columnDefinition = "VARCHAR")
    private String userName;

    @Column(name = "roles", nullable = false, length = 100, columnDefinition = "VARCHAR")
    private String roles;

    @OneToMany(mappedBy = "user", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Book> bookList = new ArrayList<>();


    public User(String firstName, String lastName, Integer age, String email, Integer phoneNumber, String password, String userName, String roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
        this.roles = roles;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
