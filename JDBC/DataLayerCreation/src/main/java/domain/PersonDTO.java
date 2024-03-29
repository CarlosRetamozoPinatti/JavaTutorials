package domain;

/*
THIS CLASS WILL DEFINE THE ATTRIBUTES OF THE OBJECTS WE'LL USE/CREATE
 */

public class PersonDTO {
    private int idPerson;
    private String name;
    private String lastName;
    private String email;
    private String phone;

    public PersonDTO() {
    }

    public PersonDTO(int idPerson) {
        this.idPerson = idPerson;
    }

    public PersonDTO(String name, String lastName, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public PersonDTO(int idPerson, String name, String lastName, String email, String phone) {
        this.idPerson = idPerson;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
