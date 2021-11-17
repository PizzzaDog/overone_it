package o_glazdunova.lesson10.racing.model;

import o_glazdunova.lesson10.racing.constant.WheelType;

public class Wheel {private int maxDistance; //резина и ее максимальный пробег,максимальная дистанция  проезда на этой резине.
    private WheelType wheelType; // переход на класс с типами колес (спортивные или обычные)

// создаем конструктор для колес(резины)
    public Wheel(int maxDistance, WheelType wheelType) { //резина (максимальный проезд на резине, замена резины)
        this.maxDistance = maxDistance;
        this.wheelType = wheelType;
    }

    /**
     * С помощью alt + insert мы можем
     * сгенерировать Getter и Setter для полей
     */
    public int getMaxDistance() {
        return maxDistance;// возвращаем макс пробег резины
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public WheelType getWheelType() {
        return wheelType; //возвращаем замену резины
    }

    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }
}

