package b_vitaliy.test.task_9;

public class Employee extends Person {

    private String job;
    public Employee(String name, String job) {
        super(name);
        this.job = job;
    }

    public void introduce(){
        System.out.println("hello, my name is" + name + " and i am an " + job);
    }

}
