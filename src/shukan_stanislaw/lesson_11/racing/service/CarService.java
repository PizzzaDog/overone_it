package shukan_stanislaw.lesson_11.racing.service;

import shukan_stanislaw.lesson_11.racing.model.Car;

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
            int wheelMaxDistance = car.getWheel().getMaxDistance();

            /** Делим дистанцию гонки на макс. дист. резины и отнимаем 1
             *   Берем целое число.
             *   ЕСЛИ: остается остаток после запятой, плюсуем 1
             *   ЕСЛИ: остатка нет, оставляем наше целое
             */
            int countOfWheelChange = (distance / wheelMaxDistance - 1) ;
            if(distance % wheelMaxDistance!=0)
                countOfWheelChange++;
            System.out.println(countOfWheelChange);

            // time += ...   то же самое что      time = time + ...
            time += countOfWheelChange * 15;
        }
        return time;
    }


}