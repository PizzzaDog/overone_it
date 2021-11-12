package shkrob.lesson11.racing.mobel;

import shkrob.lesson11.racing.constant.WheelType;

public class Wheel {
    private int maxDistance;
    private WheelType wneelType;

    public Wheel(int maxDistance, WheelType wneelType) {
        this.maxDistance = maxDistance;
        this.wneelType = wneelType;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public WheelType getWneelType() {
        return wneelType;
    }

    public void setWneelType(WheelType wneelType) {
        this.wneelType = wneelType;
    }
}
