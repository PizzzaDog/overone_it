package v_kovalev.test_2.task_9;

public class Man extends Human {

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void sleep() {
        System.out.println("I want to sleep 15 hours");
    }
}
