import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String family;
    private String name;
    private String surname;
    private LocalDate birthdate;

    public Person(String family, String name, String surname, LocalDate birthdate) {
        this.family = family;
        this.name = name;
        surname = surname;
        this.birthdate = birthdate;
    }
    public Person(String family, String name, String surname) {
        this.family = family;
        this.name = name;
        surname = surname;
    }

    public Person(String family, String name) {
        this.family = family;
        this.name = name;
    }

    public Person() {

    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        if (surname==null)
            return "";
        else
            return surname;
    }

    public void setSurname(String surname) {
        surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", birthdate=" +  birthdate+
                '}';
    }
}
