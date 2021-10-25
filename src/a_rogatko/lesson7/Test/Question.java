package a_rogatko.lesson7.Test;



public class Question {
    String predicate; //Строка с вопросом
    String var1; //Строка с первым вариантом ответа
    String var2; //Строка со вторым вариантом ответа
    int answer; //Int c правильным ответом
    Question(){}; // Конструктор по умолчанию
    Question(String predicate,String var1,String var2, int answer){ //Конструктор
        this.predicate = predicate; // присваивание переменным класса значений из аргументов конструктора
        this.var1 = var1;
        this.var2 = var2;
        this.answer = answer;   //




    }


}
