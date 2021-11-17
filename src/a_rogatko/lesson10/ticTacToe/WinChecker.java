package a_rogatko.lesson10.ticTacToe;

//Проверка на победу
public class WinChecker {


    static char allCheck(char[][] field) {
        for (int i = 0; i < field.length; i++) {//в цикле перебираем ячейки игрового поля по горизонтали и вертикали
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2]) return field[i][0];
            if (field[0][i] == field[1][i] && field[1][i] == field[2][i]) return field[0][i];
        }

        if (field[1][1] == field[0][0] && field[1][1] == field[2][2]) return field[0][0];//проверяем ячейки по диагонали
        if (field[1][1] == field[2][0] && field[1][1] == field[0][2]) return field[1][1];//
        return 0;
    }
}
