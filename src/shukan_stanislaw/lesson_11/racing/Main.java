package shukan_stanislaw.lesson_11.racing;


import shukan_stanislaw.lesson_11.racing.constant.WheelType;
import shukan_stanislaw.lesson_11.racing.model.Car;
import shukan_stanislaw.lesson_11.racing.model.Engine;
import shukan_stanislaw.lesson_11.racing.model.Wheel;
import shukan_stanislaw.lesson_11.racing.service.CarService;

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

        Wheel wheel3 = new Wheel(5000,WheelType.SPORT);
        Engine engine3 = new Engine(600);
        Car supra = new Car(260,1200,engine3,wheel3);

        CarService service = new CarService();
        int timeOfCamaro = service.timeOfRace(camaro, 20000);
        int timeOfChallenger = service.timeOfRace(challenger, 20000);
        int timeOfSupra = service.timeOfRace(supra,20000);


        if (timeOfCamaro == timeOfChallenger) {
            System.out.println("НИЧЬЯ!!!!");
        } else if (timeOfCamaro < timeOfChallenger) {
            System.out.println("Camaro победил");
        } else {
            System.out.println("Challenger рулит");
        }

    }


}
