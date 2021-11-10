package b_vitaliy.lesson11_homework.zoo;

public class Penguin {
    String name;
    Integer age;
    Integer speedOfSwimming;

    public Penguin(String name, Integer age, Integer speedOfSwimming) {
        this.name = name;
        this.age = age;
        this.speedOfSwimming = speedOfSwimming;
    }

    public Penguin(String name, Integer age) {
        this.name = name;
        this.age = age;
        setSpeedOfSwimming(30);
    }

    public Penguin(String name) {
        this.name = name;
        setAge(3);
        setSpeedOfSwimming(10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSpeedOfSwimming() {
        return speedOfSwimming;
    }

    public void setSpeedOfSwimming(Integer speedOfSwimming) {
        this.speedOfSwimming = speedOfSwimming;
    }
}
