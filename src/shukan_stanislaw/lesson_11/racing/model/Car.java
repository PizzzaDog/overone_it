package shukan_stanislaw.lesson_11.racing.model;

public class Car {
    private int maxSpeed;
    private int weight;
    private Engine engine;
    private Wheel wheel;

//    Конструктор по умолчанию
//    public Car() {
//
//    }

    public Car(int maxSpeed, int weight, Engine engine, Wheel wheel) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.engine = engine;
        this.wheel = wheel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}