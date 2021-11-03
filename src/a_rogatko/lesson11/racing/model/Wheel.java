package a_rogatko.lesson11.racing.model;

import a_rogatko.lesson11.racing.Constant.WheelType;

public class Wheel {
    private int maxDistance;
    private WheelType wheelType;

    public Wheel(int maxDistance, WheelType wheelType) {
        this.maxDistance = maxDistance;
        this.wheelType = wheelType;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }

    public WheelType getWheelType() {
        return wheelType;
    }
}
