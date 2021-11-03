package a_rogatko.lesson11.racing;

import a_rogatko.lesson11.racing.Constant.WheelType;
import a_rogatko.lesson11.racing.model.Car;
import a_rogatko.lesson11.racing.model.Engine;
import a_rogatko.lesson11.racing.model.Wheel;
import a_rogatko.lesson11.racing.service.CarService;

public class Main {
    public static void main(String[] args) {

        Wheel wheel = new Wheel(1500, WheelType.SPORT);
        Engine engine = new Engine(600);
        Car challenger = new Car(150, 1500, engine, wheel);

        Wheel wheel1 = new Wheel(1600, WheelType.SPORT);
        Engine engine1 = new Engine(700);
        Car camaro = new Car(160, 1520, engine1, wheel1);

        CarService service = new CarService();
        int timeOfCamaro = service.timeOfRace(camaro, 2000);
        int timeOfCalennger = service.timeOfRace(challenger, 2000);
        if (timeOfCamaro == timeOfCalennger) {
            System.out.println("Ничья");

        } else if (timeOfCamaro > timeOfCalennger) {
            System.out.println("challenger win");


        } else {
            System.out.println("camaro win");

        }
    }
}
