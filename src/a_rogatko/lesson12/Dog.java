package a_rogatko.lesson12;

public class Dog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    Dog(String name, int age){
       this.name = name;
       this.age = age;


    }
}
