package shkrob.lesson10;

public class Human {
    public int age;

    //Можно запихнуть кастомную логику
    public int getAge() {
        return age + 5;
    }

    //
    public void setAge(int age) {
        this.age = age;
    }
}
