package shkrob.lesson11.racing.service;

import shkrob.lesson11.racing.mobel.Car;

public class CarService {
    public int timeOfRace(Car car, int distance) {
        int time;
        int speed = car.getWeight() / car.getEngine().getPower() * 100;

        if (car.getMaxSpeed < speed) {
            speed = car.getMaxSpeed();
        }

        time = distance / speed;

        if (distance > car.getWheel().getMaxDistance()) {
            //Сколько раз мы должны заменить резину
            double wheelMaxDistance = car.getWheel().getMaxDistance();
            double doubDistance = distance;
            /**Делим дистанцию гонки на макс. дист. и
            int countWheelChange = distance / car.getWheel().getMaxDistance();

            double contOfWeeelChange = (doubDistance / wheelMaxDistance - 1);
        }
    }
}
