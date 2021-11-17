package n_bogdan.info;


/**
 * Классы:
 * 1. Всегда с большой буквы
 * 2. Если из 2+ слов, каждое следующее слово с большой буквы (CodeStyle, SomePeaceOfShit)
 * 3. Никаких _ - *
 */
public class CodeStyle {
    /**
     * Для констант:
     * CAPSLOCK все буквы
     * Слова разделяются _
     */
    private static final String NAME_OF_SOME_SHIT = "Bugaga";

    /**
     * Смысл такой же как для методов
     */
    private String name;
    private String nameOfSomeShit;

    /**
     * Методы:
     * 1. Всегда с маленькой буквы
     * 2. Если 2+ слов, каждое следующее с большой, но 1 С МАЛЕНЬКОЙ (method(), doSomeShit())
     * 3. Никаких _ - *
     */
    void method() {
    }
}
