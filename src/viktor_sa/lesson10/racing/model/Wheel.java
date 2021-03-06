package viktor_sa.lesson10.racing.model;

import viktor_sa.lesson10.racing.constant.WheelType;

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

    public WheelType getWheelType() {
        return wheelType;
    }

    public void setWheelType(WheelType wheelType) {
        this.wheelType = wheelType;
    }
}
