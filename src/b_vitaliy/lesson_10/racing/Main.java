package b_vitaliy.lesson_10.racing;

import b_vitaliy.lesson_10.racing.constant.WheelType;
import b_vitaliy.lesson_10.racing.model.Car;
import b_vitaliy.lesson_10.racing.model.Engine;
import b_vitaliy.lesson_10.racing.model.Wheel;
import b_vitaliy.lesson_10.racing.service.CarService;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel(1000, WheelType.SPORT);
        Engine engine1 = new Engine(450);
        Car challenger = new Car(250, 2500, engine1, wheel1);

        Wheel wheel2 = new Wheel(2000, WheelType.USUAL);
        Engine engine2 = new Engine(220);
        Car camaro = new Car(180, 1500, engine2, wheel2);

        CarService service = new CarService();
        int timeOfCamaro = service.timeOfRace(camaro, 20000);
        int timeOfChallenger = service.timeOfRace(challenger, 20000);

        if (timeOfCamaro == timeOfChallenger) System.out.println("НИЧЬЯ!!!");
        else if (timeOfCamaro < timeOfChallenger) System.out.println("camaro win");
        else System.out.println("challenger win");
    }
}
