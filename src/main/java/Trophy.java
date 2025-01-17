/**
 * Класс Trophy - трофей (название рыбы, вес, длина)
 * @author Sheynin Vladislav
 */
import Enums.Fish;

import java.io.Serializable;

public class Trophy implements Serializable {

    /**
     * Поле название рыбы
     */
    private Fish fish;

    /**
     * Поле длина рыбы (метры,сантиметры)
     */
    private double length;

    /**
     * Поле вес рыбы (килограммы,граммы)
     */
    private double weight;

    /**
     * Полный конструктор
     * @param fish - наименование
     * @param length - длина
     * @param weight - вес
     */
    public Trophy(Fish fish, double length, double weight) {
        this.fish = fish;
        this.length = length;
        this.weight = weight;
    }

    /**
     * Метод возвращает объект Fish
     * @return fish
     */
   public Fish getFish() {
        return fish;
    }

    /**
     * Метод устанавливает значение объекта Fish
     * @param fish
     */
    public void setFish(Fish fish) {
        this.fish = fish;
    }

    /**
     * Метод возвращает значение длины рыбы
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * Метод устанавливает значение длины рыбы
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Метод возвращает значение веса рыбы
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Метод устанавливает значение веса рыбы
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
