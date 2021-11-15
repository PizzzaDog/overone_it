package shukan_stanislaw.lesson_14.Task9;

public class Son extends Dad{
    private String name;
    private int age;




    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Son(String name, int age) {
        super(name);
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("Мое имя: " + getName() + ", мой возраст: "+ getAge());
    }
}
