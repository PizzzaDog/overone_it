package shkrob.lesson11.racing.mobel;

public class Car {
   private int maxSpeed;
   private int weight;
   private Engine engine;
   private Wheel wheel;

   public Gar(int maxSpeed, int weight, int Engine engine, Wheel wheel) {

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
