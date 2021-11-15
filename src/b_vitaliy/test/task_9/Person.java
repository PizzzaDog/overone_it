package b_vitaliy.test.task_9;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce(){
        System.out.println("hello, my name is" + name);
    }
}
