package shukan_stanislaw.lesson_16;

class Dog {
    private String  name;
    private Long id;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Dog dog = (Dog) obj;
        return dog.age == this.age;
    }

    @Override
    public int hashCode() {
        return 10;
    }

}
