package b_vitaliy.lesson_10.racing.service;

import b_vitaliy.lesson_10.racing.model.Car;

public class CarService {

    public int timeOfRace(Car car, int distance) {
        int time;
        int speed = car.getEngine().getPower() * 100 / car.getWeight();
        if (speed > car.getMaxSpeed()) {
            speed = car.getMaxSpeed();
        }

        int timeToChangeWheel;

        time = distance / speed;

        int countOfWheelChange = (distance / car.getWheel().getMaxDistance()) - 1;
        if (distance % car.getWheel().getMaxDistance() > 0) countOfWheelChange++;

        time += countOfWheelChange * 15;

        return time;

    }

}