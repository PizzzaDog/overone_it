package n_bogdan.lesson9;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human();


        human.setAge(10);
        human2.setAge(20);

        Human.setMaxAge(100);

        System.out.println(human.getAge());
    }
}
