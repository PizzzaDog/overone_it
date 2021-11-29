package o_glazdunova.lesson10.racing.model;

public class Car { // ниже поля
    private int maxSpeed; //максимальная скорость машины
    private int weight; //вес
    private Engine engine;// двигатель
    private Wheel wheel;// колеса

//    Конструктор по умолчанию выглядит так:
//    public Car() {
//
//    }
    //он не задействует наши поля и создается автоматически даже если его не видно.
    //Если мы не создадим другой конструктор, с полями как нам надо. будет действовать конструктор по умолчанию.

    //Поэтому создаем коструктор с нашими полями
    public Car(int maxSpeed, int weight, Engine engine, Wheel wheel) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.engine = engine;
        this.wheel = wheel;
    }
// создаем get/set на все поля выше
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