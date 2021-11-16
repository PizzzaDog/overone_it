package n_bogdan.lesson9;

public class Human {
    private int age;
    private static int maxAge;
    Boolean check;


    //Можно запихнуть кастомную логику
    public int getAge() {
        return age;
    }

    //Можно запихнуть кастомную логику
    public void setAge(int age) {
        this.age = age;
    }

    public static int getMaxAge() {
        return maxAge;
    }

    public static void setMaxAge(int maxAge) {
        Human.maxAge = maxAge;
    }



    static void hello() {

    }
}
