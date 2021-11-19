package b_vitaliy.lesson11_homework.zoo;

public class Racoon {
    String name;
    Integer age;
    Integer countOfCheckedBins;

    public Racoon(String name, Integer age, Integer countOfCheckedBins) {
        this.name = name;
        this.age = age;
        this.countOfCheckedBins = countOfCheckedBins;
    }

    public Racoon(String name, Integer age) {
        this.name = name;
        this.age = age;
        setCountOfCheckedBins(age*12);
    }

    public Racoon(String name) {
        this.name = name;
        setAge(5);
        setCountOfCheckedBins(age*8);
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

    public Integer getCountOfCheckedBins() {
        return countOfCheckedBins;
    }

    public void setCountOfCheckedBins(Integer countOfCheckedBins) {
        this.countOfCheckedBins = countOfCheckedBins;
    }
}
