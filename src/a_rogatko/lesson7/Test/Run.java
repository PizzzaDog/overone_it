package a_rogatko.lesson7.Test;

import java.util.Scanner;

 public class Run {

    public static void start(){
        int rightAnswer = 0;
        Scanner scanner = new Scanner(System.in);
        Question q1 = new Question(); // Создание нового экземпляра класса через конструктор по умолчанию
        q1.predicate = "Сколько у собаки рук"; // Присваивание переменным экземпляра класса значений
        q1.var1 = "1";
        q1.var2 = "4";
        q1.answer=4;

        Question q2 = new Question();
        q2.predicate = "Сколько у собаки хвостов";
        q2.var1 = "1";
        q2.var2 = "4";
        q2.answer=1;

        Question q3 = new Question("Сколько спутников у земли?","1","2",1); // Создание экземпляра класса через конструктор с аргументами
        Question[] test = new Question[]{q1,q2,q3};
        for(Question vopros : test){ // Улучшенный цикл for (for each)

            System.out.println(vopros.predicate);
            System.out.println(vopros.var1);
            System.out.println(vopros.var2);

            int answer = scanner.nextInt();
            if(answer == vopros.answer){
                System.out.println("Yeeeeees");
                rightAnswer++;
            }else{
                System.out.println("Noooo");
            }



        }


        System.out.println("Вы ответили правильно на "+ rightAnswer + " вопросов из "+ test.length);
    }











}
