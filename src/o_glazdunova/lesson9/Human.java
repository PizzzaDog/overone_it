package o_glazdunova.lesson9;

public class Human {
    private int age; //private-значит,что используется в только в этом классе Human,на другие классы не распространяется
    private static int maxAge;//static означает, что действие распространяется не на метод и не на объект,а на класс и не вызывается к объектам, а вызывается на класс. она будет одна единственная.

    public int getAge(){ //мы заблокировали (приватом) доступ к прямому полю age  и создали поле getAge,на которое можем ссылаться в других классах
        return age;  // int возращает интовское значение.
        //с помощью  get - назначаем  (задаем, устанавливаем) значение
        //с помощью  set - выводим (получаем) значения в другом классе
    }
    public void setAge(int age){ //void-ничего не возвращает, только назначает
        this.age = age;
    }
//Alt + Insert - выбираем,что нам нужно Get/Set
    public static int getMaxAge() {
        return maxAge;
    }

    public static void setMaxAge(int maxAge) {
        Human.maxAge = maxAge;
    }

    static void hello(){

    }


}
