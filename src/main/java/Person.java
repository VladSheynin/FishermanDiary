import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String family;
    private String name;
    private String Surname;
    private LocalDate birthdate;

    public Person(String family, String name, String surname, LocalDate birthdate) {
        this.family = family;
        this.name = name;
        Surname = surname;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", birthdate=" +  birthdate+
                '}';
    }
}
