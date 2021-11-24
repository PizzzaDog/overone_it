package v_kovalev.test_2.task_8;

public class Human implements HumanFunction{
    private String name;
    private int age;

    @Override
    public void sleep() {
        System.out.println("8 hours later...");
    }

    @Override
    public String eat() {
        return "I need to eat";
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
