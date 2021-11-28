package n_bogdan.lesson15;

class Dog {
    private Long id;
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    // Это плохо, не надо так
//    @Override
//    public boolean equals(Object obj) {
//        Dog dog = (Dog) obj;
//        return dog.age == this.age;
////        Object
//    }

//    @Override
//    public int hashCode() {
//        return 10;
//    }
}
