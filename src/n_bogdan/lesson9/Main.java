package n_bogdan.lesson9;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Boolean asd = null;
        Human human2 = new Human();

        boolean asd2 = asd;
        if(null != human.check) {
            System.out.println("qwe");
        }

        human.setAge(10);
        human2.setAge(20);

        Human.setMaxAge(100);

        System.out.println(human.getAge());
    }
}
