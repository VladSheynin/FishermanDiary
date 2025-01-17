/**
 * Класс Person - персона, используемая затем как основа для Рыбаков, Экспертов ....
 * @author Sheynin Vladislav
 */

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Person implements Serializable {
    /**
     * Фамилия
     */
    private String family;

    /**
     * Имя
     */
    private String name;

    /**
     * Отчество
     */
    private String surname;

    /**
     * Дата рождения в формате LocalDate
     */
    private LocalDate birthdate;

    /**
     * Дефолтный конструктор, необходимый для сериализации
     */
    public Person() {}

    /**
     * Полный конструктор (ФИО + дата рождения)
     * @param family
     * @param name
     * @param surname
     * @param birthdate
     */
    public Person(String family, String name, String surname, LocalDate birthdate) {
        this.family = family;
        this.name = name;
        surname = surname;
        this.birthdate = birthdate;
    }

    /**
     * Частичный конструктор (только ФИО)
     * @param family
     * @param name
     * @param surname
     */
    public Person(String family, String name, String surname) {
        this.family = family;
        this.name = name;
        surname = surname;
    }

    /**
     * Частичный конструктор (Фамилия и Имя)
     * @param family
     * @param name
     */
    public Person(String family, String name) {
        this.family = family;
        this.name = name;
    }

    /**
     * Метод возвращает фамилию Person-ы
     * @return family
     */
    public String getFamily() {
        return family;
    }

    /**
     * Метод устанавливает фамилию Person-ы
     * @param family
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * Метод возвращает имя Person-ы
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Метод устанавливает имя Person-ы
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод возвращает отчество Person-ы
     * @return surname
     */
    public String getSurname() {
        if (surname==null)
            return "";
        else
            return surname;
    }

    /**
     * Метод устанавливает отчество Person-ы
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Метод возвращает дату рождения Person-ы в формате LocalDate
     * @return birthdate
     */
    public LocalDate getBirthdate() {
        return birthdate;
    }

    /**
     * Метод устанавливает дату рождения Person-ы в формате LocalDate
     * @param birthdate
     */
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Метод переопределяет вывод информации по Person-е
     * @return строка описывающая Person
     */
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
