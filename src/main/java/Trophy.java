import Enums.Fish;

import java.io.Serializable;

public class Trophy implements Serializable {
    private Fish fish;
    private double length;
    private double weight;

    public Trophy(Fish fish, double length, double weight) {
        this.fish = fish;
        this.length = length;
        this.weight = weight;
    }

    public Fish getFish() {
        return fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
