package o_glazdunova.lesson10.racing;

import o_glazdunova.lesson10.racing.constant.WheelType;
import o_glazdunova.lesson10.racing.model.Car;
import o_glazdunova.lesson10.racing.model.Engine;
import o_glazdunova.lesson10.racing.model.Wheel;
import o_glazdunova.lesson10.racing.service.CarService;

public class Main {
    public static void main(String[] args) {
    //Создаем первую машинку
    Wheel wheel = new Wheel(1000, WheelType.SPORT); // резина (у нее есть макс пробег и тип(обычн или спорт))
    Engine engine = new Engine(600);// двигатель у него мощность
    Car challenger = new Car(250, 1000, engine, wheel);// новая машина(макс скорость, вес, двигатель, резина)

    //Создаем вторую машину аналогично первой
    Wheel wheel2 = new Wheel(2000, WheelType.SPORT);
    Engine engine2 = new Engine(500);
    Car camaro = new Car(249, 1500, engine2, wheel2);

    //
    CarService service = new CarService();
    int timeOfCamaro = service.timeOfRace(camaro, 20000);//за какое время проедит КАМАРО всю гонку
        //задаем модель машину и дистанцию в км
    int timeOfChallenger = service.timeOfRace(challenger, 20000); // и для Челенджер то же самое

// Если время Камаро = времени Челенджер- ничья
    if (timeOfCamaro == timeOfChallenger) {
        System.out.println("НИЧЬЯ!!!!");
    } else if (timeOfCamaro < timeOfChallenger) {
        System.out.println("Camaro победил");
    } else {
        System.out.println("Challenger рулит");
    }

}


}
