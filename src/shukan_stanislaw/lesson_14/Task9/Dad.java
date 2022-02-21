package shukan_stanislaw.lesson_14.Task9;

public class Dad {
   private String name;

    public Dad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("Мое имя" + getName());
    }
}
