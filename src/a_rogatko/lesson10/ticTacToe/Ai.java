package a_rogatko.lesson10.ticTacToe;

public class Ai {
    //static char[][] forTest;
    static int[] result = {-1, -1};
    static char tmp;
    static char temp;
    static int j = 0;
    static int k = 0;
    static char[][] array1;
    static int[] check(char x, char o, char[][] array) {
        array1 = array.clone();
    for(int i = 0; i < 2; i++){
        if(i == 0 ){tmp = x;}else{tmp = o;}
        for(j = 0; j<array1.length; j++){

            for(k = 0; k<array1[j].length; k++){
                temp = array1[j][k];
              if(array1[j][k]==Field.empty)  {
                  array1[j][k]=tmp;

              if(WinChecker.allCheck(array)!=0){
                  result[0]=j;
                  result[1]=k;
return result;
              }array1[j][k]=temp;




            }

        }



        }



    }


        return result;
    }
}





