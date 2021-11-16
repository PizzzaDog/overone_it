package viktor_sa.lesson10.racing;

import viktor_sa.lesson10.racing.constant.WheelType;
import viktor_sa.lesson10.racing.model.Car;
import viktor_sa.lesson10.racing.model.Engine;
import viktor_sa.lesson10.racing.model.Wheel;
import viktor_sa.lesson10.racing.service.CarService;

public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel(1000, WheelType.SPORT);
        Engine engine = new Engine(700);
        Car challenger = new Car(250,1000, engine, wheel);

        Wheel wheel2 = new Wheel(2000,WheelType.SPORT);
        Engine engine2 = new Engine(500);
        Car camaro = new Car(249,1500,engine2,wheel2);

        CarService service = new CarService();
        int timeOfCamaro = service.timeOfRace(camaro,20000);
        int timeOfChallenger = service.timeOfRace(challenger,20000);

        if (timeOfCamaro == timeOfChallenger) {
            System.out.println("Ничья!");
        } else if (timeOfCamaro < timeOfChallenger) {
            System.out.println("Камаро выйграл");
        } else {
            System.out.println("Челендер рулит");
        }

    }


}
