package v_kovalev.test_2.task_9;

public class Human {
    private String name;
    private int  age;

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

    public void sleep () {
        System.out.println("I want to sleep");
    }

    public String eat() {
        return "I need to eat";
    }
}
