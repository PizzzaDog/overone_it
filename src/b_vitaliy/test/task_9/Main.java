package b_vitaliy.test.task_9;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mike");
        Employee employee = new Employee("Bob", "programmer");

        person.introduce();
        employee.introduce();
    }
}
