package pixel.academy.crud_app.entity;


import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    //definire cimpuri
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name ="first name")
    private String firstName;
    @Column(name ="last name")
    private String lastName;
    @Column(name ="email")
    private String email;
    //definire constructor
    public Student(){

    }
    public  Student(String firstName,String lastName,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }
    //definire geter si seteri

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;

    }
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return  lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    //definire metodei ()to string

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ",email='"  + email + '\'' + '}';
    }
}
