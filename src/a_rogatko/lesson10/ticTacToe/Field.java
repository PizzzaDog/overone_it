package a_rogatko.lesson10.ticTacToe;

public class Field {
    public char x = '+';//так у нас будет выглядеть крестик
    public char o = 'o';//а так нолик, их можно будет легко поменять на другие символы
    public static char empty = '*';//так будет выглядеть незанятая клетка
    char[][] field = new char[3][3];//собственно, игровое поле


    void fieldInit() {//заполняем массив, представляющий игровое поле символом "*"
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                pointSet(i + 1, j + 1, empty);
            }


        }

    }

    /*char[][] fieldReturn() { //не используется, оставлено для последующей модификации программы
        return field;
    } */

    void pointSet(int a, int b, char c) {
        field[a - 1][b - 1] = c;

    }

    char pointGet(int a, int b) {  //метод получения игровой ячейки
        return field[a - 1][b - 1];//


    }

    void fieldPrint() {
        System.out.println();
        System.out.print("  1 2 3"); //выводим на консоль игровое поле
        for (int i = 0; i < field.length; i++) {
            System.out.println();
            System.out.print(i + 1 + " ");
            for (int j = 0; j < field[i].length; j++) {

                System.out.print(field[j][i] + " ");

            }


        }
        System.out.println();
    }

}


