package shukan_stanislaw.lesson_17;

public class Door {
    private Integer weight;
    private Integer length;

    public Door(Integer weight, Integer length) {
        this.weight = weight;
        this.length = length;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
