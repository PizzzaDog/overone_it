package viktor_sa.lesson10.racing.service;

import viktor_sa.lesson10.racing.model.Car;

public class CarService {
    public int timeOfRace(Car car, int distance) {
        int time;
        int speed = car.getWeight() / car.getEngine().getPower() * 100;
        if (car.getMaxSpeed() < speed) {
            speed = car.getMaxSpeed();
        }

        time = distance / speed;

        if (distance > car.getWheel().getMaxDistance()) {
            double wheelMaxDistance = car.getWheel().getMaxDistance();
            double doubleDistance = distance;
            double countOfWheelChange = doubleDistance / wheelMaxDistance -1;

            time += countOfWheelChange * 15;

        }
        return time;
    }

}
