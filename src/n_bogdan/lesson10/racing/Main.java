package n_bogdan.lesson10.racing;

import n_bogdan.lesson10.racing.constant.WheelType;
import n_bogdan.lesson10.racing.model.Car;
import n_bogdan.lesson10.racing.model.Engine;
import n_bogdan.lesson10.racing.model.Wheel;
import n_bogdan.lesson10.racing.service.CarService;

public class Main {
    public static void main(String[] args) {
        //Создаем первую машинку
        Wheel wheel = new Wheel(1000, WheelType.SPORT);
        Engine engine = new Engine(600);
        Car challenger = new Car(250, 1000, engine, wheel);

        //Создаем вторую
        Wheel wheel2 = new Wheel(2000, WheelType.SPORT);
        Engine engine2 = new Engine(500);
        Car camaro = new Car(249, 1500, engine2, wheel2);

        CarService service = new CarService();
        int timeOfCamaro = service.timeOfRace(camaro, 20000);
        int timeOfChallenger = service.timeOfRace(challenger, 20000);

        if (timeOfCamaro == timeOfChallenger) {
            System.out.println("НИЧЬЯ!!!!");
        } else if (timeOfCamaro < timeOfChallenger) {
            System.out.println("Camaro победил");
        } else {
            System.out.println("Challenger рулит");
        }

    }


}
