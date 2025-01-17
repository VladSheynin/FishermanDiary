/**
 * Класс Fisherman описывающий рыбака, расширяет класс Person
 * @author Sheynin Vladislav
 */

import Enums.FishermanTypes;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

    public class Fishrman extends Person implements Serializable {

        /**
         * Версия для использования при сериализации
         */
        private static final long  serialVersionUID = 2;

        /**
        * Общее количество рыбаков (статическая для анализа)
         */
        private static int number_of_fisherman=0;

        /**
        * Список доступных типов ловли
         */
        private List<FishermanTypes> fishermanTypes;

        /**
         * Список доступных трофеев
         */
        private List<Trophy> trophies;

        /**
         * Базовый конструктор (для сериализации)
         */
        private Fishrman() {
            super();
        }

        /**
         * Конструктор с полностью заполненными данными (ФИО и день рождения)
         * @param family - Фамилия
         * @param name - Имя
         * @param surname - Отчество
         * @param birthdate - дата рождения в формате LocalDate
         */
        public Fishrman(String family, String name, String surname, LocalDate birthdate) {
            super(family, name, surname, birthdate);
            number_of_fisherman++;
        }

        /**
         * Конструктор с частично заполненными данными (только ФИО)
         * @param family - Фамилия
         * @param name - Имя
         * @param surname - Отчество
         */
        public Fishrman(String family, String name, String surname) {
            super(family, name, surname);
            number_of_fisherman++;
        }

        /**
         * Конструктор с частично заполненными данными (только Фамилия и Имя)
         * @param family - Фамилия
         * @param name - Имя
        */
        public Fishrman(String family, String name) {
            super(family, name);
            number_of_fisherman++;
        }

        /**
         * Конструктор создающий рыбака из объекта Person
         * @param person - объект класса Person
         */
        public Fishrman(Person person) {
            super(person.getFamily(), person.getName(), person.getSurname(), person.getBirthdate());
            number_of_fisherman++;
        }

        /**
         * Метод возвращающий список типов ловли конкретного рыбака
         * @return fishermanTypes
         */
        public List<FishermanTypes> getFishermanTypes() {
            return fishermanTypes;
        }

        /**
         * Метод присваивающий рыбаку список типов ловли
         * @param fishermanTypes
         */
        public void setFishermanTypes(List<FishermanTypes> fishermanTypes) {
            this.fishermanTypes = fishermanTypes;
        }

        /**
         * Метод возвращающий список трофеев конкретного рыбака
         * @return trophies
         */
        public List<Trophy> getTrophies() {
            return trophies;
        }

        /**
         * Метод устанавливающий список трофеев конкретного рыбака
         * @param  trophies
         */
        public void setTrophies(List<Trophy> trophies) {
            this.trophies = trophies;
        }

        /**
         * Метод возвращающий количество рыбаков
         * @return number_of_fisherman
         */
        public static int getNumber_of_fisherman() {
            return number_of_fisherman;
        }

        /**
         * Переопределение метода toString возвращающее информацию по рыбаку
         * @return - строка описания конкретного рыбака
         */
        @Override
        public String toString() {
            String fishermanTypesToLine = new String();
            String trophiesToLine = new String();

            for (Trophy trophy1 : trophies) {
                trophiesToLine = trophiesToLine + trophy1.getFish() +", length ="+trophy1.getLength() +" , weight="+trophy1.getWeight() + "\n";
            }
            for (FishermanTypes fishermanTypes1 : fishermanTypes) {
                fishermanTypesToLine = fishermanTypesToLine + fishermanTypes1.name()+"\n";
            }

            return "Fishrman - " + this.getFamily()+ " "+ this.getName() +" " + this.getSurname()+"\n" +
                    "birthdate = " + getBirthdate() + "\n"+
                    "Fisherman types: "+ "\n" + fishermanTypesToLine +
                    "Trophies: " + "\n"+ trophiesToLine +
                    "__________________________________________";
        }
    }
