package pl.whuzar.member;

import jakarta.persistence.*;

@Entity(name = "Administrator")
@Table(name = "admin_bookshelf", uniqueConstraints = {@UniqueConstraint(name = "admin_email_unique", columnNames = "email")})
public class Administrator {

    @Id
    @SequenceGenerator(name = "admin_sequence", sequenceName = "admin_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "admin_sequence")
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

    public Administrator(String firstName, String lastName, Integer age, String email, Integer phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Administrator() {
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

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
