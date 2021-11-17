package n_bogdan.lesson10.racing.service;

import n_bogdan.lesson10.racing.model.Car;

public class CarService {
    public int timeOfRace(Car car, int distance) {
        int time;
        int speed =  (car.getEngine().getPower() * 100) / car.getWeight() ;

        if (car.getMaxSpeed() < speed) {
            speed = car.getMaxSpeed();
        }

        time = distance / speed;

        if (distance > car.getWheel().getMaxDistance()) {
            //Сколько раз мы должны заменить резину
            double wheelMaxDistance = car.getWheel().getMaxDistance();
            double doubleDistance = distance;
            /** Делим дистанцию гонки на макс. дист. резины и отнимаем 1
            *   Берем целое число.
             *   ЕСЛИ: остается остаток после запятой, плюсуем 1
             *   ЕСЛИ: остатка нет, оставляем наше целое
            */
            double countOfWheelChange = (doubleDistance / wheelMaxDistance - 1) ;

            // time += ...   то же самое что      time = time + ...
            time += countOfWheelChange * 15;
        }
        return time;
    }


}
