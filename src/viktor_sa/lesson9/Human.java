package viktor_sa.lesson9;

public class Human {
    private int age;
    private static int maxAge;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getMaxAge() {
        return maxAge;
    }

    public static void setMaxAge(int maxAge) {
        Human.maxAge = maxAge;
    }
}
